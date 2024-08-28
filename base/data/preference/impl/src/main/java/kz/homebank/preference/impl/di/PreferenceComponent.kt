package kz.homebank.preference.impl.di

import dagger.Component
import kz.homebank.preference.api.PreferenceApi
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [PreferenceDependencies::class],
    modules = [PreferenceProviderModule::class, PreferenceBinderModule::class]
)
internal interface PreferenceComponent : PreferenceApi {
    companion object {
        fun initAndGet(deps: PreferenceDependencies): PreferenceComponent {
            return DaggerPreferenceComponent.builder()
                .preferenceDependencies(deps)
                .build()
        }
    }
}
