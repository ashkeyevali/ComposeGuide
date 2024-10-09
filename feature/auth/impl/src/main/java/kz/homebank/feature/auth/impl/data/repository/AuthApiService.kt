package kz.homebank.feature.payments.services.impl.data.repository

import kz.homebank.base.network.model.PaymentApiResponse
import kz.homebank.feature.payments.services.impl.data.model.AuthModel
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query

internal interface AuthApiService {

    @GET("authentication/token/new")
    suspend fun login(
        @Header("Authorization") token: String
    ): AuthModel
}