package kz.homebank.feature.movie.impl.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lkz/homebank/feature/movie/impl/data/repository/MovieApiService;", "", "getMovieDetail", "Lkz/homebank/feature/movie/impl/data/model/MovieDetail;", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPopularMovies", "Lkz/homebank/feature/movie/impl/data/model/MovieResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "v5.34.65(539)_debug"})
public abstract interface MovieApiService {
    
    @retrofit2.http.GET(value = "movie/popular")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getPopularMovies(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kz.homebank.feature.movie.impl.data.model.MovieResponse> $completion);
    
    @retrofit2.http.GET(value = "movie/{movieId}")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMovieDetail(@retrofit2.http.Path(value = "movieId")
    int movieId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kz.homebank.feature.movie.impl.data.model.MovieDetail> $completion);
}