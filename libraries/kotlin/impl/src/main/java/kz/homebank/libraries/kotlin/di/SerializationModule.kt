package kz.homebank.libraries.kotlin.di

import dagger.Module
import dagger.Provides
import kotlinx.serialization.json.Json

@Module
internal object SerializationModule {
    @Provides
    fun provideJsonSerialization(): Json {
        return Json {
            ignoreUnknownKeys = true
            prettyPrint = true
            isLenient = true
            coerceInputValues = true
            encodeDefaults = true
            explicitNulls = false
        }
    }
}