package kz.homebank.feature.auth.impl.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kz.homebank.base.network.api.network_client.ApiServiceFactory;
import kz.homebank.feature.payments.services.impl.data.repository.AuthApiService;

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
public final class AuthProviderModule_ProvidePaymentServicesApiServiceFactory implements Factory<AuthApiService> {
  private final Provider<ApiServiceFactory> factoryProvider;

  public AuthProviderModule_ProvidePaymentServicesApiServiceFactory(
      Provider<ApiServiceFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  @Override
  public AuthApiService get() {
    return providePaymentServicesApiService(factoryProvider.get());
  }

  public static AuthProviderModule_ProvidePaymentServicesApiServiceFactory create(
      Provider<ApiServiceFactory> factoryProvider) {
    return new AuthProviderModule_ProvidePaymentServicesApiServiceFactory(factoryProvider);
  }

  public static AuthApiService providePaymentServicesApiService(ApiServiceFactory factory) {
    return Preconditions.checkNotNullFromProvides(AuthProviderModule.INSTANCE.providePaymentServicesApiService(factory));
  }
}
