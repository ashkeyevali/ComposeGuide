package presentation.popular_movies;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\tJ\u001a\u0010\u0016\u001a\u00020\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f\u00a8\u0006\u0018"}, d2 = {"Lpresentation/popular_movies/PopularMovieViewModel;", "Landroidx/lifecycle/ViewModel;", "getPopularMoviesImpl", "Ldomain/GetPopularMoviesImpl;", "(Ldomain/GetPopularMoviesImpl;)V", "_navigateToMovieDetail", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlin/Pair;", "", "", "_viewState", "Lpresentation/popular_movies/model/PopularMovieState;", "navigateToMovieDetail", "Lkotlinx/coroutines/flow/StateFlow;", "getNavigateToMovieDetail", "()Lkotlinx/coroutines/flow/StateFlow;", "viewState", "getViewState", "getPopularMovies", "", "onNavigateToMovieDetail", "id", "onNavigationDone", "navigation", "v5.34.65(539)_debug"})
public final class PopularMovieViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final domain.GetPopularMoviesImpl getPopularMoviesImpl = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<presentation.popular_movies.model.PopularMovieState> _viewState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<presentation.popular_movies.model.PopularMovieState> viewState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<kotlin.Pair<java.lang.Boolean, java.lang.Integer>> _navigateToMovieDetail = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<kotlin.Pair<java.lang.Boolean, java.lang.Integer>> navigateToMovieDetail = null;
    
    @javax.inject.Inject
    public PopularMovieViewModel(@org.jetbrains.annotations.NotNull
    domain.GetPopularMoviesImpl getPopularMoviesImpl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<presentation.popular_movies.model.PopularMovieState> getViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<kotlin.Pair<java.lang.Boolean, java.lang.Integer>> getNavigateToMovieDetail() {
        return null;
    }
    
    private final void getPopularMovies() {
    }
    
    public final void onNavigateToMovieDetail(int id) {
    }
    
    public final void onNavigationDone(@org.jetbrains.annotations.NotNull
    kotlin.Pair<java.lang.Boolean, java.lang.Integer> navigation) {
    }
}