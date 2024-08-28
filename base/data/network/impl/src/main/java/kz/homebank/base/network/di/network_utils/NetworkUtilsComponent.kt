package kz.homebank.base.network.di.network_utils

import dagger.Component
import kz.homebank.base.network.api.network_utils.NetworkUtilsApi
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [NetworkUtilsDependencies::class],
    modules = [NetworkUtilsProviderModule::class, NetworkUtilsBinderModule::class]
)
internal interface NetworkUtilsComponent: NetworkUtilsApi {

    companion object {
        fun initAndGet(dependencies: NetworkUtilsDependencies): NetworkUtilsComponent {
            return DaggerNetworkUtilsComponent.builder()
                .networkUtilsDependencies(dependencies)
                .build()
        }
    }
}