package kz.homebank.base.network.impl

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kz.homebank.base.network.api.network_utils.NetworkCaller
import kz.homebank.base.network.api.network_utils.NetworkConnection
import kz.homebank.base.network.exception.ErrorResponseException
import kz.homebank.base.network.exception.NoInternetException
import kz.homebank.base.network.other_source.PingSources
import kz.homebank.libraries.kotlin.api.event.SingleShotEvent
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

internal class NetworkCallerImpl @Inject constructor(
    private val connection: NetworkConnection,
    private val unauthorizedEvent: SingleShotEvent<Unit>,
    private val pingSources: PingSources,
    private val appScope: CoroutineScope
    ) : NetworkCaller {
    override suspend fun <T> apiCall(networkCall: suspend () -> T): T {
        return try {
            if (connection.isConnectionAvailable.value) {
                networkCall()
            } else {
                throw NoInternetException()
            }
        } catch (e: Exception) {
            if (e is IOException) {
                appScope.launch {
                    pingSources.execute(e)
                }
            }
            throw wrapException(e)
        }
    }

    private fun wrapException(e: Exception): Exception {
        return when(e) {
            is HttpException -> {
                if (e.code() == 401) {
                    unauthorizedEvent.postEventSync(Unit)
                }
                ErrorResponseException(e.code(), e.response()?.errorBody()?.string())
            }
            else -> e
        }
    }
}
