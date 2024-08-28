package kz.homebank.base.network.other_source

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.supervisorScope
import kz.homebank.base.domain.use_case.UseCase
import kz.homebank.base.network.domain.use_case.DoesNetworkHaveInternet
import kz.homebank.base.network.domain.use_case.SendNetworkErrorToAnalytics
import okhttp3.ResponseBody
import retrofit2.Response
import java.io.IOException
import javax.inject.Inject
import javax.net.SocketFactory

internal class PingSources @Inject constructor(
    private val otherSourceApiService: OtherSourceApiService,
    private val doesNetworkHaveInternet: DoesNetworkHaveInternet
) : UseCase<IOException, Unit>() {
    private val otherSources = listOf(
        "hb_api" to "https://api2.homebank.kz/hbapi/api/v1/ping",
        "kaspi" to "https://kaspi.kz",
        "halykbank" to "https://halykbank.kz",
        "tengrinews" to "https://tengrinews.kz",
    )

    override suspend fun execute(param: IOException) {
        supervisorScope {
            val networkDeferred = async {
                doesNetworkHaveInternet.execute(SocketFactory.getDefault())
            }
            val otherSourceStatuses = otherSources
                .map {
                    val (sourceName, sourceUrl) = it
                    sourceName to async { otherSourceApiService.getContent(sourceUrl) }
                }
                .map { mapOtherSourceResponse(it) }
                .plus(
                    "dns_google" to if (networkDeferred.await()) OtherSourceStatus.UP
                    else OtherSourceStatus.DOWN
                )


        }
    }

    private suspend fun mapOtherSourceResponse(
        sourceAndDeferredResponse: Pair<String, Deferred<Response<ResponseBody>>>
    ) : Pair<String, OtherSourceStatus> {
        val (source, response) = sourceAndDeferredResponse
        val sourceStatus = try {
            if (response.await().isSuccessful) OtherSourceStatus.UP else OtherSourceStatus.DOWN
        } catch (e : Exception) {
            OtherSourceStatus.DOWN
        }
        return Pair(source, sourceStatus)
    }
}