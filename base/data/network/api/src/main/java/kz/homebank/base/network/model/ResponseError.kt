package kz.homebank.base.network.model

import kotlinx.serialization.Serializable

@Serializable
class ResponseError(
    val resultCode: Int?,
    val resultDescription: String?
)