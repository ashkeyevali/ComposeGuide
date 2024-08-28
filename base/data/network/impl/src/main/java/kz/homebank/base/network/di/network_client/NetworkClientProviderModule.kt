package kz.homebank.base.network.di.network_client

import android.content.Context
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.serialization.json.Json
import kz.homebank.base.data.network.BuildConfig
import kz.homebank.base.network.interceptor.AppAndDeviceInfoInterceptor
import kz.homebank.base.network.interceptor.AuthorizationInterceptor
import kz.homebank.base.network.interceptor.DeviceIdInterceptor
import kz.homebank.base.network.interceptor.LanguageInterceptor
import kz.homebank.base.network.interceptor.chucker
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
internal object NetworkClientProviderModule {
    private const val CONNECTION_TIMEOUT = 60L
    private const val READ_TIMEOUT = 60L
    private const val WRITE_TIMEOUT = 60L

    @Singleton
    @Provides
    fun provideHttpClient(
        context: Context,
        deviceIdInterceptor: DeviceIdInterceptor,
        languageInterceptor: LanguageInterceptor,
        authorizationInterceptor: AuthorizationInterceptor,
        appAndDeviceInfoInterceptor: AppAndDeviceInfoInterceptor
    ): OkHttpClient {
        val builder = OkHttpClient.Builder()
            .connectTimeout(CONNECTION_TIMEOUT, TimeUnit.SECONDS)
            .readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)
            .writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS)
            .addInterceptor(deviceIdInterceptor)
            .addInterceptor(languageInterceptor)
            .addInterceptor(authorizationInterceptor)
            .addInterceptor(appAndDeviceInfoInterceptor)

        if (BuildConfig.DEBUG) {
            builder.addInterceptor(chucker(context))
            builder.addNetworkInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            })
        }
        return builder.build()
    }

    @Provides
    fun provideGson(): Gson = GsonBuilder().create()

    @Provides
    fun provideRetrofit(
        gson: Gson,
        httpClient: OkHttpClient,
    ): Retrofit.Builder {
        val contentType = "application/json".toMediaType()
        val jsonSerialization = Json {
            ignoreUnknownKeys = true
            prettyPrint = true
            isLenient = true
            coerceInputValues = true
            encodeDefaults = true
            explicitNulls = false
        }
        return Retrofit.Builder()
            .client(httpClient)
            .addConverterFactory(jsonSerialization.asConverterFactory(contentType))
            .addConverterFactory(GsonConverterFactory.create(gson))
    }

    @Singleton
    @Provides
    fun provideAuthTokenHolder() = MutableStateFlow<String?>(null)
}