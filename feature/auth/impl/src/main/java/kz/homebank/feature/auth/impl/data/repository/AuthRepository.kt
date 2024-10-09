package kz.homebank.feature.payments.services.impl.data.repository

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import kz.homebank.base.network.api.network_utils.NetworkCaller
import kz.homebank.feature.payments.services.impl.data.model.AuthModel
import kz.homebank.libraries.kotlin.api.coroutine.IoDispatcher
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
internal class AuthRepository @Inject constructor(
    @IoDispatcher private val ioDispatcher: CoroutineDispatcher,
    private val networkCaller: NetworkCaller,
    private val paymentServicesApiServiceV6: AuthApiService
){


    suspend fun login(
        body: Map<String, String>
    ): AuthModel = withContext(ioDispatcher) {
        networkCaller.apiCall {
            paymentServicesApiServiceV6.login(
                token = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI4M2QzOGZiODdhZGU4NTA4Zjg4NTA0NzAwYjI5ZDhiMyIsIm5iZiI6MTcyNzk3NzU4Ni42MzI1ODcsInN1YiI6IjVlOGNhMGI1MGQyOTQ0MDAxMjdhYzA2MSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.tUW-wVVSuznpNZ6VUGUyWJaXKpCOVB-hEAkw2XOzc-o"
            )
        }
    }
}