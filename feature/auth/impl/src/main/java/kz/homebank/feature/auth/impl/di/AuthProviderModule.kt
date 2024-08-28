package kz.homebank.feature.payments.services.impl.di

import dagger.Module
import dagger.Provides
import kz.homebank.base.android.constants.EnvironmentConstants
import kz.homebank.base.network.api.network_client.ApiServiceFactory
import kz.homebank.base.network.api.network_client.create
import kz.homebank.feature.payments.services.impl.data.repository.PaymentServicesApiService
import javax.inject.Named
import javax.inject.Singleton

@Module
internal object AuthProviderModule {
    @Provides
    @Singleton
    @Named("hbApiFullUrlV6")
    fun providePaymentServicesApiServiceV6(factory: ApiServiceFactory): PaymentServicesApiService {
        return factory.create(EnvironmentConstants.hbApiFullUrlV6)
    }
}