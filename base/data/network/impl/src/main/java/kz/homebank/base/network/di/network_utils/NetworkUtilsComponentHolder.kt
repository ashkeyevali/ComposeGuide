package kz.homebank.base.network.di.network_utils

import kz.homebank.base.network.api.network_utils.NetworkUtilsApi
import kz.homebank.module_injector.ComponentHolder
import kz.homebank.module_injector.SingletonComponentHolderDelegate

object NetworkUtilsComponentHolder : ComponentHolder<NetworkUtilsApi, NetworkUtilsDependencies> {
    private val componentHolderDelegate = SingletonComponentHolderDelegate<
            NetworkUtilsApi, NetworkUtilsDependencies, NetworkUtilsComponent> {
        NetworkUtilsComponent.initAndGet(it)
    }

    override var dependencyProvider: (() -> NetworkUtilsDependencies)? by componentHolderDelegate::dependencyProvider

    override fun get(): NetworkUtilsApi {
        return componentHolderDelegate.getComponentImpl()
    }
}