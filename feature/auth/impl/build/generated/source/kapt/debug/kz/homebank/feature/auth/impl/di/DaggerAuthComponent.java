package kz.homebank.feature.auth.impl.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;
import kz.homebank.base.network.api.network_client.ApiServiceFactory;
import kz.homebank.base.network.api.network_utils.NetworkCaller;
import kz.homebank.feature.auth.impl.domain.AuthLoginImpl;
import kz.homebank.feature.auth.impl.presentation.view_model.LoginViewModel;
import kz.homebank.feature.payments.services.impl.data.repository.AuthApiService;
import kz.homebank.feature.payments.services.impl.data.repository.AuthRepository;
import kz.homebank.feature.payments.services.impl.data.repository.AuthRepository_Factory;

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
public final class DaggerAuthComponent {
  private DaggerAuthComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private AuthDependencies authDependencies;

    private Builder() {
    }

    public Builder authDependencies(AuthDependencies authDependencies) {
      this.authDependencies = Preconditions.checkNotNull(authDependencies);
      return this;
    }

    public AuthComponent build() {
      Preconditions.checkBuilderRequirement(authDependencies, AuthDependencies.class);
      return new AuthComponentImpl(authDependencies);
    }
  }

  private static final class AuthComponentImpl implements AuthComponent {
    private final AuthDependencies authDependencies;

    private final AuthComponentImpl authComponentImpl = this;

    private Provider<CoroutineDispatcher> getIoDispatcherProvider;

    private Provider<NetworkCaller> getNetworkCallerProvider;

    private Provider<ApiServiceFactory> getServiceFactoryProvider;

    private Provider<AuthApiService> providePaymentServicesApiServiceProvider;

    private Provider<AuthRepository> authRepositoryProvider;

    private AuthComponentImpl(AuthDependencies authDependenciesParam) {
      this.authDependencies = authDependenciesParam;
      initialize(authDependenciesParam);

    }

    private AuthLoginImpl authLoginImpl() {
      return new AuthLoginImpl(authRepositoryProvider.get(), Preconditions.checkNotNullFromComponent(authDependencies.getAuthTokenHolder()));
    }

    @SuppressWarnings("unchecked")
    private void initialize(final AuthDependencies authDependenciesParam) {
      this.getIoDispatcherProvider = new GetIoDispatcherProvider(authDependenciesParam);
      this.getNetworkCallerProvider = new GetNetworkCallerProvider(authDependenciesParam);
      this.getServiceFactoryProvider = new GetServiceFactoryProvider(authDependenciesParam);
      this.providePaymentServicesApiServiceProvider = DoubleCheck.provider(AuthProviderModule_ProvidePaymentServicesApiServiceFactory.create(getServiceFactoryProvider));
      this.authRepositoryProvider = DoubleCheck.provider(AuthRepository_Factory.create(getIoDispatcherProvider, getNetworkCallerProvider, providePaymentServicesApiServiceProvider));
    }

    @Override
    public LoginViewModel getLoginViewModel() {
      return new LoginViewModel(authLoginImpl());
    }

    private static final class GetIoDispatcherProvider implements Provider<CoroutineDispatcher> {
      private final AuthDependencies authDependencies;

      GetIoDispatcherProvider(AuthDependencies authDependencies) {
        this.authDependencies = authDependencies;
      }

      @Override
      public CoroutineDispatcher get() {
        return Preconditions.checkNotNullFromComponent(authDependencies.getIoDispatcher());
      }
    }

    private static final class GetNetworkCallerProvider implements Provider<NetworkCaller> {
      private final AuthDependencies authDependencies;

      GetNetworkCallerProvider(AuthDependencies authDependencies) {
        this.authDependencies = authDependencies;
      }

      @Override
      public NetworkCaller get() {
        return Preconditions.checkNotNullFromComponent(authDependencies.getNetworkCaller());
      }
    }

    private static final class GetServiceFactoryProvider implements Provider<ApiServiceFactory> {
      private final AuthDependencies authDependencies;

      GetServiceFactoryProvider(AuthDependencies authDependencies) {
        this.authDependencies = authDependencies;
      }

      @Override
      public ApiServiceFactory get() {
        return Preconditions.checkNotNullFromComponent(authDependencies.getServiceFactory());
      }
    }
  }
}
