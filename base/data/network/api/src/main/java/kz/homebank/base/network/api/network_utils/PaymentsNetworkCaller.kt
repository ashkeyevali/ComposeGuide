package kz.homebank.base.network.api.network_utils

import kz.homebank.base.network.model.PaymentApiResponse

interface PaymentsNetworkCaller {
    suspend fun <T: Any> apiCall(networkCall: suspend () -> PaymentApiResponse<T>): T
}