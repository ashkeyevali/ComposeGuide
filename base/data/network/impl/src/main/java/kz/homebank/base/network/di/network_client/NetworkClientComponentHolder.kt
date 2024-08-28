package kz.homebank.base.network.di.network_client

import kz.homebank.base.network.api.network_client.NetworkClientApi
import kz.homebank.module_injector.ComponentHolder
import kz.homebank.module_injector.SingletonComponentHolderDelegate

object NetworkClientComponentHolder : ComponentHolder<NetworkClientApi, NetworkClientDependencies> {
    private val componentHolderDelegate = SingletonComponentHolderDelegate<
            NetworkClientApi, NetworkClientDependencies, NetworkClientComponent> {
        NetworkClientComponent.initAndGet(it)
    }

    override var dependencyProvider: (() -> NetworkClientDependencies)? by componentHolderDelegate::dependencyProvider

    override fun get(): NetworkClientApi {
        return componentHolderDelegate.getComponentImpl()
    }
}