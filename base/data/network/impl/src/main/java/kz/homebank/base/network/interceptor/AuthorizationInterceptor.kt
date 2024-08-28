package kz.homebank.base.network.interceptor

import kotlinx.coroutines.flow.MutableStateFlow
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

internal class AuthorizationInterceptor @Inject constructor(
    private val authTokenHolder: MutableStateFlow<String?>
): Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        val token = authTokenHolder.value
        if (token.isNullOrEmpty()) return chain.proceed(request)

        request = chain.request().newBuilder()
            .addHeader("Authorization", token)
            .build()

        return chain.proceed(request)
    }
}