package kz.homebank.feature.auth.impl.presentation.view_model;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kz.homebank.feature.auth.impl.domain.AuthLoginImpl;

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
public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
  private final Provider<AuthLoginImpl> authLoginImplProvider;

  public LoginViewModel_Factory(Provider<AuthLoginImpl> authLoginImplProvider) {
    this.authLoginImplProvider = authLoginImplProvider;
  }

  @Override
  public LoginViewModel get() {
    return newInstance(authLoginImplProvider.get());
  }

  public static LoginViewModel_Factory create(Provider<AuthLoginImpl> authLoginImplProvider) {
    return new LoginViewModel_Factory(authLoginImplProvider);
  }

  public static LoginViewModel newInstance(AuthLoginImpl authLoginImpl) {
    return new LoginViewModel(authLoginImpl);
  }
}
