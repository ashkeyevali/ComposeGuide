package kz.homebank.feature.payments.services.impl.data.repository

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import kz.homebank.base.network.api.network_utils.PaymentsNetworkCaller
import kz.homebank.feature.payments.services.api.data.ServiceInfo
import kz.homebank.feature.payments.services.impl.data.model.ServiceInfoDto
import kz.homebank.libraries.kotlin.api.coroutine.IoDispatcher
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

@Singleton
internal class AuthRepository @Inject constructor(
    @IoDispatcher private val ioDispatcher: CoroutineDispatcher,
    private val networkCaller: PaymentsNetworkCaller,
    @Named("hbApiFullUrlV6")
    private val paymentServicesApiServiceV6: PaymentServicesApiService
){
    private var serviceInfo: ServiceInfo? = null
    suspend fun getServiceInfo(
        fieldsFilter: String
    ): ServiceInfoDto = withContext(ioDispatcher) {
            networkCaller.apiCall {
                paymentServicesApiServiceV6.getServiceInfo(
                    fieldsFilter = fieldsFilter
                )
            }
        }

    fun getServiceInfoFromMemoryCache(): ServiceInfo? {
        return serviceInfo
    }

    fun setServiceInfoToMemoryCache(serviceInfo: ServiceInfo) {
        this.serviceInfo = serviceInfo
    }
}