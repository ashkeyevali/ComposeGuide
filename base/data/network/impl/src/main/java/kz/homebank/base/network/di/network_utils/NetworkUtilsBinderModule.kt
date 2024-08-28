package kz.homebank.base.network.di.network_utils

import dagger.Binds
import dagger.Module
import kz.homebank.base.network.api.network_utils.NetworkCaller
import kz.homebank.base.network.api.network_utils.NetworkConnection
import kz.homebank.base.network.api.network_utils.PagingNetworkCaller
import kz.homebank.base.network.api.network_utils.PaymentsNetworkCaller
import kz.homebank.base.network.impl.NetworkCallerImpl
import kz.homebank.base.network.impl.NetworkConnectionImpl
import kz.homebank.base.network.impl.PagingNetworkCallerImpl
import kz.homebank.base.network.impl.PaymentsNetworkCallerImpl

@Module
internal interface NetworkUtilsBinderModule {

    @Binds
    fun bindNetworkCaller(caller: NetworkCallerImpl): NetworkCaller

    @Binds
    fun bindPaymentsNetworkCaller(caller: PaymentsNetworkCallerImpl): PaymentsNetworkCaller

    @Binds
    fun bindPagingNetworkCaller(caller: PagingNetworkCallerImpl): PagingNetworkCaller

    @Binds
    fun bindNetworkConnection(connection: NetworkConnectionImpl): NetworkConnection
}