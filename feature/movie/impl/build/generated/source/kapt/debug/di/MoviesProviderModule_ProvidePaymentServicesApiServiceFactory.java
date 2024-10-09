package di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kz.homebank.base.network.api.network_client.ApiServiceFactory;
import kz.homebank.feature.movie.impl.data.repository.MovieApiService;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
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
public final class MoviesProviderModule_ProvidePaymentServicesApiServiceFactory implements Factory<MovieApiService> {
  private final Provider<ApiServiceFactory> factoryProvider;

  public MoviesProviderModule_ProvidePaymentServicesApiServiceFactory(
      Provider<ApiServiceFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  @Override
  public MovieApiService get() {
    return providePaymentServicesApiService(factoryProvider.get());
  }

  public static MoviesProviderModule_ProvidePaymentServicesApiServiceFactory create(
      Provider<ApiServiceFactory> factoryProvider) {
    return new MoviesProviderModule_ProvidePaymentServicesApiServiceFactory(factoryProvider);
  }

  public static MovieApiService providePaymentServicesApiService(ApiServiceFactory factory) {
    return Preconditions.checkNotNullFromProvides(MoviesProviderModule.INSTANCE.providePaymentServicesApiService(factory));
  }
}
