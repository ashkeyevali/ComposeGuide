package kz.homebank.base.android.impl.di

import kz.homebank.base.android.api.AndroidApi
import kz.homebank.module_injector.ComponentHolder
import kz.homebank.module_injector.ComponentHolderDelegate

object AndroidComponentHolder : ComponentHolder<AndroidApi, AndroidDependencies> {
    private val componentHolderDelegate = ComponentHolderDelegate<
            AndroidApi, AndroidDependencies, AndroidComponent> {
                AndroidComponent.initAndGet(it)
    }

    override var dependencyProvider: (() -> AndroidDependencies)?
        by componentHolderDelegate::dependencyProvider

    override fun get(): AndroidApi {
        return getComponent()
    }

    internal fun getComponent(): AndroidComponent {
        return componentHolderDelegate.getComponentImpl()
    }
}