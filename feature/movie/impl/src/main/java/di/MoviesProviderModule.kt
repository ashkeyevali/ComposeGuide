package di

import dagger.Module
import dagger.Provides
import kotlinx.coroutines.flow.MutableStateFlow
import kz.homebank.base.android.constants.EnvironmentConstants
import kz.homebank.base.network.api.network_client.ApiServiceFactory
import kz.homebank.base.network.api.network_client.create
import kz.homebank.feature.movie.impl.data.repository.MovieApiService
import javax.inject.Singleton

@Module
internal object MoviesProviderModule {
    @Provides
    @Singleton
    fun providePaymentServicesApiService(factory: ApiServiceFactory): MovieApiService {
        return factory.create(EnvironmentConstants.movieDbApiUrl)
    }

//    @Provides
//    @Singleton
//    fun provideNavHostController(navHostController: NavHostController): NavHostController {
//        return navHostController
//    }
}