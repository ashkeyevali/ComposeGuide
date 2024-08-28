package kz.homebank.libraries.kotlin.api

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kz.homebank.libraries.kotlin.api.coroutine.DefaultDispatcher
import kz.homebank.libraries.kotlin.api.coroutine.IoDispatcher
import kz.homebank.libraries.kotlin.api.coroutine.MainDispatcher
import kz.homebank.libraries.kotlin.api.serialization.Serializer
import kz.homebank.module_injector.BaseApi

interface KotlinApi : BaseApi {
    @get:MainDispatcher val mainDispatcher: CoroutineDispatcher
    @get:IoDispatcher val ioDispatcher: CoroutineDispatcher
    @get:DefaultDispatcher val defaultDispatcher: CoroutineDispatcher
    val appScope: CoroutineScope
    val serializer: Serializer
}