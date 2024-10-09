package di;

import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import domain.GetMovieDetailImpl;
import domain.GetPopularMoviesImpl;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;
import kz.homebank.base.network.api.network_client.ApiServiceFactory;
import kz.homebank.base.network.api.network_utils.NetworkCaller;
import kz.homebank.feature.movie.impl.data.repository.MovieApiService;
import kz.homebank.feature.movie.impl.data.repository.MovieRepository;
import kz.homebank.feature.movie.impl.data.repository.MovieRepository_Factory;
import presentation.movie_detail.MovieDetailViewModel;
import presentation.popular_movies.PopularMovieViewModel;

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
public final class DaggerMoviesComponent {
  private DaggerMoviesComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private MoviesDependencies moviesDependencies;

    private Builder() {
    }

    public Builder moviesDependencies(MoviesDependencies moviesDependencies) {
      this.moviesDependencies = Preconditions.checkNotNull(moviesDependencies);
      return this;
    }

    public MoviesComponent build() {
      Preconditions.checkBuilderRequirement(moviesDependencies, MoviesDependencies.class);
      return new MoviesComponentImpl(moviesDependencies);
    }
  }

  private static final class MoviesComponentImpl implements MoviesComponent {
    private final MoviesComponentImpl moviesComponentImpl = this;

    private Provider<CoroutineDispatcher> getIoDispatcherProvider;

    private Provider<NetworkCaller> getNetworkCallerProvider;

    private Provider<ApiServiceFactory> getServiceFactoryProvider;

    private Provider<MovieApiService> providePaymentServicesApiServiceProvider;

    private Provider<MovieRepository> movieRepositoryProvider;

    private MoviesComponentImpl(MoviesDependencies moviesDependenciesParam) {

      initialize(moviesDependenciesParam);

    }

    private GetPopularMoviesImpl getPopularMoviesImpl() {
      return new GetPopularMoviesImpl(movieRepositoryProvider.get());
    }

    private GetMovieDetailImpl getMovieDetailImpl() {
      return new GetMovieDetailImpl(movieRepositoryProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final MoviesDependencies moviesDependenciesParam) {
      this.getIoDispatcherProvider = new GetIoDispatcherProvider(moviesDependenciesParam);
      this.getNetworkCallerProvider = new GetNetworkCallerProvider(moviesDependenciesParam);
      this.getServiceFactoryProvider = new GetServiceFactoryProvider(moviesDependenciesParam);
      this.providePaymentServicesApiServiceProvider = DoubleCheck.provider(MoviesProviderModule_ProvidePaymentServicesApiServiceFactory.create(getServiceFactoryProvider));
      this.movieRepositoryProvider = DoubleCheck.provider(MovieRepository_Factory.create(getIoDispatcherProvider, getNetworkCallerProvider, providePaymentServicesApiServiceProvider));
    }

    @Override
    public PopularMovieViewModel getPopularMovieViewModel() {
      return new PopularMovieViewModel(getPopularMoviesImpl());
    }

    @Override
    public MovieDetailViewModel getMovieDetailsViewModel() {
      return new MovieDetailViewModel(getMovieDetailImpl());
    }

    private static final class GetIoDispatcherProvider implements Provider<CoroutineDispatcher> {
      private final MoviesDependencies moviesDependencies;

      GetIoDispatcherProvider(MoviesDependencies moviesDependencies) {
        this.moviesDependencies = moviesDependencies;
      }

      @Override
      public CoroutineDispatcher get() {
        return Preconditions.checkNotNullFromComponent(moviesDependencies.getIoDispatcher());
      }
    }

    private static final class GetNetworkCallerProvider implements Provider<NetworkCaller> {
      private final MoviesDependencies moviesDependencies;

      GetNetworkCallerProvider(MoviesDependencies moviesDependencies) {
        this.moviesDependencies = moviesDependencies;
      }

      @Override
      public NetworkCaller get() {
        return Preconditions.checkNotNullFromComponent(moviesDependencies.getNetworkCaller());
      }
    }

    private static final class GetServiceFactoryProvider implements Provider<ApiServiceFactory> {
      private final MoviesDependencies moviesDependencies;

      GetServiceFactoryProvider(MoviesDependencies moviesDependencies) {
        this.moviesDependencies = moviesDependencies;
      }

      @Override
      public ApiServiceFactory get() {
        return Preconditions.checkNotNullFromComponent(moviesDependencies.getServiceFactory());
      }
    }
  }
}
