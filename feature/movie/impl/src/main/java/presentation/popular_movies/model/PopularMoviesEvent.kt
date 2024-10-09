package presentation.popular_movies.model

import kz.homebank.feature.movie.impl.data.model.MovieDetail

sealed class PopularMoviesEvent {
    data class MovieClicked(val movieId: Int) : PopularMoviesEvent()
}