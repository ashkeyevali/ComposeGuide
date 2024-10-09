package kz.homebank.base.presentation.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import kz.homebank.libraries.kotlin.api.serialization.Serializer;

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
public final class DaggerPresentationComponent {
  private DaggerPresentationComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private PresentationDependencies presentationDependencies;

    private Builder() {
    }

    public Builder presentationDependencies(PresentationDependencies presentationDependencies) {
      this.presentationDependencies = Preconditions.checkNotNull(presentationDependencies);
      return this;
    }

    public PresentationComponent build() {
      Preconditions.checkBuilderRequirement(presentationDependencies, PresentationDependencies.class);
      return new PresentationComponentImpl(presentationDependencies);
    }
  }

  private static final class PresentationComponentImpl implements PresentationComponent {
    private final PresentationDependencies presentationDependencies;

    private final PresentationComponentImpl presentationComponentImpl = this;

    private PresentationComponentImpl(PresentationDependencies presentationDependenciesParam) {
      this.presentationDependencies = presentationDependenciesParam;

    }

    @Override
    public Serializer getSerializer() {
      return Preconditions.checkNotNullFromComponent(presentationDependencies.getSerializer());
    }
  }
}
