package kz.beemobile.homebank.di.app

import dagger.Component
import kotlinx.coroutines.flow.MutableStateFlow

import kz.homebank.base.network.api.network_utils.NetworkConnection
import javax.inject.Singleton

@Singleton
@Component(
        dependencies = [AppDependencies::class]
)
interface AppComponent : AppApi {
    companion object {
        fun initAndGet(deps: AppDependencies): AppComponent {
            return DaggerAppComponent.builder()
                    .appDependencies(deps)
                    .build()
        }
    }

    val networkConnection: NetworkConnection

}