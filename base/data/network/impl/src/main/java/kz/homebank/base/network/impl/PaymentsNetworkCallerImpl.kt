package kz.homebank.base.network.impl

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kz.homebank.base.network.api.network_utils.NetworkConnection
import kz.homebank.base.network.api.network_utils.PaymentsNetworkCaller
import kz.homebank.base.network.exception.ErrorResponseException
import kz.homebank.base.network.exception.NoInternetException
import kz.homebank.base.network.model.PaymentApiResponse
import kz.homebank.base.network.model.PaymentResponseException
import kz.homebank.base.network.other_source.PingSources
import kz.homebank.libraries.kotlin.api.event.SingleShotEvent
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

internal class PaymentsNetworkCallerImpl@Inject constructor(
    private val connection: NetworkConnection,
    private val unauthorizedEvent: SingleShotEvent<Unit>,
    private val pingSources: PingSources,
    private val appScope: CoroutineScope
) : PaymentsNetworkCaller {
    override suspend fun <T : Any> apiCall(networkCall: suspend () -> PaymentApiResponse<T>): T {
        try {
            if(connection.isConnectionAvailable.value) {
                val response  = networkCall()
                if (response.isSuccessful)
                    return response.data!!
                else
                    throw PaymentResponseException(response.status, response.resultCode, response.resultCodeDescription, response.value)
            } else {
                throw NoInternetException()
            }
        } catch (e: Exception) {
            if(e is IOException) {
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

                PaymentResponseException(500,e.code(), null, PaymentApiResponse.PaymentResponseValue(false,null))
            }
            else -> e
        }
    }
}