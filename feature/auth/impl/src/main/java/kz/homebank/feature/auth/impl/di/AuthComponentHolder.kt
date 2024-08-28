package kz.homebank.feature.payments.services.impl.di

import kz.homebank.module_injector.ComponentHolder
import kz.homebank.module_injector.SingletonComponentHolderDelegate

object AuthComponentHolder: ComponentHolder<PaymentsServicesApi, PaymentsServicesDependencies> {
    private val componentHolderDelegate = SingletonComponentHolderDelegate<
            AuthApi, AuthDependencies, AuthComponent> {
        AuthComponent.initAndGet(it)
    }

    override var dependencyProvider: (() -> AuthDependencies)?
            by componentHolderDelegate:: dependencyProvider

    override fun get(): PaymentsServicesApi {
        return getComponent()
    }

    internal fun getComponent(): PaymentsServicesComponent {
        return componentHolderDelegate.getComponentImpl()
    }

}