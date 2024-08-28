package kz.homebank.base.network.model
import androidx.annotation.Keep
import kotlinx.serialization.Serializable


@Keep
@Serializable
data class PaymentApiResponse<T>(
    val status: Int,
    val resultCode: Int?,
    val resultCodeDescription: String?,
    val value: PaymentResponseValue,
    val data: T?

) {
    @Serializable
    data class PaymentResponseValue(
        val successful: Boolean,
        val returnUrl: String?
    )

    val isSuccessful: Boolean = (status in 200..300 && value.successful && data != null)
}

class PaymentResponseException(
    val status: Int,
    val resultCode: Int?,
    val resultCodeDescription: String?,
    val value: PaymentApiResponse.PaymentResponseValue
    ): Exception()

