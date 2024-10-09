package domain;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kz.homebank.feature.movie.impl.data.repository.MovieRepository;

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
public final class GetMovieDetailImpl_Factory implements Factory<GetMovieDetailImpl> {
  private final Provider<MovieRepository> movieRepositoryProvider;

  public GetMovieDetailImpl_Factory(Provider<MovieRepository> movieRepositoryProvider) {
    this.movieRepositoryProvider = movieRepositoryProvider;
  }

  @Override
  public GetMovieDetailImpl get() {
    return newInstance(movieRepositoryProvider.get());
  }

  public static GetMovieDetailImpl_Factory create(
      Provider<MovieRepository> movieRepositoryProvider) {
    return new GetMovieDetailImpl_Factory(movieRepositoryProvider);
  }

  public static GetMovieDetailImpl newInstance(MovieRepository movieRepository) {
    return new GetMovieDetailImpl(movieRepository);
  }
}
