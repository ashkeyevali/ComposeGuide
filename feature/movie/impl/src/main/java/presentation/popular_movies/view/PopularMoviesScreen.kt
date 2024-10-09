package presentation.popular_movies.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import di.MoviesComponentHolder
import kz.homebank.base.presentation.navigation.NavigationTree
import kz.homebank.base.presentation.vm.factory.VmFactory
import presentation.popular_movies.PopularMovieViewModel
import presentation.popular_movies.model.PopularMoviesAction

@Composable
internal fun PopularMoviesScreen(navHostController: NavHostController) {

    val viewModel: PopularMovieViewModel = viewModel(factory = VmFactory { MoviesComponentHolder.getComponent().popularMovieViewModel }  )

    val state = viewModel.viewState.collectAsState()
    val action = viewModel.viewAction.collectAsState(initial = null)
    PopularMoviesView(state.value) {
        viewModel.obtainEvent(it)
    }
    LaunchedEffect(key1 = action.value) {
        when(action.value) {
            is PopularMoviesAction.OpenDetailScreen -> {
                val detail = action.value as PopularMoviesAction.OpenDetailScreen
                navHostController.navigate(
                    "${NavigationTree.MoviesNavigation.MovieDetail.name}/${detail.movieId}"
                )
            }
            else -> {}
        }
    }


}