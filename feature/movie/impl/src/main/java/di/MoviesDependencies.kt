package di

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.MutableStateFlow
import kz.homebank.base.network.api.network_client.ApiServiceFactory
import kz.homebank.base.network.api.network_utils.NetworkCaller
import kz.homebank.base.network.api.network_utils.PaymentsNetworkCaller
import kz.homebank.libraries.kotlin.api.coroutine.IoDispatcher
import kz.homebank.module_injector.BaseDependencies

interface MoviesDependencies: BaseDependencies {
    val serviceFactory: ApiServiceFactory
    val networkCaller: NetworkCaller
    @get: IoDispatcher val ioDispatcher: CoroutineDispatcher
}