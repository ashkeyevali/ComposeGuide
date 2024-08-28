package kz.homebank.base.network.api.network_client

import kotlinx.coroutines.flow.MutableStateFlow
import kz.homebank.module_injector.BaseApi

interface NetworkClientApi : BaseApi {
    val apiServiceFactory: ApiServiceFactory
    val authTokenHolder: MutableStateFlow<String?>
}