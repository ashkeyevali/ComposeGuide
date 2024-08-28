package kz.homebank.base.network.domain.use_case

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import kz.homebank.base.domain.use_case.UseCase
import kz.homebank.libraries.kotlin.api.coroutine.IoDispatcher
import java.io.IOException
import java.net.InetSocketAddress
import javax.inject.Inject
import javax.net.SocketFactory

internal class DoesNetworkHaveInternet @Inject constructor(
    @IoDispatcher
    private val ioDispatcher: CoroutineDispatcher
) : UseCase<SocketFactory, Boolean>() {

    @Suppress("BlockingMethodInNonBlockingContext")
    override suspend fun execute(param: SocketFactory): Boolean {
        return withContext(ioDispatcher) {
            try {
                val socket = param.createSocket() ?: throw IOException("Socket is null.")
                // pinging google server dns
                socket.connect(InetSocketAddress("8.8.8.8", 53), 10000)
                socket.close()
                true
            } catch (e: IOException) {
                e.stackTraceToString()
                false
            }
        }
    }
}