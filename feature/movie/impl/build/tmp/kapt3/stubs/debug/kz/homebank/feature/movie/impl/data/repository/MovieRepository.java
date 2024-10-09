package kz.homebank.feature.movie.impl.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lkz/homebank/feature/movie/impl/data/repository/MovieRepository;", "", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "networkCaller", "Lkz/homebank/base/network/api/network_utils/NetworkCaller;", "apiServices", "Lkz/homebank/feature/movie/impl/data/repository/MovieApiService;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkz/homebank/base/network/api/network_utils/NetworkCaller;Lkz/homebank/feature/movie/impl/data/repository/MovieApiService;)V", "getMovieDetail", "Lkz/homebank/feature/movie/impl/data/model/MovieDetail;", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPopularMovies", "Lkz/homebank/feature/movie/impl/data/model/MovieResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "v5.34.65(539)_debug"})
public final class MovieRepository {
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    @org.jetbrains.annotations.NotNull
    private final kz.homebank.base.network.api.network_utils.NetworkCaller networkCaller = null;
    @org.jetbrains.annotations.NotNull
    private final kz.homebank.feature.movie.impl.data.repository.MovieApiService apiServices = null;
    
    @javax.inject.Inject
    public MovieRepository(@kz.homebank.libraries.kotlin.api.coroutine.IoDispatcher
    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher, @org.jetbrains.annotations.NotNull
    kz.homebank.base.network.api.network_utils.NetworkCaller networkCaller, @org.jetbrains.annotations.NotNull
    kz.homebank.feature.movie.impl.data.repository.MovieApiService apiServices) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getPopularMovies(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kz.homebank.feature.movie.impl.data.model.MovieResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getMovieDetail(int movieId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kz.homebank.feature.movie.impl.data.model.MovieDetail> $completion) {
        return null;
    }
}