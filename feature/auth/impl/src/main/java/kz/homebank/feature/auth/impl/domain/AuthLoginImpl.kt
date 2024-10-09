package kz.homebank.feature.auth.impl.domain

import kotlinx.coroutines.flow.MutableStateFlow
import kz.homebank.base.domain.use_case.UseCase
import kz.homebank.feature.payments.services.impl.data.model.AuthModel
import kz.homebank.feature.payments.services.impl.data.repository.AuthRepository
import javax.inject.Inject

internal class AuthLoginImpl @Inject constructor(
    private val paymentServicesRepository: AuthRepository,
    private val authTokenHolder: MutableStateFlow<String?>,

    ): UseCase<HashMap<String, String>, AuthModel>() {
    override suspend fun execute(param: HashMap<String, String>): AuthModel {
        val auth =  paymentServicesRepository.login(param)
        authTokenHolder.value = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI4M2QzOGZiODdhZGU4NTA4Zjg4NTA0NzAwYjI5ZDhiMyIsIm5iZiI6MTcyNzk3NzU4Ni42MzI1ODcsInN1YiI6IjVlOGNhMGI1MGQyOTQ0MDAxMjdhYzA2MSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.tUW-wVVSuznpNZ6VUGUyWJaXKpCOVB-hEAkw2XOzc-o"
        return auth
    }
}