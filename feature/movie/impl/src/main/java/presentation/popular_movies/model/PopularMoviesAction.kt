package presentation.popular_movies.model

sealed class PopularMoviesAction {
    data class OpenDetailScreen(val movieId: Int = 0) : PopularMoviesAction()
}