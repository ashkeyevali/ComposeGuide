package kz.homebank.feature.payments.services.api.data

data class ServiceInfo(
    val serviceName: String,
    val serviceLocalizedName: String?,
    val hasTemplateView: Boolean,
    val providerId: Int,
    val isSuspend: Boolean,
    val isVisible: Boolean,
    val commission: Commission,
    val isSubscribable: Boolean,
    val openServiceBy: OpenServiceBy? = OpenServiceBy.DEFAULT
) {
    data class Commission(
        val type: Int,
        val info: List<Info>
    ) {
        data class Info(
            val value: Double?= null,
            val min: Double?= null,
            val max: Double?= null
        )
    }

    enum class OpenServiceBy(val value: String) {
        QR("QR"),
        DEFAULT("DEFAULT")
    }
}