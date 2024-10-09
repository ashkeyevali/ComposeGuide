package kz.homebank.feature.payments.services.impl.data.model

import kotlinx.serialization.Serializable

@Serializable
internal data class AuthModel(
    val success: Boolean,
    val expires_at: String?,
    val request_token: String?,

)
