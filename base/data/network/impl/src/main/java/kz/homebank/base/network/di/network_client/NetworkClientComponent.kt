package kz.homebank.base.network.di.network_client

import dagger.Component
import kz.homebank.base.network.api.network_client.NetworkClientApi
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [NetworkClientDependencies::class],
    modules = [NetworkClientProviderModule::class, NetworkClientBinderModule::class]
)
internal interface NetworkClientComponent : NetworkClientApi {

    companion object {
        fun initAndGet(deps: NetworkClientDependencies): NetworkClientComponent {
            return DaggerNetworkClientComponent.builder()
                .networkClientDependencies(deps)
                .build()
        }
    }
}
