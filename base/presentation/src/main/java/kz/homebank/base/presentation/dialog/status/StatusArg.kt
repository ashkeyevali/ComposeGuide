package kz.homebank.base.presentation.dialog.status

import android.os.Parcelable
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import kotlinx.parcelize.Parcelize

@Parcelize
class StatusArg(
    val header: String?,
    @DrawableRes var ivRes: Int,
    val title: String,
    val subtitle: String,
    @StringRes val btnPrimaryRes: Int,
    @StringRes val btnSecondaryRes: Int? = null,
    val backBtnEnabled: Boolean = true
) : Parcelable {
    companion object {
        const val EXTRA_STATUS_ARG = "status_arg"
        const val RESULT_PRIMARY_BTN_CLICK = "primary_btn_click"
        const val RESULT_SECONDARY_BTN_CLICK = "secondary_btn_click"
    }
}