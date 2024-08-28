package kz.homebank.base.network.api.network_client

import kotlin.reflect.KClass

interface ApiServiceFactory {
    fun <T: Any> create(baseUrl: String, clazz: KClass<T>): T
}

inline fun <reified T : Any> ApiServiceFactory.create(baseUrl: String): T {
    return create(baseUrl, T::class)
}