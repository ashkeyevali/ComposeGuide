package kz.homebank.base.network.api.network_utils

import kotlinx.coroutines.flow.StateFlow

interface NetworkConnection {
    val isConnectionAvailable: StateFlow<Boolean>
}