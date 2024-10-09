package kz.homebank.base.presentation.text

import android.content.Context
import androidx.annotation.StringRes

sealed interface UiText

class PlainText(val text: String) : UiText

class ResourceText(
    @StringRes val resId: Int,
    vararg val args: Any
) : UiText

fun UiText.asString(context: Context): String {
    return when (this) {
        is PlainText -> text
        is ResourceText -> context.getString(resId, args)
    }
}