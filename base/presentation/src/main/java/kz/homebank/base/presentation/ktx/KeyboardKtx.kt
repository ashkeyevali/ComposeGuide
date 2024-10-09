package kz.homebank.base.presentation.ktx

import android.app.Activity
import android.content.Context
import android.view.View
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment

fun View.showKeyboard() = (this.context as? Activity)?.showKeyboard()
fun View.hideKeyboard() = (this.context as? Activity)?.hideKeyboard()

fun Fragment.showKeyboard() = activity?.showKeyboard()
fun Fragment.hideKeyboard() = activity?.hideKeyboard()

fun DialogFragment.showKeyboard() = dialog?.window?.let {
    WindowInsetsControllerCompat(it, it.decorView).show(WindowInsetsCompat.Type.ime())
}

fun DialogFragment.hideKeyboard() = dialog?.window?.let {
    WindowInsetsControllerCompat(it, it.decorView).hide(WindowInsetsCompat.Type.ime())
}

fun Context.showKeyboard() = (this as? Activity)?.showKeyboard()
fun Context.hideKeyboard() = (this as? Activity)?.hideKeyboard()

fun Activity.showKeyboard() = WindowInsetsControllerCompat(window, window.decorView).show(
    WindowInsetsCompat.Type.ime()
)

fun Activity.hideKeyboard() = WindowInsetsControllerCompat(window, window.decorView).hide(
    WindowInsetsCompat.Type.ime()
)
