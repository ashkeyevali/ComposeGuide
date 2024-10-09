package kz.beemobile.homebank.di.app

import kz.homebank.module_injector.ComponentHolder
import kz.homebank.module_injector.ComponentHolderDelegate

object AppComponentHolder : ComponentHolder<AppApi, AppDependencies> {
    private val componentHolderDelegate = ComponentHolderDelegate<
            AppApi, AppDependencies, AppComponent> {
        AppComponent.initAndGet(it)
    }

    override var dependencyProvider: (() -> AppDependencies)?
        by componentHolderDelegate::dependencyProvider

    override fun get(): AppApi {
        return getComponent()
    }

    @JvmStatic
    fun getComponent(): AppComponent {
        return componentHolderDelegate.getComponentImpl()
    }
}