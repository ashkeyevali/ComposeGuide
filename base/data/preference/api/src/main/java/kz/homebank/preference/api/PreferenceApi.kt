package kz.homebank.preference.api

import kz.homebank.module_injector.BaseApi
import kz.homebank.preference.api.domain.repository.PreferenceRepository
import kz.homebank.preference.api.domain.use_case.GetDeviceId

interface PreferenceApi : BaseApi {
    val preferenceRepository: PreferenceRepository
    val getDeviceIdUseCase: GetDeviceId
}