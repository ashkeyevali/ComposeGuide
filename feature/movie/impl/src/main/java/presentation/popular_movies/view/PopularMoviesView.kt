package presentation.popular_movies.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kz.homebank.feature.movie.impl.data.model.MovieResponse
import kz.homebank.libraries.resources.Theme
import presentation.popular_movies.PopularMovieViewModel

@Composable
internal fun PopularMoviesView(viewModel: PopularMovieViewModel) {
    val state by viewModel.viewState.collectAsState()
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(
            text = "Popular Movies",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color =Theme.colors.secondaryTextColor,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        if(state.isLoading) {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.CenterHorizontally))
        }
        else if(state.error != null) {
            Text(
                text = state.error.toString(),
                color = Theme.colors.tagTextColor,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
        else {
            MovieList(movies = state.movies) {
                viewModel.onNavigateToMovieDetail(it.id)

            }
        }
    }
}

@Composable
internal fun MovieList(movies: List<MovieResponse.MovieItem>, onMovieClick: (MovieResponse.MovieItem) -> Unit) {
    LazyColumn {
        movies.forEach { movie ->
            item {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .clickable { onMovieClick(movie) },
                    backgroundColor = Theme.colors.tagColor,
                    elevation = 4.dp
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(
                            text = movie.title,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Theme.colors.secondaryTextColor
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = movie.release_date,
                            fontSize = 14.sp,
                            color = Theme.colors.hintTextColor
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = movie.vote_average,
                            fontSize = 14.sp,
                            color = Theme.colors.highlightTextColor
                        )
                    }
                }
            }
        }
    }
}
