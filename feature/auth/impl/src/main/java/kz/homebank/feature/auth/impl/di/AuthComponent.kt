package kz.homebank.feature.auth.impl.di

import dagger.Component
import kz.homebank.feature.auth.api.AuthApi
import kz.homebank.feature.auth.impl.presentation.view_model.LoginViewModel
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [AuthDependencies::class],
    modules = [AuthProviderModule::class]
)

internal interface AuthComponent: AuthApi {
    companion object {
        fun initAndGet(dependencies: AuthDependencies): AuthComponent {
            return DaggerAuthComponent.builder()
                .authDependencies(dependencies)
                .build()
        }
    }

    val loginViewModel: LoginViewModel
}