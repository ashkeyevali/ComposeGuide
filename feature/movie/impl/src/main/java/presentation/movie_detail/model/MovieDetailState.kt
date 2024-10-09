package presentation.movie_detail.model

import kz.homebank.feature.movie.impl.data.model.MovieDetail
import kz.homebank.feature.movie.impl.data.model.MovieResponse

data class MovieDetailState(
    val movieDetail: MovieDetail? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)


