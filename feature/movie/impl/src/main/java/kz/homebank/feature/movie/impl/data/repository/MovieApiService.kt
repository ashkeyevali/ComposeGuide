package kz.homebank.feature.movie.impl.data.repository

import kz.homebank.feature.movie.impl.data.model.MovieDetail
import kz.homebank.feature.movie.impl.data.model.MovieResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

internal interface MovieApiService {

    @GET("movie/popular")
    suspend fun getPopularMovies(
    ): MovieResponse

    @GET("movie/{movieId}")
    suspend fun getMovieDetail(
    @Path("movieId") movieId: Int
    ): MovieDetail
}