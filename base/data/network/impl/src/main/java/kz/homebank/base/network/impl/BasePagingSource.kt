package kz.homebank.base.network.impl

import androidx.paging.PagingSource
import androidx.paging.PagingState
import dagger.assisted.AssistedInject
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kz.homebank.base.network.api.network_utils.NetworkConnection
import kz.homebank.base.network.exception.NoInternetException
import kz.homebank.base.network.model.BasePaginationModel
import kz.homebank.base.network.model.PaymentApiResponse
import kz.homebank.base.network.model.PaymentResponseException
import kz.homebank.base.network.other_source.PingSources
import kz.homebank.libraries.kotlin.api.event.SingleShotEvent
import retrofit2.HttpException
import java.io.IOException

internal class BasePagingSource<T : Any> @AssistedInject constructor(
    private val connection: NetworkConnection,
    private val unauthorizedEvent: SingleShotEvent<Unit>,
    private val pingSources: PingSources,
    private val appScope: CoroutineScope,
    private val pageSize: Int,
    private val request: suspend (selectedPage: Int?, pageSize: Int?) -> PaymentApiResponse<BasePaginationModel<T>>
) : PagingSource<Int, T>() {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, T> {
        val selectedPage = params.key ?: INITIAL_PAGE_NUMBER
        val pageSize = params.loadSize.coerceAtMost(pageSize)
        try {
            if (connection.isConnectionAvailable.value) {
                val response = request(selectedPage, pageSize)
                return if (response.isSuccessful) {
                    val nextPageNumber = if (
                        (response.data?.currentPage
                            ?: 1) >= (response.data?.pagesAmount
                            ?: 1)
                    ) null else selectedPage + 1
                    val prevPageNumber = if (selectedPage > 1) selectedPage - 1 else null
                    LoadResult.Page(
                        data = response.data!!.list,
                        prevKey = prevPageNumber,
                        nextKey = nextPageNumber
                    )
                } else {
                    LoadResult.Error(
                        PaymentResponseException(
                            response.status,
                            response.resultCode,
                            response.resultCodeDescription,
                            response.value
                        )
                    )
                }
            } else {
                return LoadResult.Error(NoInternetException())
            }
        } catch (e: Exception) {
            if (e is IOException) {
                appScope.launch {
                    pingSources.execute(e)
                }
            }
            return LoadResult.Error(wrapException(e))
        }
    }

    override fun getRefreshKey(state: PagingState<Int, T>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }

    private fun wrapException(e: Exception): Exception {
        return when (e) {
            is HttpException -> {
                if (e.code() == 401) {
                    unauthorizedEvent.postEventSync(Unit)
                }

                PaymentResponseException(
                    500,
                    e.code(),
                    null,
                    PaymentApiResponse.PaymentResponseValue(false, null)
                )
            }
            else -> e
        }
    }

    companion object {
        const val INITIAL_PAGE_NUMBER = 1
    }

}