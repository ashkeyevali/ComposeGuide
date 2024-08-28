package kz.homebank.base.network.api.network_utils

interface NetworkCaller {
    suspend fun <T> apiCall(networkCall: suspend () -> T): T
}