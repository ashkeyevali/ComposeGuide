package kz.homebank.feature.payments.services.impl.data.model

import kotlinx.serialization.Serializable
import kz.homebank.feature.payments.services.api.data.ServiceInfo

@Serializable
internal data class ServiceInfoDto(
    val serviceName: String,
    val serviceLocalizedName: String?,
    val hasTemplateView: Boolean,
    val providerId: Int,
    val isSuspend: Boolean,
    val isVisible: Boolean,
    val commission: CommissionDto,
    val isSubscribable: Boolean,
    val openServiceBy: String?
) {
    fun map() = ServiceInfo(
        serviceName = serviceName,
        serviceLocalizedName = serviceLocalizedName,
        hasTemplateView = hasTemplateView,
        providerId = providerId,
        isSuspend = isSuspend,
        isVisible = isVisible,
        commission = commission.mapCommission(),
        isSubscribable = isSubscribable,
        openServiceBy = ServiceInfo.OpenServiceBy.valueOf(openServiceBy ?: ServiceInfo.OpenServiceBy.DEFAULT.value)
    )

    fun mapMock() {
        if(serviceName == "ocityqr")

        ServiceInfo(
            serviceName = serviceName,
            serviceLocalizedName = serviceLocalizedName,
            hasTemplateView = hasTemplateView,
            providerId = providerId,
            isSuspend = isSuspend,
            isVisible = isVisible,
            commission = commission.mapCommission(),
            isSubscribable = isSubscribable,
            openServiceBy = ServiceInfo.OpenServiceBy.valueOf(
                openServiceBy ?: ServiceInfo.OpenServiceBy.DEFAULT.value
            )
        )
    }

    @Serializable
    data class CommissionDto(
        val type: Int,
        val info: List<InfoDto>
    ) {
        @Serializable
        data class InfoDto(
            val value: Double?=null,
            val min: Double?=null,
            val max: Double?= null
        ) {
            fun mapInfo() = ServiceInfo.Commission.Info(value, min, max)

        }
        private fun mapCommissionInfo(listInfo: List<InfoDto>) = listInfo.map {
            it.mapInfo()
        }
        fun mapCommission() = ServiceInfo.Commission(type = type, info = mapCommissionInfo(info))

    }
}
