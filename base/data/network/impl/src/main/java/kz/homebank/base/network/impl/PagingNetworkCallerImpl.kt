package kz.homebank.base.network.impl

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kz.homebank.base.network.api.network_utils.NetworkConnection
import kz.homebank.base.network.api.network_utils.PagingNetworkCaller
import kz.homebank.base.network.model.BasePaginationModel
import kz.homebank.base.network.model.PaymentApiResponse
import kz.homebank.base.network.other_source.PingSources
import kz.homebank.libraries.kotlin.api.event.SingleShotEvent
import javax.inject.Inject

internal class PagingNetworkCallerImpl @Inject constructor(
    private val connection: NetworkConnection,
    private val unauthorizedEvent: SingleShotEvent<Unit>,
    private val pingSources: PingSources,
    private val appScope: CoroutineScope,
) : PagingNetworkCaller {
    override fun <T : Any> createPagingSource(
        pageSize: Int,
        prefetchDistance: Int?,
        initialLoadSize: Int?,
        enablePlaceholders: Boolean?,
        maxSize: Int?,
        networkCall: suspend (selectedPage: Int?, pageSize: Int?) -> PaymentApiResponse<BasePaginationModel<T>>
    ): Flow<PagingData<T>> {
        // Maximum size must be at least pageSize + 2*prefetchDist
        return Pager(
            config = PagingConfig(
                pageSize = pageSize,
                prefetchDistance = prefetchDistance ?: pageSize,
                initialLoadSize = initialLoadSize ?: (pageSize * 3),
                enablePlaceholders = enablePlaceholders?: false,
                maxSize = maxSize?:PagingConfig.MAX_SIZE_UNBOUNDED
            ),
            pagingSourceFactory = {  BasePagingSource(
                request = networkCall,
                appScope = appScope,
                connection = connection,
                unauthorizedEvent = unauthorizedEvent,
                pingSources = pingSources,
                pageSize = pageSize
            ) }
        ).flow

    }
}