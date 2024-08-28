package kz.homebank.base.android.impl.di

import dagger.Component
import kz.homebank.base.android.api.AndroidApi
import javax.inject.Singleton

@Singleton
@Component(dependencies = [AndroidDependencies::class])
internal interface AndroidComponent : AndroidApi {

    val isTestEnvironment: Boolean

    companion object {
        fun initAndGet(deps: AndroidDependencies): AndroidComponent {
            return DaggerAndroidComponent.builder()
                .androidDependencies(deps)
                .build()
        }
    }
}