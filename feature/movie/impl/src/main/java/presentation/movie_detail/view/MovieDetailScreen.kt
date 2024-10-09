package presentation.movie_detail.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import di.MoviesComponentHolder
import kz.homebank.base.presentation.vm.factory.VmFactory
import presentation.movie_detail.MovieDetailViewModel
import presentation.popular_movies.PopularMovieViewModel

@Composable
internal fun MovieDetailScreen(navHostController: NavHostController, movieId: Int) {

    val viewModel: MovieDetailViewModel = viewModel(factory = VmFactory { MoviesComponentHolder.getComponent().movieDetailsViewModel }  )
    LaunchedEffect(key1 = movieId) {
        viewModel.getMovieDetail(movieId)
    }

    MovieDetailView(viewModel)
}