package kz.homebank.preference.impl.di

import kz.homebank.module_injector.ComponentHolder
import kz.homebank.module_injector.SingletonComponentHolderDelegate
import kz.homebank.preference.api.PreferenceApi

object PreferenceComponentHolder : ComponentHolder<PreferenceApi, PreferenceDependencies> {
    private val componentHolderDelegate = SingletonComponentHolderDelegate<
            PreferenceApi, PreferenceDependencies, PreferenceComponent> {
        PreferenceComponent.initAndGet(it)
    }

    override var dependencyProvider: (() -> PreferenceDependencies)?
            by componentHolderDelegate::dependencyProvider

    override fun get(): PreferenceApi {
        return componentHolderDelegate.getComponentImpl()
    }

}