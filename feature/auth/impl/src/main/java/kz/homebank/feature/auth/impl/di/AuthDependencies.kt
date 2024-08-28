package kz.homebank.feature.payments.services.impl.di

import kotlinx.coroutines.CoroutineDispatcher
import kz.homebank.base.network.api.network_client.ApiServiceFactory
import kz.homebank.base.network.api.network_utils.PaymentsNetworkCaller
import kz.homebank.libraries.kotlin.api.coroutine.IoDispatcher
import kz.homebank.module_injector.BaseDependencies

interface AuthDependencies: BaseDependencies {
    val serviceFactory: ApiServiceFactory
    val paymentsNetworkCaller: PaymentsNetworkCaller
    @get: IoDispatcher val ioDispatcher: CoroutineDispatcher
}