package kz.homebank.base.network.interceptor

import kotlinx.coroutines.CoroutineScope
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

internal class LanguageInterceptor @Inject constructor(
    appScope: CoroutineScope
): Interceptor {
    private var lang: String? = null

    init {

    }

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
            .newBuilder()
            .addHeader("Accept-Language", wrapLanguage(lang))
            .addHeader("x-lang", wrapLanguage(lang))
            .build()
        return chain.proceed(request)
    }

    private fun wrapLanguage(lang: String?) = when(lang) {
        "kk" -> "kaz"
        "en" -> "eng"
        else -> "rus"
    }
}