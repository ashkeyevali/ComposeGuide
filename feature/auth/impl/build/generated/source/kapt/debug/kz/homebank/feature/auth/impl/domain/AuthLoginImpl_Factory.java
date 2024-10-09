package kz.homebank.feature.auth.impl.domain;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.flow.MutableStateFlow;
import kz.homebank.feature.payments.services.impl.data.repository.AuthRepository;

@ScopeMetadata
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
public final class AuthLoginImpl_Factory implements Factory<AuthLoginImpl> {
  private final Provider<AuthRepository> paymentServicesRepositoryProvider;

  private final Provider<MutableStateFlow<String>> authTokenHolderProvider;

  public AuthLoginImpl_Factory(Provider<AuthRepository> paymentServicesRepositoryProvider,
      Provider<MutableStateFlow<String>> authTokenHolderProvider) {
    this.paymentServicesRepositoryProvider = paymentServicesRepositoryProvider;
    this.authTokenHolderProvider = authTokenHolderProvider;
  }

  @Override
  public AuthLoginImpl get() {
    return newInstance(paymentServicesRepositoryProvider.get(), authTokenHolderProvider.get());
  }

  public static AuthLoginImpl_Factory create(
      Provider<AuthRepository> paymentServicesRepositoryProvider,
      Provider<MutableStateFlow<String>> authTokenHolderProvider) {
    return new AuthLoginImpl_Factory(paymentServicesRepositoryProvider, authTokenHolderProvider);
  }

  public static AuthLoginImpl newInstance(AuthRepository paymentServicesRepository,
      MutableStateFlow<String> authTokenHolder) {
    return new AuthLoginImpl(paymentServicesRepository, authTokenHolder);
  }
}
