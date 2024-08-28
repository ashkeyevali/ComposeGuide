package kz.homebank.base.network.interceptor

import android.content.Context
import android.os.Build
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

internal class AppAndDeviceInfoInterceptor @Inject constructor(
    private val context: Context
) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)
        val request = chain.request()
            .newBuilder()
            .addHeader("operationsystem", "android")
            .addHeader("operationsystemversion", Build.VERSION.RELEASE)
            .addHeader("appversioncode", packageInfo.versionCode.toString())
            .addHeader("appversionname", packageInfo.versionName)
            .build()
        return chain.proceed(request)
    }
}