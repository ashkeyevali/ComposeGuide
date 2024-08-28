package kz.homebank.libraries.kotlin.di

import dagger.Component
import kz.homebank.libraries.kotlin.api.KotlinApi
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [KotlinDependencies::class],
    modules = [CoroutineModule::class, SerializationModule::class, KotlinBinderModule::class]
)
internal interface KotlinComponent : KotlinApi {
    companion object {
        fun initAndGet(deps: KotlinDependencies): KotlinComponent {
            return DaggerKotlinComponent.builder()
                .kotlinDependencies(deps)
                .build()
        }
    }
}