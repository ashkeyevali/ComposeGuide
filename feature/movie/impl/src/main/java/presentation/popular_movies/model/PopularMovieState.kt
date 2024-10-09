package presentation.popular_movies.model

import kz.homebank.feature.movie.impl.data.model.MovieResponse

data class PopularMovieState(
    val movies: List<MovieResponse.MovieItem> = emptyList(),
    val selectedMovie: MovieResponse? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)