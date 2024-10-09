package kz.beemobile.homebank.di.app

import android.content.Context

import kz.homebank.base.network.api.network_client.ApiServiceFactory
import kz.homebank.base.network.api.network_utils.NetworkConnection
import kz.homebank.libraries.kotlin.api.event.SingleShotEvent
import kz.homebank.libraries.kotlin.api.serialization.Serializer
import kz.homebank.module_injector.BaseDependencies

interface AppDependencies : BaseDependencies {
    val context: Context
    val serializer: Serializer
    val unauthorizedEvent: SingleShotEvent<Unit>
    val networkConnection: NetworkConnection
    val apiServiceFactory:ApiServiceFactory
}