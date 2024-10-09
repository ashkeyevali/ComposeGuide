package domain

import kz.homebank.base.domain.use_case.ParamlessUseCase
import kz.homebank.base.domain.use_case.UseCase
import kz.homebank.feature.movie.impl.data.model.MovieResponse
import kz.homebank.feature.movie.impl.data.repository.MovieRepository
import javax.inject.Inject

internal class GetPopularMoviesImpl @Inject constructor(
    private val movieRepository: MovieRepository
): ParamlessUseCase<MovieResponse>() {
    override suspend fun execute(): MovieResponse {
        return movieRepository.getPopularMovies()
    }
}