package kz.homebank.preference.impl.domain.use_case

import kz.homebank.preference.api.PreferenceKey
import kz.homebank.preference.api.domain.repository.PreferenceRepository
import kz.homebank.preference.api.domain.repository.get
import kz.homebank.preference.api.domain.use_case.GetDeviceId
import java.util.*
import javax.inject.Inject

internal class GetDeviceIdImpl @Inject constructor(
    private val preferenceRepository: PreferenceRepository
) : GetDeviceId() {
    override suspend fun execute(): String {
        var deviceId: String? = preferenceRepository.get(PreferenceKey.PREF_DEVICE_ID)
        if (deviceId.isNullOrEmpty()) {
            deviceId = UUID.randomUUID().toString()
            preferenceRepository.put(PreferenceKey.PREF_DEVICE_ID, deviceId)
        }
        return deviceId
    }
}