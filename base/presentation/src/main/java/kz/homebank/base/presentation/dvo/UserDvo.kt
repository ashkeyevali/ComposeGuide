package kz.homebank.base.presentation.dvo

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserDvo(
    val iin: String,
    val fullName: String,
) : Parcelable