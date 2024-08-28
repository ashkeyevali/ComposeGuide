package kz.homebank.base.network.di.network_client

import android.content.Context
import kotlinx.coroutines.CoroutineScope
import kz.homebank.module_injector.BaseDependencies

interface NetworkClientDependencies : BaseDependencies {
    val context: Context
    val appScope: CoroutineScope
}