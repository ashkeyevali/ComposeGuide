package kz.homebank.base.presentation.ktx

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.Window
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import kz.homebank.base.presentation.R
import kz.homebank.base.presentation.dialog.AlertBuilder
import kz.homebank.base.presentation.dialog.AlertTextFieldBuilder
import java.io.Serializable

fun Fragment.showLoaderDialog() = Dialog(requireContext()).apply {
    val view: View = layoutInflater.inflate(R.layout.presentation_dialog_loading, null)
    requestWindowFeature(Window.FEATURE_NO_TITLE)
    window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    setContentView(view)
    setCancelable(false)
    show()
}

fun Fragment.showAlertDialog(builderAction: AlertBuilder.() -> Unit): AlertDialog {
    val builder = AlertBuilder()
    builder.builderAction()
    return builder.build(requireContext())
}

fun Fragment.showTextFieldAlertDialog(builderAction: AlertTextFieldBuilder.() -> Unit): AlertDialog {
    val builder = AlertTextFieldBuilder()
    builder.builderAction()
    return builder.build(requireContext())
}

fun Context.showAlertDialog(builderAction: AlertBuilder.() -> Unit): AlertDialog {
    val builder = AlertBuilder()
    builder.builderAction()
    return builder.build(this)
}

fun <T> Bundle.getSafeParcelableArgs(key: String, clazz: Class<T>): T? {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        this.getParcelable(key, clazz)
    } else {
        this.getParcelable(key)
    }
}

fun <T : Serializable> Bundle.getSafeSerializableExtra(key: String, clazz: Class<T>): T? {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        this.getSerializable(key, clazz)
    } else {
        this.getSerializable(key) as T
    }
}