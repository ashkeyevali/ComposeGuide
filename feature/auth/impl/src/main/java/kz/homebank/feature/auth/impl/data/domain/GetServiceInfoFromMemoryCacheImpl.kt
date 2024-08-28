package kz.homebank.feature.payments.services.impl.data.domain

import kz.homebank.feature.payments.services.api.data.ServiceInfo
import kz.homebank.feature.payments.services.api.use_case.GetServiceInfoFromMemoryCache
import kz.homebank.feature.payments.services.api.use_case.Param
import kz.homebank.feature.payments.services.impl.data.repository.PaymentServicesRepository
import javax.inject.Inject

internal class GetServiceInfoFromMemoryCacheImpl @Inject constructor(
    private val paymentServicesRepository: PaymentServicesRepository
): GetServiceInfoFromMemoryCache() {
    override suspend fun execute(param: Param): ServiceInfo? {
        val fieldsFilter = "name:${param.serviceName}|engineVersion:${param.engineVersion}"
        return paymentServicesRepository.getServiceInfoFromMemoryCache()
            .takeIf { it?.serviceName == param.serviceName }?:run {
                paymentServicesRepository.getServiceInfo(fieldsFilter).map().also {
                    paymentServicesRepository.setServiceInfoToMemoryCache(it)
                }
        }
    }
}