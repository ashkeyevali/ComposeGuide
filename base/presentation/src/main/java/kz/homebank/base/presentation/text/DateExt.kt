package kz.homebank.base.presentation.text

import java.text.SimpleDateFormat

/*
* yyyy-MM-dd'T'HH:mm:ss -> DD.MM.YEAR
*/
fun String.getDateComponents(): String {
    return try {
        val parts = this.split("T")[0].split("-")
        val (year, month, day) = parts
        "$day.${month.padStart(2, '0')}.$year"
    } catch (ex: Exception) {
        null
    }.orEmpty()
}

/*
* yyyy-MM-dd'T'HH:mm:ss -> 32454235432L
*/
fun String.toTimestamp(): Long {
    val inputFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
    val date = this.split("+").firstOrNull()?.let { inputFormat.parse(it) }
    return date?.time?.div(1000L) ?: 0L
}