package kz.homebank.base.network.di.network_utils

import android.content.Context
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kz.homebank.base.network.api.network_client.ApiServiceFactory
import kz.homebank.libraries.kotlin.api.coroutine.IoDispatcher
import kz.homebank.module_injector.BaseDependencies

interface NetworkUtilsDependencies : BaseDependencies {
    val context: Context
    val appScope: CoroutineScope
    @get:IoDispatcher val ioDispatcher: CoroutineDispatcher
    val apiServiceFactory: ApiServiceFactory
}