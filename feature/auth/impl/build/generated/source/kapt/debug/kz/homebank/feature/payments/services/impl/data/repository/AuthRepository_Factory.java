package kz.homebank.feature.payments.services.impl.data.repository;

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
public final class AuthRepository_Factory implements Factory<AuthRepository> {
  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  private final Provider<NetworkCaller> networkCallerProvider;

  private final Provider<AuthApiService> paymentServicesApiServiceV6Provider;

  public AuthRepository_Factory(Provider<CoroutineDispatcher> ioDispatcherProvider,
      Provider<NetworkCaller> networkCallerProvider,
      Provider<AuthApiService> paymentServicesApiServiceV6Provider) {
    this.ioDispatcherProvider = ioDispatcherProvider;
    this.networkCallerProvider = networkCallerProvider;
    this.paymentServicesApiServiceV6Provider = paymentServicesApiServiceV6Provider;
  }

  @Override
  public AuthRepository get() {
    return newInstance(ioDispatcherProvider.get(), networkCallerProvider.get(), paymentServicesApiServiceV6Provider.get());
  }

  public static AuthRepository_Factory create(Provider<CoroutineDispatcher> ioDispatcherProvider,
      Provider<NetworkCaller> networkCallerProvider,
      Provider<AuthApiService> paymentServicesApiServiceV6Provider) {
    return new AuthRepository_Factory(ioDispatcherProvider, networkCallerProvider, paymentServicesApiServiceV6Provider);
  }

  public static AuthRepository newInstance(CoroutineDispatcher ioDispatcher,
      NetworkCaller networkCaller, AuthApiService paymentServicesApiServiceV6) {
    return new AuthRepository(ioDispatcher, networkCaller, paymentServicesApiServiceV6);
  }
}
