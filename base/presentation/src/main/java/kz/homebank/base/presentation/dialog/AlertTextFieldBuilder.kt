package kz.homebank.base.presentation.dialog

import android.content.Context
import android.content.res.ColorStateList
import android.view.LayoutInflater
import androidx.annotation.StringRes
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import kz.homebank.base.presentation.R
import kz.homebank.base.presentation.databinding.PresentationDialogEditTextAlertBinding

class AlertTextFieldBuilder {
    var tvTitleText: String? = null
    var hintText: String? = null
    var text: String? = null


    @StringRes
    private var btnPrimaryRes: Int = 0
    private var onPrimaryBtnClick: ((String) -> Unit)? = null

    @StringRes
    private var btnSecondaryRes: Int = 0
    private var onSecondaryBtnClick: (() -> Unit)? = null

    fun setPrimaryBtn(
        @StringRes btnPrimaryRes: Int,
        onBtnClick: ((String) -> Unit)? = null
    ) {
        this.btnPrimaryRes = btnPrimaryRes
        onPrimaryBtnClick = onBtnClick
    }

    fun setSecondaryBtn(
        @StringRes btnSecondaryRes: Int,
        onBtnClick: (() -> Unit)? = null,
    ) {
        this.btnSecondaryRes = btnSecondaryRes
        onSecondaryBtnClick = onBtnClick
    }

    fun build(context: Context): AlertDialog {
        val binding = PresentationDialogEditTextAlertBinding.inflate(
            LayoutInflater.from(context),
            null,
            false
        )

        val alert = AlertDialog.Builder(context)
            .setView(binding.root)
            .setCancelable(false)
            .show()

        with(binding) {
            tvTitle.text = tvTitleText
            valueInputLayout.hint = hintText
            valueEditText.setText(text)
            valueInputLayout.hintTextColor = ColorStateList.valueOf(
                ContextCompat.getColor(
                    context,
                    R.color.primaryColor
                )
            )
            btnPrimary.text = context.getString(btnPrimaryRes)
            btnPrimary.setOnClickListener {
                alert.dismiss()
                onPrimaryBtnClick?.invoke(valueEditText.text.toString())
            }

            if (btnSecondaryRes != 0) {
                btnSecondary.apply {
                    isVisible = true
                    text = context.getString(btnSecondaryRes)
                    setOnClickListener {
                        alert.dismiss()
                        onSecondaryBtnClick?.invoke()
                    }
                }
            }
        }
        return alert
    }
}