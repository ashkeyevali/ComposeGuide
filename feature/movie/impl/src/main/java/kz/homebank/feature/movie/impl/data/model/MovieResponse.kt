package kz.homebank.feature.movie.impl.data.model

import kotlinx.serialization.Serializable

@Serializable
data class MovieResponse(
    val results: List<MovieItem>
) {
@Serializable
    data class MovieItem(
        val id: Int,
        val title: String,
        val release_date: String,
        val vote_average: String
    )
}