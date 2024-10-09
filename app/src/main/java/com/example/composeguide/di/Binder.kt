package kz.beemobile.homebank.di.app

import android.content.Context
import di.MoviesComponentHolder
import di.MoviesDependencies
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kz.homebank.base.android.api.AndroidApi
import kz.homebank.base.android.impl.di.AndroidComponentHolder
import kz.homebank.base.android.impl.di.AndroidDependencies
import kz.homebank.base.data.network.BuildConfig
import kz.homebank.base.network.api.network_client.ApiServiceFactory
import kz.homebank.base.network.api.network_client.NetworkClientApi
import kz.homebank.base.network.api.network_utils.NetworkCaller
import kz.homebank.base.network.api.network_utils.NetworkConnection
import kz.homebank.base.network.api.network_utils.NetworkUtilsApi
import kz.homebank.base.network.api.network_utils.PagingNetworkCaller
import kz.homebank.base.network.api.network_utils.PaymentsNetworkCaller
import kz.homebank.base.network.di.network_client.NetworkClientComponentHolder
import kz.homebank.base.network.di.network_client.NetworkClientDependencies
import kz.homebank.base.network.di.network_utils.NetworkUtilsComponentHolder
import kz.homebank.base.network.di.network_utils.NetworkUtilsDependencies
import kz.homebank.base.presentation.di.PresentationComponentHolder
import kz.homebank.base.presentation.di.PresentationDependencies
import kz.homebank.feature.auth.api.AuthApi
import kz.homebank.feature.auth.impl.di.AuthComponentHolder
import kz.homebank.feature.auth.impl.di.AuthDependencies
import kz.homebank.feature.movie.api.MoviesApi
import kz.homebank.libraries.kotlin.api.KotlinApi
import kz.homebank.libraries.kotlin.api.event.SingleShotEvent
import kz.homebank.libraries.kotlin.api.serialization.Serializer
import kz.homebank.libraries.kotlin.di.KotlinComponentHolder
import kz.homebank.libraries.kotlin.di.KotlinDependencies
import kz.homebank.module_injector.*
import kz.homebank.preference.impl.di.PreferenceComponentHolder
import kz.homebank.preference.impl.di.PreferenceDependencies

internal object Binder {
    fun bindAllModules(context: Context) {
        bindAppModule(context)
        bindCommonModule()
        bindPreferenceModule()
        bindCommonAndroidModule(context)
        bindNetworkUtilsModule()
        bindPresentationModule()
        bindNetworkClientComponent()
        bindAuthModule()
        bindMoviesModule()

    }

    private fun bindAppModule(context: Context) {
        AppComponentHolder.dependencyProvider = {
            class AppDependencyHolder(
                override val block: (
                    BaseDependencyHolder<AppDependencies>,
                    AuthApi,
                    KotlinApi,
                    NetworkUtilsApi,
                    NetworkClientApi
                ) -> AppDependencies
            ) : DependencyHolder4<
                    AppDependencies,
                    AuthApi,
                    KotlinApi,
                    NetworkUtilsApi,
                    NetworkClientApi
                    >(
                AuthComponentHolder.get(),
                KotlinComponentHolder.get(),
                NetworkUtilsComponentHolder.get(),
                NetworkClientComponentHolder.get()
            )

            AppDependencyHolder {
                    depHolder,
                    authApi,
                    kotlinApi,
                    networkUtilsApi,
                    networkClientApi
                ->
                object : AppDependencies {
                    override val context: Context = context
                    override val serializer: Serializer = kotlinApi.serializer
                    override val unauthorizedEvent: SingleShotEvent<Unit> = networkUtilsApi.unauthorizedEvent
                    override val networkConnection: NetworkConnection = networkUtilsApi.networkConnection
                    override val apiServiceFactory: ApiServiceFactory = networkClientApi.apiServiceFactory
                    override val dependencyHolder: BaseDependencyHolder<out BaseDependencies> = depHolder

                }
            }.dependencies
        }
    }


    private fun bindPreferenceModule() {
        PreferenceComponentHolder.dependencyProvider = {
            class PreferenceDependencyHolder(
                override val block: (BaseDependencyHolder<PreferenceDependencies>, AndroidApi, KotlinApi) -> PreferenceDependencies
            ) : DependencyHolder2<PreferenceDependencies, AndroidApi, KotlinApi>(
                AndroidComponentHolder.get(), KotlinComponentHolder.get()
            )

            PreferenceDependencyHolder { depHolder, androidApi, kotlinApi ->
                object : PreferenceDependencies {
                    override val context: Context = androidApi.context
                    override val serializer: Serializer = kotlinApi.serializer
                    override val dependencyHolder: BaseDependencyHolder<out BaseDependencies> =
                        depHolder
                }
            }.dependencies
        }
    }

    private fun bindCommonModule() {
        KotlinComponentHolder.dependencyProvider = {
            class CommonDependencyHolder(
                override val block: (BaseDependencyHolder<KotlinDependencies>) -> KotlinDependencies
            ) : DependencyHolder0<KotlinDependencies>()

            CommonDependencyHolder { depHolder ->
                object : KotlinDependencies {
                    override val dependencyHolder: BaseDependencyHolder<out BaseDependencies> =
                        depHolder
                }
            }.dependencies
        }
    }

