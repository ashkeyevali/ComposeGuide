package kz.homebank.feature.auth.impl.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlin.Pair;
import kotlinx.coroutines.flow.MutableStateFlow;
import kz.homebank.feature.payments.services.impl.data.model.AuthModel;

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
public final class AuthProviderModule_ProvideTokenAndUserFlowFactory implements Factory<MutableStateFlow<Pair<AuthModel, String>>> {
  @Override
  public MutableStateFlow<Pair<AuthModel, String>> get() {
    return provideTokenAndUserFlow();
  }

  public static AuthProviderModule_ProvideTokenAndUserFlowFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MutableStateFlow<Pair<AuthModel, String>> provideTokenAndUserFlow() {
    return Preconditions.checkNotNullFromProvides(AuthProviderModule.INSTANCE.provideTokenAndUserFlow());
  }

  private static final class InstanceHolder {
    private static final AuthProviderModule_ProvideTokenAndUserFlowFactory INSTANCE = new AuthProviderModule_ProvideTokenAndUserFlowFactory();
  }
}
