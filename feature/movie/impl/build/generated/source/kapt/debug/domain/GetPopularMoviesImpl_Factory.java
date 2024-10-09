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
public final class GetPopularMoviesImpl_Factory implements Factory<GetPopularMoviesImpl> {
  private final Provider<MovieRepository> movieRepositoryProvider;

  public GetPopularMoviesImpl_Factory(Provider<MovieRepository> movieRepositoryProvider) {
    this.movieRepositoryProvider = movieRepositoryProvider;
  }

  @Override
  public GetPopularMoviesImpl get() {
    return newInstance(movieRepositoryProvider.get());
  }

  public static GetPopularMoviesImpl_Factory create(
      Provider<MovieRepository> movieRepositoryProvider) {
    return new GetPopularMoviesImpl_Factory(movieRepositoryProvider);
  }

  public static GetPopularMoviesImpl newInstance(MovieRepository movieRepository) {
    return new GetPopularMoviesImpl(movieRepository);
  }
}
