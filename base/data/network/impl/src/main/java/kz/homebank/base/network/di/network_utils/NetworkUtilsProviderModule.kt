package kz.homebank.base.network.di.network_utils

import dagger.Module
import dagger.Provides
import kz.homebank.base.network.api.network_client.ApiServiceFactory
import kz.homebank.base.network.api.network_client.create
import kz.homebank.base.network.other_source.OtherSourceApiService
import kz.homebank.libraries.kotlin.api.event.SingleShotEvent
import javax.inject.Singleton

@Module
internal object NetworkUtilsProviderModule {
    @Singleton
    @Provides
    fun provideUnauthorizedEvent() = SingleShotEvent<Unit>()

    @Provides
    fun provideOtherSourceApiService(apiServiceFactory: ApiServiceFactory): OtherSourceApiService {
        // pass any base url because we define url on the call site
        return apiServiceFactory.create("https://example.com")
    }
}
