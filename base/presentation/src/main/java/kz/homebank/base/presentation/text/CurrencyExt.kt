package kz.homebank.base.presentation.text

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale

fun formatAmount(amount: Double): String {
    val formatSymbols = DecimalFormatSymbols(Locale.ENGLISH)
    formatSymbols.decimalSeparator = '.'
    formatSymbols.groupingSeparator = ' '
    val df = DecimalFormat("###,###,##0.00", formatSymbols)
    var formatAmount = "0.00"
    formatAmount = try {
        df.format(amount)
    } catch (e: Exception) {
        return formatAmount
    }
    return formatAmount.replace("-", "–")
}

enum class Currency(val symbol: String) {
    USD("$"), EUR("€"), GBP("£"), RUB("\u20BD"), KZT("₸"), CHF("CHF"), CNY("¥"), AED("AED");

    companion object {
        fun find(value: String): Currency {
            return try {
                Currency.valueOf(value)
            } catch (ex: Exception) {
                KZT
            }
        }
    }
}