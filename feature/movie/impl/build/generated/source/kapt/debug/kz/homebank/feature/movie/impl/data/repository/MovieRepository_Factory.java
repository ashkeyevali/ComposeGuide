package kz.homebank.feature.movie.impl.data.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;
import kz.homebank.base.network.api.network_utils.NetworkCaller;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("kz.homebank.libraries.kotlin.api.coroutine.IoDispatcher")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class MovieRepository_Factory implements Factory<MovieRepository> {
  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  private final Provider<NetworkCaller> networkCallerProvider;

  private final Provider<MovieApiService> apiServicesProvider;

  public MovieRepository_Factory(Provider<CoroutineDispatcher> ioDispatcherProvider,
      Provider<NetworkCaller> networkCallerProvider,
      Provider<MovieApiService> apiServicesProvider) {
    this.ioDispatcherProvider = ioDispatcherProvider;
    this.networkCallerProvider = networkCallerProvider;
    this.apiServicesProvider = apiServicesProvider;
  }

  @Override
  public MovieRepository get() {
    return newInstance(ioDispatcherProvider.get(), networkCallerProvider.get(), apiServicesProvider.get());
  }

  public static MovieRepository_Factory create(Provider<CoroutineDispatcher> ioDispatcherProvider,
      Provider<NetworkCaller> networkCallerProvider,
      Provider<MovieApiService> apiServicesProvider) {
    return new MovieRepository_Factory(ioDispatcherProvider, networkCallerProvider, apiServicesProvider);
  }

  public static MovieRepository newInstance(CoroutineDispatcher ioDispatcher,
      NetworkCaller networkCaller, MovieApiService apiServices) {
    return new MovieRepository(ioDispatcher, networkCaller, apiServices);
  }
}
