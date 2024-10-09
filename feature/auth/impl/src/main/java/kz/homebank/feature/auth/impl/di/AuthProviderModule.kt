package kz.homebank.feature.auth.impl.di

import dagger.Module
import dagger.Provides
import kotlinx.coroutines.flow.MutableStateFlow
import kz.homebank.base.android.constants.EnvironmentConstants
import kz.homebank.base.network.api.network_client.ApiServiceFactory
import kz.homebank.base.network.api.network_client.create
import kz.homebank.feature.payments.services.impl.data.model.AuthModel
import kz.homebank.feature.payments.services.impl.data.repository.AuthApiService
import javax.inject.Singleton

@Module
internal object AuthProviderModule {
    @Provides
    @Singleton
    fun providePaymentServicesApiService(factory: ApiServiceFactory): AuthApiService {
        return factory.create(EnvironmentConstants.movieDbApiUrl)
    }

    @Provides
    @Singleton
    fun provideTokenAndUserFlow(): MutableStateFlow<Pair<AuthModel?, String?>?> = MutableStateFlow(null)
}