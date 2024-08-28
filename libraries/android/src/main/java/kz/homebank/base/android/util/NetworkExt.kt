package kz.homebank.base.android.util

import android.annotation.SuppressLint
import android.content.Context
import android.content.Context.CONNECTIVITY_SERVICE
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.telephony.TelephonyManager

@SuppressLint("ServiceCast")
fun Context.getNetworkTypeConnection(): String {
    val connectivityManager = getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        val nw = connectivityManager.activeNetwork ?: return "-"
        val actNw = connectivityManager.getNetworkCapabilities(nw) ?: return "-"
        return when {
            actNw.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> "wifi"
            actNw.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> "ethernet"
            actNw.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> {
                val tm = getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
                tm.simOperatorName
            }
            else -> "?"
        }
    } else {
        val activeNetwork =
            (this.getSystemService(CONNECTIVITY_SERVICE) as? ConnectivityManager)?.activeNetworkInfo
        return when (activeNetwork?.type) {
            ConnectivityManager.TYPE_WIFI -> "wifi"
            ConnectivityManager.TYPE_ETHERNET -> "ethernet"
            ConnectivityManager.TYPE_MOBILE -> {
                val tm = getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
                tm.simOperatorName
            }
            else -> "?"
        }
    }
}