    private fun bindCommonAndroidModule(context: Context) {
        AndroidComponentHolder.dependencyProvider = {
            class AppDependencyHolder(
                override val block: (BaseDependencyHolder<AndroidDependencies>) -> AndroidDependencies
            ) : DependencyHolder0<AndroidDependencies>()

            AppDependencyHolder { depHolder ->
                object : AndroidDependencies {
                    override val context: Context = context
                    override val isTestEnvironment: Boolean = true
                    override val dependencyHolder: BaseDependencyHolder<out BaseDependencies> = depHolder
                }
            }.dependencies
        }
    }


    private fun bindNetworkUtilsModule() {
        NetworkUtilsComponentHolder.dependencyProvider = {
            class NetworkUtilsDependencyHolder(
                override val block: (
                    BaseDependencyHolder<NetworkUtilsDependencies>, KotlinApi, AndroidApi, NetworkClientApi) -> NetworkUtilsDependencies
            ) : DependencyHolder3<NetworkUtilsDependencies, KotlinApi, AndroidApi, NetworkClientApi>(
                KotlinComponentHolder.get(),
                AndroidComponentHolder.get(),
                NetworkClientComponentHolder.get()
            )

            NetworkUtilsDependencyHolder { depHolder, kotlinApi, androidApi, networkClientApi ->
                object : NetworkUtilsDependencies {
                    override val context: Context = androidApi.context
                    override val appScope: CoroutineScope = kotlinApi.appScope
                    override val ioDispatcher: CoroutineDispatcher = kotlinApi.ioDispatcher
                    override val apiServiceFactory: ApiServiceFactory = networkClientApi.apiServiceFactory
                    override val dependencyHolder: BaseDependencyHolder<out BaseDependencies> = depHolder
                }
            }.dependencies
        }
    }

    private fun bindPresentationModule() {
        PresentationComponentHolder.dependencyProvider = {
            class PresentationDependencyHolder(
                override val block: (
                    BaseDependencyHolder<PresentationDependencies>, KotlinApi
                ) -> PresentationDependencies
            ) : DependencyHolder1<PresentationDependencies, KotlinApi>(
                KotlinComponentHolder.get()
            )

            PresentationDependencyHolder { depHolder, kotlinApi ->
                object : PresentationDependencies {
                    override val serializer: Serializer = kotlinApi.serializer
                    override val dependencyHolder: BaseDependencyHolder<out BaseDependencies> = depHolder
                }
            }.dependencies
        }
    }



    private fun bindNetworkClientComponent() {
        NetworkClientComponentHolder.dependencyProvider = {
            class NetworkClientDependencyHolder(
                override val block: (BaseDependencyHolder<NetworkClientDependencies>,
                                     KotlinApi, AndroidApi) -> NetworkClientDependencies
            ) : DependencyHolder2<NetworkClientDependencies, KotlinApi, AndroidApi>(
                KotlinComponentHolder.get(),
                AndroidComponentHolder.get()
            )

            NetworkClientDependencyHolder { depHolder, kotlinApi, androidApi ->
                object : NetworkClientDependencies {
                    override val context: Context = androidApi.context
                    override val appScope: CoroutineScope = kotlinApi.appScope
                    override val dependencyHolder: BaseDependencyHolder<out BaseDependencies> = depHolder
                }
            }.dependencies
        }
    }

    private fun bindAuthModule() {
        AuthComponentHolder.dependencyProvider = {
            class AuthDependencyHolder(
                override val block: (BaseDependencyHolder<AuthDependencies>, NetworkUtilsApi, NetworkClientApi, KotlinApi) -> AuthDependencies
            ) : DependencyHolder3<AuthDependencies, NetworkUtilsApi, NetworkClientApi, KotlinApi>(
                NetworkUtilsComponentHolder.get(),
                NetworkClientComponentHolder.get(),
                KotlinComponentHolder.get()
            )

            AuthDependencyHolder { depHolder, networkUtilsApi, networkClientApi, kotlinApi ->
                object : AuthDependencies {
                    override val serviceFactory: ApiServiceFactory = networkClientApi.apiServiceFactory
                    override val authTokenHolder: MutableStateFlow<String?> = networkClientApi.authTokenHolder
                    override val paymentsNetworkCaller: PaymentsNetworkCaller = networkUtilsApi.paymentsNetworkCaller
                    override val networkCaller: NetworkCaller = networkUtilsApi.networkCaller
                    override val ioDispatcher: CoroutineDispatcher = kotlinApi.ioDispatcher
                    override val dependencyHolder: BaseDependencyHolder<out BaseDependencies> = depHolder
                }
            }.dependencies
        }

    }

    private fun bindMoviesModule() {
        MoviesComponentHolder.dependencyProvider = {
            class MoviesDependencyHolder(
                override val block: (BaseDependencyHolder<MoviesDependencies>, NetworkUtilsApi, NetworkClientApi, KotlinApi) -> MoviesDependencies
            ) : DependencyHolder3<MoviesDependencies, NetworkUtilsApi, NetworkClientApi, KotlinApi>(
                NetworkUtilsComponentHolder.get(),
                NetworkClientComponentHolder.get(),
                KotlinComponentHolder.get()
            )

            MoviesDependencyHolder { depHolder, networkUtilsApi, networkClientApi, kotlinApi ->
                object : MoviesDependencies {
                    override val serviceFactory: ApiServiceFactory = networkClientApi.apiServiceFactory
                    override val networkCaller: NetworkCaller = networkUtilsApi.networkCaller
                    override val ioDispatcher: CoroutineDispatcher = kotlinApi.ioDispatcher
                    override val dependencyHolder: BaseDependencyHolder<out BaseDependencies> = depHolder
                }
            }.dependencies
        }

    }
}