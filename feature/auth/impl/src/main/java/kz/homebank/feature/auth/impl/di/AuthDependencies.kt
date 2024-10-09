package kz.homebank.feature.auth.impl.di

import androidx.navigation.NavHostController
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.MutableStateFlow
import kz.homebank.base.network.api.network_client.ApiServiceFactory
import kz.homebank.base.network.api.network_utils.NetworkCaller
import kz.homebank.base.network.api.network_utils.PaymentsNetworkCaller
import kz.homebank.libraries.kotlin.api.coroutine.IoDispatcher
import kz.homebank.module_injector.BaseDependencies

interface AuthDependencies: BaseDependencies {
    val serviceFactory: ApiServiceFactory
    val authTokenHolder: MutableStateFlow<String?>
    val paymentsNetworkCaller: PaymentsNetworkCaller
    val networkCaller: NetworkCaller
    @get: IoDispatcher val ioDispatcher: CoroutineDispatcher
}