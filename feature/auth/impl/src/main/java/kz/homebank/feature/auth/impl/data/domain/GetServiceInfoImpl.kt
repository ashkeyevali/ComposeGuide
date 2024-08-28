package kz.homebank.feature.payments.services.impl.data.domain

import kz.homebank.feature.payments.services.api.data.ServiceInfo
import kz.homebank.feature.payments.services.api.use_case.GetServiceInfo
import kz.homebank.feature.payments.services.impl.data.repository.PaymentServicesRepository
import javax.inject.Inject

internal class GetServiceInfoImpl @Inject constructor(
    private val paymentServicesRepository: PaymentServicesRepository
): GetServiceInfo() {
    override suspend fun execute(param: String): ServiceInfo {
        return paymentServicesRepository.getServiceInfo(param).map().also {
            paymentServicesRepository.setServiceInfoToMemoryCache(it)
        }
    }
}