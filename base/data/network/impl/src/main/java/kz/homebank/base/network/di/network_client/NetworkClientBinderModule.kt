package kz.homebank.base.network.di.network_client

import dagger.Binds
import dagger.Module
import kz.homebank.base.network.api.network_client.ApiServiceFactory
import kz.homebank.base.network.impl.ApiServiceFactoryImpl

@Module
internal interface NetworkClientBinderModule {
    @Binds
    fun bindApiServiceFactory(factory: ApiServiceFactoryImpl): ApiServiceFactory
}