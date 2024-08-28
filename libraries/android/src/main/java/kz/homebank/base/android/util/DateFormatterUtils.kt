package kz.homebank.base.android.util

import java.text.SimpleDateFormat
import java.util.Locale


fun String.formatToMMM(): String {
    return try {
        val oldFormat = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault())
        val parsedOldFormat = oldFormat.parse(this)
        val newFormat = SimpleDateFormat("dd MMM yyyy", Locale.getDefault())
        parsedOldFormat?.let(newFormat::format) ?: this
    } catch (ex: Exception) {
        this
    }
}
