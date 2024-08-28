package kz.homebank.base.network.impl

import kz.homebank.base.network.api.network_client.ApiServiceFactory
import retrofit2.Retrofit
import javax.inject.Inject
import kotlin.reflect.KClass

internal class ApiServiceFactoryImpl @Inject constructor(
    private val retrofitBuilder: Retrofit.Builder
) : ApiServiceFactory {

    override fun <T : Any> create(baseUrl: String, clazz: KClass<T>): T {
        return retrofitBuilder
            .baseUrl(baseUrl)
            .build()
            .create(clazz.java)
    }
}
