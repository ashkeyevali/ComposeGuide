package kz.homebank.feature.payments.services.impl.di

import dagger.Binds
import dagger.Module
import kz.homebank.feature.payments.services.api.PaymentsServicesApi
import kz.homebank.feature.payments.services.api.use_case.GetServiceInfo
import kz.homebank.feature.payments.services.api.use_case.GetServiceInfoFromMemoryCache
import kz.homebank.feature.payments.services.impl.data.domain.GetServiceInfoFromMemoryCacheImpl
import kz.homebank.feature.payments.services.impl.data.domain.GetServiceInfoImpl

@Module
internal interface AuthBinderModule: AuthApi {
//    @Binds
//    fun bindGetServiceInfo(getServiceInfoImpl: GetServiceInfoImpl): GetServiceInfo
//
//    @Binds
//    fun bindGetServiceInfoFromMemoryCache(getServiceInfoFromMemoryCacheImpl: GetServiceInfoFromMemoryCacheImpl): GetServiceInfoFromMemoryCache
}