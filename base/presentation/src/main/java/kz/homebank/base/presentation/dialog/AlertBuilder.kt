package kz.homebank.base.presentation.dialog

import android.content.Context
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible
import kz.homebank.base.presentation.R


class AlertBuilder {
    @DrawableRes
    var ivRes: Int = 0
    var tvTitle: String? = null
    var tvSubtitle: String? = null

    @StringRes
    private var btnPrimaryRes: Int = 0
    private var onPrimaryBtnClick: (() -> Unit)? = null

    @StringRes
    private var btnSecondaryRes: Int = 0
    private var onSecondaryBtnClick: (() -> Unit)? = null

    fun setPrimaryBtn(
        @StringRes btnPrimaryRes: Int, onBtnClick: (() -> Unit)? = null
    ) {
        this.btnPrimaryRes = btnPrimaryRes
        onPrimaryBtnClick = onBtnClick
    }

    fun setSecondaryBtn(
        @StringRes btnSecondaryRes: Int, onBtnClick: (() -> Unit)? = null
    ) {
        this.btnSecondaryRes = btnSecondaryRes
        onSecondaryBtnClick = onBtnClick
    }

    fun build(context: Context): AlertDialog {
        val view = View.inflate(context, R.layout.presentation_dialog_alert, null)
        val alert = AlertDialog.Builder(context)
            .setView(view).
            setCancelable(false)
        val dialog = alert.create()
        dialog.window?.decorView?.setBackgroundResource(kz.homebank.libraries.resources.R.drawable.bg_alert_dialog_rounded)
        dialog.show()
        if (ivRes != 0) {
            view.findViewById<ImageView>(R.id.ivAlert).setImageResource(ivRes)
        }

        view.findViewById<TextView>(R.id.tvTitle).text = tvTitle
        if (!tvSubtitle.isNullOrEmpty()) {
            view.findViewById<TextView>(R.id.tvSubtitle).text = tvSubtitle
        }
        view.findViewById<Button>(R.id.btnPrimary).text = context.getString(btnPrimaryRes)
        view.findViewById<Button>(R.id.btnPrimary).setOnClickListener {
            dialog.dismiss()
            onPrimaryBtnClick?.invoke()
        }
        if (btnSecondaryRes != 0) {
            view.findViewById<Button>(R.id.btnSecondary).apply {
                isVisible = true
                text = context.getString(btnSecondaryRes)
                setOnClickListener {
                    dialog.dismiss()
                    onSecondaryBtnClick?.invoke()
                }
            }
        }
        return dialog
    }
}