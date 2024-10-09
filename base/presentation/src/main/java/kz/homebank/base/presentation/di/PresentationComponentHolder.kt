package kz.homebank.base.presentation.di

import kz.homebank.module_injector.ComponentHolder
import kz.homebank.module_injector.ComponentHolderDelegate

object PresentationComponentHolder : ComponentHolder<PresentationApi, PresentationDependencies> {
    private val delegate = ComponentHolderDelegate<
            PresentationApi, PresentationDependencies, PresentationComponent> {
        PresentationComponent.initAndGet(it)
    }
    override var dependencyProvider: (() -> PresentationDependencies)? by delegate::dependencyProvider

    override fun get(): PresentationApi {
        return getComponent()
    }

    internal fun getComponent(): PresentationComponent {
        return delegate.getComponentImpl()
    }
}