package kz.homebank.base.network.other_source

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

internal interface OtherSourceApiService {
    @GET
    suspend fun getContent(@Url url: String): Response<ResponseBody>
}