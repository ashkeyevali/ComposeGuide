package kz.homebank.base.presentation.ktx

import android.app.Activity
import android.view.WindowManager

fun Activity.disableProtectScreenCapture() {
    window.clearFlags(
        WindowManager.LayoutParams.FLAG_SECURE
    )
}

fun Activity.enableProtectScreenCapture() {
    window.addFlags(
        WindowManager.LayoutParams.FLAG_SECURE,
    )
}