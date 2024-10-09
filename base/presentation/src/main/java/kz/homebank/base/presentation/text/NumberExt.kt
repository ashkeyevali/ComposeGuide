package kz.homebank.base.presentation.text

fun Double?.orZero(): Double {
    return this ?: 0.0
}

fun Long?.orZero(): Long {
    return this ?: 0L
}