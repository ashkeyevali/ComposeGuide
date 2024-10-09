package kz.homebank.feature.movie.impl.data.model

import kotlinx.serialization.Serializable

@Serializable
data class MovieDetail(
    val id: Int,
    val title: String,
    val status: String,
    val runtime: String,
    val release_date: String,
    val overview: String,
    val budget: Int
)
