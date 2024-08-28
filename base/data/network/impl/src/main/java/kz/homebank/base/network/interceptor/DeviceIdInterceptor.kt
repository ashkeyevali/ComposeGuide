package kz.homebank.base.network.interceptor

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kz.homebank.base.domain.result.data
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

internal class DeviceIdInterceptor @Inject constructor(
    appScope: CoroutineScope
) : Interceptor {
    private var deviceId: String?  = null

    init {

    }

    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        if (deviceId.isNullOrEmpty()) return chain.proceed(request)

        request = chain.request().newBuilder()
            .addHeader("deviceid", deviceId!!)
            .build()

        return chain.proceed(request)
    }
}