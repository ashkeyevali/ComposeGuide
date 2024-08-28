package kz.homebank.base.network.exception

class ErrorResponseException(
    val httpCode: Int,
    val jsonResponse: String?
): Exception()