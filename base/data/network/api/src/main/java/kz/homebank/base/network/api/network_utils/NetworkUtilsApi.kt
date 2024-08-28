package kz.homebank.base.network.api.network_utils

import kz.homebank.libraries.kotlin.api.event.SingleShotEvent
import kz.homebank.module_injector.BaseApi

interface NetworkUtilsApi : BaseApi {
    val networkCaller: NetworkCaller
    val paymentsNetworkCaller: PaymentsNetworkCaller
    val pagingNetworkCaller: PagingNetworkCaller
    val networkConnection: NetworkConnection
    val unauthorizedEvent: SingleShotEvent<Unit>
}
