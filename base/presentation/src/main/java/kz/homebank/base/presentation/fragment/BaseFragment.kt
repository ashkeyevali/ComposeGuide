package kz.homebank.base.presentation.fragment

import android.annotation.SuppressLint
import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import kz.homebank.base.presentation.R
import kz.homebank.base.presentation.activity.ProtectScreenListener
import kz.homebank.base.presentation.dialog.AlertBuilder
import kz.homebank.base.presentation.ktx.disableProtectScreenCapture
import kz.homebank.base.presentation.ktx.enableProtectScreenCapture
import kz.homebank.base.presentation.ktx.showAlertDialog
import kz.homebank.base.presentation.ktx.showLoaderDialog


abstract class BaseFragment(@LayoutRes layoutId: Int) : Fragment(layoutId) {
    private var loader: Dialog? = null
    private var alert: AlertDialog? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setupToolbar()
    }

    override fun onDestroyView() {
        alert?.dismiss()
        hideLoader()
        super.onDestroyView()
    }

    override fun onStart() {
        super.onStart()
        if ((requireActivity() as? ProtectScreenListener)?.isProtectScreenFromSettings() == true && isProtectFragment()) {
            requireActivity().enableProtectScreenCapture()
        }
    }

    override fun onStop() {
        super.onStop()
        if (isProtectFragment()) {
            requireActivity().disableProtectScreenCapture()
        }
    }

    open fun isProtectFragment() = false

    private fun setupToolbar() {
        view?.findViewById<Toolbar>(R.id.toolbar)?.apply {
            (childFragmentManager.findFragmentByTag("navHostFragment") as? NavHostFragment)
                ?.let { navHost ->
                    val config = AppBarConfiguration.Builder()
                        .setFallbackOnNavigateUpListener {
                            requireActivity().finish()
                            true
                        }
                        .build()
                    val navController = navHost.navController
                    setupWithNavController(navController, config)
                }
        }
    }

    protected fun showLoader() {
        if (loader?.isShowing != true) {
            loader = showLoaderDialog()
        }
    }

    protected fun hideLoader() {
        loader?.dismiss()
    }

    fun showAlert(builderAction: AlertBuilder.() -> Unit) {
        if (alert == null || alert?.isShowing == false) {
            alert = showAlertDialog(builderAction)
        }
    }

    fun showToast(msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

    @SuppressLint("InternalInsetResource", "DiscouragedApi")
    fun getStatusBarHeight(): Int {
        var statusBarHeight = 0
        val resourceId = resources.getIdentifier("status_bar_height", "dimen", "android")
        if (resourceId > 0) {
            statusBarHeight = resources.getDimensionPixelSize(resourceId)
        }
        return statusBarHeight
    }
}