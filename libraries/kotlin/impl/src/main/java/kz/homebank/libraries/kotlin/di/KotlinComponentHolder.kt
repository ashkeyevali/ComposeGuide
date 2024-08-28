package kz.homebank.libraries.kotlin.di

import kz.homebank.libraries.kotlin.api.KotlinApi
import kz.homebank.module_injector.ComponentHolder
import kz.homebank.module_injector.SingletonComponentHolderDelegate

object KotlinComponentHolder : ComponentHolder<KotlinApi, KotlinDependencies> {
    private val componentHolderDelegate = SingletonComponentHolderDelegate<
            KotlinApi, KotlinDependencies, KotlinComponent> {
        KotlinComponent.initAndGet(it)
    }

    override var dependencyProvider: (() -> KotlinDependencies)? by
        componentHolderDelegate::dependencyProvider

    override fun get(): KotlinApi {
        return componentHolderDelegate.getComponentImpl()
    }
}