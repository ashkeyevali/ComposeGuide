package presentation.movie_detail;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import domain.GetMovieDetailImpl;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class MovieDetailViewModel_Factory implements Factory<MovieDetailViewModel> {
  private final Provider<GetMovieDetailImpl> getMovieDetailImplProvider;

  public MovieDetailViewModel_Factory(Provider<GetMovieDetailImpl> getMovieDetailImplProvider) {
    this.getMovieDetailImplProvider = getMovieDetailImplProvider;
  }

  @Override
  public MovieDetailViewModel get() {
    return newInstance(getMovieDetailImplProvider.get());
  }

  public static MovieDetailViewModel_Factory create(
      Provider<GetMovieDetailImpl> getMovieDetailImplProvider) {
    return new MovieDetailViewModel_Factory(getMovieDetailImplProvider);
  }

  public static MovieDetailViewModel newInstance(GetMovieDetailImpl getMovieDetailImpl) {
    return new MovieDetailViewModel(getMovieDetailImpl);
  }
}
