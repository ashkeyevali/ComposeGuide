package presentation.movie_detail.view

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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kz.homebank.libraries.resources.Theme
import presentation.movie_detail.MovieDetailViewModel
import presentation.movie_detail.model.MovieDetailState

@Composable
internal fun MovieDetailView(state: MovieDetailState) {

    Column {
        if (state.isLoading) {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.CenterHorizontally))
        } else if (state.error != null) {
            Text(
                text = state.error ?: "Unknown error",
                color = Theme.colors.highlightTextColor,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        } else {
            state.movieDetail?.let { movieDetail ->
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Text(
                        text = movieDetail.title,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = Theme.colors.secondaryTextColor,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = movieDetail.overview,
                        fontSize = 16.sp,
                        color = Theme.colors.hintTextColor,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "Release Date: ${movieDetail.release_date}",
                        color = Theme.colors.highlightTextColor,
                        fontSize = 14.sp
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Status: ${movieDetail.status}",
                        color = Theme.colors.highlightTextColor,
                        fontSize = 14.sp
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Runtime: ${movieDetail.runtime}",
                        color = Theme.colors.highlightTextColor,
                        fontSize = 14.sp
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Budget: ${movieDetail.budget}",
                        color = Theme.colors.highlightTextColor,
                        fontSize = 14.sp
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }
        }
    }


}