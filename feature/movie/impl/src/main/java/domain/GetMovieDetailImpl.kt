package domain

import kz.homebank.base.domain.use_case.ParamlessUseCase
import kz.homebank.base.domain.use_case.UseCase
import kz.homebank.feature.movie.impl.data.model.MovieDetail
import kz.homebank.feature.movie.impl.data.model.MovieResponse
import kz.homebank.feature.movie.impl.data.repository.MovieRepository
import javax.inject.Inject

internal class GetMovieDetailImpl @Inject constructor(
    private val movieRepository: MovieRepository
): UseCase<Int,MovieDetail>() {
    override suspend fun execute(param: Int): MovieDetail {
        return movieRepository.getMovieDetail(param)
    }
}