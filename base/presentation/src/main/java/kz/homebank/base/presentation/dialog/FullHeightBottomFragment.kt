package kz.homebank.base.presentation.dialog

import android.app.Dialog
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.annotation.LayoutRes
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import kz.homebank.base.presentation.R

abstract class FullHeightBottomFragment(@LayoutRes layoutId: Int) : BaseBottomFragment(layoutId) {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.setOnShowListener {
            setupFullHeight(dialog as BottomSheetDialog)
            dialog.findViewById<FrameLayout>(com.google.android.material.R.id.design_bottom_sheet)?.let { bottomSheet ->
                val behavior = BottomSheetBehavior.from(bottomSheet)
                val inflatedView = dialog.findViewById<View>(R.id.inflatedView)
                behavior.peekHeight = 0
                behavior.state = BottomSheetBehavior.STATE_EXPANDED
                behavior.addBottomSheetCallback(
                    object : BottomSheetBehavior.BottomSheetCallback() {
                        override fun onSlide(bottomSheet: View, slideOffset: Float) {}

                        override fun onStateChanged(bottomSheet: View, newState: Int) {
                            if (newState == BottomSheetBehavior.STATE_DRAGGING &&
                                (inflatedView?.scrollY ?: 0) > 0) {
                                behavior.state = BottomSheetBehavior.STATE_EXPANDED
                            } else if (newState == BottomSheetBehavior.STATE_COLLAPSED ||
                                newState == BottomSheetBehavior.STATE_HALF_EXPANDED
                            ) {
                                dismiss()
                            }
                        }
                    })
            }
        }
        return dialog
    }

    private fun setupFullHeight(bottomSheetDialog: BottomSheetDialog) {
        val bottomSheet = bottomSheetDialog.findViewById<FrameLayout>(com.google.android.material.R.id.design_bottom_sheet)!!
        val layoutParams = bottomSheet.layoutParams as ViewGroup.LayoutParams

        val windowHeight = getWindowHeight()
        layoutParams.height = windowHeight
        bottomSheet.layoutParams = layoutParams
    }

    protected fun getWindowHeight(): Int {
        // Calculate window height for fullscreen use
        val displayMetrics = DisplayMetrics()
        activity?.windowManager?.defaultDisplay?.getMetrics(displayMetrics)
        return displayMetrics.heightPixels
    }
}