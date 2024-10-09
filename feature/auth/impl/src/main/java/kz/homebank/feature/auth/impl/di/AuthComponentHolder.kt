package kz.homebank.feature.auth.impl.di

import kz.homebank.feature.auth.api.AuthApi
import kz.homebank.module_injector.ComponentHolder
import kz.homebank.module_injector.SingletonComponentHolderDelegate

object AuthComponentHolder: ComponentHolder<AuthApi, AuthDependencies> {
    private val componentHolderDelegate = SingletonComponentHolderDelegate<
            AuthApi, AuthDependencies, AuthComponent> {
        AuthComponent.initAndGet(it)
    }

    override var dependencyProvider: (() -> AuthDependencies)?
            by componentHolderDelegate:: dependencyProvider

    override fun get(): AuthApi {
        return getComponent()
    }

    internal fun getComponent(): AuthComponent {
        return componentHolderDelegate.getComponentImpl()
    }

}