package kz.homebank.base.network.interceptor

import android.content.Context
import com.chuckerteam.chucker.api.ChuckerCollector
import com.chuckerteam.chucker.api.ChuckerInterceptor
import okhttp3.Interceptor

const val CHUCKER_MAX_CONTENT_LENGTH = 250000L

fun chucker(context: Context): Interceptor {
    return ChuckerInterceptor.Builder(context)
        .collector(ChuckerCollector(context))
        .maxContentLength(CHUCKER_MAX_CONTENT_LENGTH)
        .redactHeaders(emptySet())
        .alwaysReadResponseBody(false)
        .build()
}