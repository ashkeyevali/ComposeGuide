package presentation.popular_movies.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import di.MoviesComponentHolder
import kz.homebank.base.presentation.navigation.NavigationTree
import kz.homebank.base.presentation.vm.factory.VmFactory
import presentation.popular_movies.PopularMovieViewModel

@Composable
internal fun PopularMoviesScreen(navHostController: NavHostController) {

    val viewModel: PopularMovieViewModel = viewModel(factory = VmFactory { MoviesComponentHolder.getComponent().popularMovieViewModel }  )
    val navigateToMovieDetails by viewModel.navigateToMovieDetail.collectAsState()

    PopularMoviesView(viewModel)

    if(navigateToMovieDetails.first) {
        navHostController.navigate(
            "${NavigationTree.MoviesNavigation.MovieDetail.name}/${navigateToMovieDetails.second}"
        )
        viewModel.onNavigationDone(Pair(false, navigateToMovieDetails.second))
    }

}