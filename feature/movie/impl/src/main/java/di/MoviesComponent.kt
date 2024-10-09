package di

import dagger.Component
import kz.homebank.feature.movie.api.MoviesApi
import presentation.movie_detail.MovieDetailViewModel
import presentation.popular_movies.PopularMovieViewModel
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [MoviesDependencies::class],
    modules = [MoviesProviderModule::class]
)

internal interface MoviesComponent: MoviesApi {
    companion object {
        fun initAndGet(dependencies: MoviesDependencies): MoviesComponent {
            return DaggerMoviesComponent.builder()
                .moviesDependencies(dependencies)
                .build()
        }
    }

    val popularMovieViewModel: PopularMovieViewModel
    val movieDetailsViewModel: MovieDetailViewModel
}