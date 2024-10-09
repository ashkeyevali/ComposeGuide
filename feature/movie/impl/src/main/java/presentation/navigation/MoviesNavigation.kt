package presentation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import kz.homebank.base.presentation.navigation.NavigationTree
import presentation.movie_detail.view.MovieDetailScreen
import presentation.popular_movies.view.PopularMoviesScreen

fun NavGraphBuilder.addMoviesFlow(navController: NavHostController) {
    composable(NavigationTree.MoviesNavigation.Populars.name) {
        PopularMoviesScreen(navController)
    }

    composable(
        route = "${NavigationTree.MoviesNavigation.MovieDetail.name}/{movieId}",
        arguments = listOf(navArgument("movieId"){ type = NavType.IntType })) {
        backStackEntry ->
        val movieId = backStackEntry.arguments?.getInt("movieId") ?: 0
        MovieDetailScreen(navController, movieId)
    }
}
