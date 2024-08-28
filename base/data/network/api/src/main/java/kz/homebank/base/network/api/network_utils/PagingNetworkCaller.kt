package kz.homebank.base.network.api.network_utils

import kotlinx.coroutines.flow.Flow
import androidx.paging.PagingData
import kz.homebank.base.network.model.BasePaginationModel
import kz.homebank.base.network.model.PaymentApiResponse

interface PagingNetworkCaller {
    fun <T : Any> createPagingSource(
        pageSize: Int,
        prefetchDistance: Int?,
        initialLoadSize: Int?,
        enablePlaceholders: Boolean?,
        maxSize: Int?,
        networkCall: suspend (selectedPage: Int?, pageSize: Int?) -> PaymentApiResponse<BasePaginationModel<T>>
    ): Flow<PagingData<T>>
}