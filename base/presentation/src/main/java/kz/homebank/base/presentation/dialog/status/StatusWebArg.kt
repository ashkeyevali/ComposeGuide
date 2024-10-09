package kz.homebank.base.presentation.dialog.status

import android.os.Parcelable
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import kotlinx.parcelize.Parcelize

@Parcelize
class StatusWebArg(
    val header: String?,
    val link: String
) : Parcelable {
    companion object {
        const val EXTRA_STATUS_ARG = "status_arg"
    }
}