package presentation.popular_movies;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import domain.GetPopularMoviesImpl;
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
public final class PopularMovieViewModel_Factory implements Factory<PopularMovieViewModel> {
  private final Provider<GetPopularMoviesImpl> getPopularMoviesImplProvider;

  public PopularMovieViewModel_Factory(
      Provider<GetPopularMoviesImpl> getPopularMoviesImplProvider) {
    this.getPopularMoviesImplProvider = getPopularMoviesImplProvider;
  }

  @Override
  public PopularMovieViewModel get() {
    return newInstance(getPopularMoviesImplProvider.get());
  }

  public static PopularMovieViewModel_Factory create(
      Provider<GetPopularMoviesImpl> getPopularMoviesImplProvider) {
    return new PopularMovieViewModel_Factory(getPopularMoviesImplProvider);
  }

  public static PopularMovieViewModel newInstance(GetPopularMoviesImpl getPopularMoviesImpl) {
    return new PopularMovieViewModel(getPopularMoviesImpl);
  }
}
