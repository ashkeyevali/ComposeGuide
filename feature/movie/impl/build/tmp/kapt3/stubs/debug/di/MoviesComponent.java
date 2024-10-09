package di;

@javax.inject.Singleton
@dagger.Component(dependencies = {di.MoviesDependencies.class}, modules = {di.MoviesProviderModule.class})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u0000 \n2\u00020\u0001:\u0001\nR\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000b"}, d2 = {"Ldi/MoviesComponent;", "Lkz/homebank/feature/movie/api/MoviesApi;", "movieDetailsViewModel", "Lpresentation/movie_detail/MovieDetailViewModel;", "getMovieDetailsViewModel", "()Lpresentation/movie_detail/MovieDetailViewModel;", "popularMovieViewModel", "Lpresentation/popular_movies/PopularMovieViewModel;", "getPopularMovieViewModel", "()Lpresentation/popular_movies/PopularMovieViewModel;", "Companion", "v5.34.65(539)_debug"})
public abstract interface MoviesComponent extends kz.homebank.feature.movie.api.MoviesApi {
    @org.jetbrains.annotations.NotNull
    public static final di.MoviesComponent.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull
    public abstract presentation.popular_movies.PopularMovieViewModel getPopularMovieViewModel();
    
    @org.jetbrains.annotations.NotNull
    public abstract presentation.movie_detail.MovieDetailViewModel getMovieDetailsViewModel();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Ldi/MoviesComponent$Companion;", "", "()V", "initAndGet", "Ldi/MoviesComponent;", "dependencies", "Ldi/MoviesDependencies;", "v5.34.65(539)_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final di.MoviesComponent initAndGet(@org.jetbrains.annotations.NotNull
        di.MoviesDependencies dependencies) {
            return null;
        }
    }
}