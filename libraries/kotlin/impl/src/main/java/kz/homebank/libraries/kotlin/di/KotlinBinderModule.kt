package kz.homebank.libraries.kotlin.di

import dagger.Binds
import dagger.Module
import kz.homebank.libraries.kotlin.api.serialization.Serializer
import kz.homebank.libraries.kotlin.serialization.SerializerImpl

@Module
internal interface KotlinBinderModule {
    @Binds
    fun bindSerializer(serializerImpl: SerializerImpl): Serializer
}