package kz.homebank.feature.movie.impl.data.repository

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import kz.homebank.base.network.api.network_utils.NetworkCaller
import kz.homebank.feature.movie.impl.data.model.MovieDetail
import kz.homebank.feature.movie.impl.data.model.MovieResponse
import kz.homebank.libraries.kotlin.api.coroutine.IoDispatcher
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
internal class MovieRepository @Inject constructor(
    @IoDispatcher private val ioDispatcher: CoroutineDispatcher,
    private val networkCaller: NetworkCaller,
    private val apiServices: MovieApiService
){
    suspend fun getPopularMovies(): MovieResponse = withContext(ioDispatcher) {
        networkCaller.apiCall {
            apiServices.getPopularMovies()
        }
    }

    suspend fun getMovieDetail(movieId: Int): MovieDetail = withContext(ioDispatcher) {
        networkCaller.apiCall {
            apiServices.getMovieDetail(movieId)
        }
    }
}