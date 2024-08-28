package kz.homebank.preference.impl.di

import dagger.Binds
import dagger.Module
import kz.homebank.preference.api.domain.repository.PreferenceRepository
import kz.homebank.preference.api.domain.use_case.GetDeviceId
import kz.homebank.preference.impl.data.repository.PreferenceRepositoryImpl
import kz.homebank.preference.impl.domain.use_case.GetDeviceIdImpl

@Module
internal interface PreferenceBinderModule {
    @Binds
    fun bindPreferenceRepository(preferenceRepository: PreferenceRepositoryImpl): PreferenceRepository

    @Binds
    fun bindGetDeviceIdUseCase(getDeviceId: GetDeviceIdImpl): GetDeviceId
}