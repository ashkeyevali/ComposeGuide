package kz.homebank.base.network.impl

import android.content.Context
import android.content.Context.CONNECTIVITY_SERVICE
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.net.NetworkCapabilities.NET_CAPABILITY_INTERNET
import android.net.NetworkRequest
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kz.homebank.base.network.api.network_utils.NetworkConnection
import kz.homebank.base.network.domain.use_case.DoesNetworkHaveInternet
import javax.inject.Inject
import javax.inject.Singleton
import javax.net.SocketFactory

@Singleton
internal class NetworkConnectionImpl @Inject constructor(
    private val appScope: CoroutineScope,
//    private val doesNetworkHaveInternet: DoesNetworkHaveInternet,
    context: Context
) : NetworkConnection {
    private val cm = context.getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager
    override val isConnectionAvailable: StateFlow<Boolean>
        get() = _isConnectionAvailable
    private val _isConnectionAvailable = MutableStateFlow(
        cm.activeNetworkInfo?.isConnected == true
    )
    private val validNetworks: MutableSet<Network> = HashSet()

    init {
        val networkRequest = NetworkRequest.Builder()
            .addTransportType(NetworkCapabilities.TRANSPORT_CELLULAR)
            .addTransportType(NetworkCapabilities.TRANSPORT_WIFI)
            .addTransportType(NetworkCapabilities.TRANSPORT_ETHERNET)
            .build()
        cm.registerNetworkCallback(networkRequest, createNetworkCallback())
//        appScope.launch {
//            _isConnectionAvailable.value = doesNetworkHaveInternet.execute(SocketFactory.getDefault())
//        }
    }

    private fun checkValidNetworks() {
        _isConnectionAvailable.value = validNetworks.isNotEmpty()
    }

    private fun createNetworkCallback() = object : ConnectivityManager.NetworkCallback() {

        /*
          Called when a network is detected. If that network has internet, save it in the Set.
          Source: https://developer.android.com/reference/android/net/ConnectivityManager.NetworkCallback#onAvailable(android.net.Network)
         */
        override fun onAvailable(network: Network) {
            val networkCapabilities = cm.getNetworkCapabilities(network)
            checkInternet(network, networkCapabilities)
        }

//        override fun onCapabilitiesChanged(
//            network: Network,
//            networkCapabilities: NetworkCapabilities
//        ) {
//            if (validNetworks.contains(network)) {
//                checkInternet(network, networkCapabilities)
//            }
//        }

        /*
          If the callback was registered with registerNetworkCallback() it will be called for each network which no longer satisfies the criteria of the callback.
          Source: https://developer.android.com/reference/android/net/ConnectivityManager.NetworkCallback#onLost(android.net.Network)
         */
        override fun onLost(network: Network) {
            validNetworks.remove(network)
            checkValidNetworks()
        }

        private fun checkInternet(network: Network, networkCapabilities: NetworkCapabilities?) {
            val hasInternetCapability = networkCapabilities?.hasCapability(NET_CAPABILITY_INTERNET)
            if (hasInternetCapability == true) {
                validNetworks.add(network)
                checkValidNetworks()
//                appScope.launch {
//                    val hasInternet = doesNetworkHaveInternet.execute(network.socketFactory)
//                    if (hasInternet) validNetworks.add(network)
//                    checkValidNetworks()
//                }
            }
        }
    }
}

