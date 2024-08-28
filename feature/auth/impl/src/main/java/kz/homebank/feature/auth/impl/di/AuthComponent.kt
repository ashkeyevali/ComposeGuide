package kz.homebank.feature.payments.services.impl.di

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [AuthDependencies::class],
    modules = [AuthProviderModule::class, AuthBinderModule::class]
)

internal interface AuthComponent: AuthApi {
    companion object {
        fun initAndGet(dependencies: AuthDependencies): AuthComponent {
            return DaggerAuthComponent.builder()
                .authDependencies(dependencies)
                .build()
        }
    }
}