package kz.homebank.feature.payments.services.impl.data.repository

import kz.homebank.base.network.model.PaymentApiResponse
import kz.homebank.feature.payments.services.impl.data.model.ServiceInfoDto
import retrofit2.http.GET
import retrofit2.http.Query

internal interface AuthApiService {
    @GET("services/get-service-status")
    suspend fun getServiceInfo(
        @Query("FieldsFilter")fieldsFilter: String
    ): PaymentApiResponse<ServiceInfoDto>
}