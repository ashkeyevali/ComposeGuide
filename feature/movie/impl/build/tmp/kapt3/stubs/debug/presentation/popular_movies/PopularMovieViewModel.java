package presentation.popular_movies;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0018"}, d2 = {"Lpresentation/popular_movies/PopularMovieViewModel;", "Landroidx/lifecycle/ViewModel;", "getPopularMoviesImpl", "Ldomain/GetPopularMoviesImpl;", "(Ldomain/GetPopularMoviesImpl;)V", "_viewAction", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lpresentation/popular_movies/model/PopularMoviesAction;", "_viewState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lpresentation/popular_movies/model/PopularMovieState;", "viewAction", "Lkotlinx/coroutines/flow/SharedFlow;", "getViewAction", "()Lkotlinx/coroutines/flow/SharedFlow;", "viewState", "Lkotlinx/coroutines/flow/StateFlow;", "getViewState", "()Lkotlinx/coroutines/flow/StateFlow;", "getPopularMovies", "", "obtainEvent", "viewEvent", "Lpresentation/popular_movies/model/PopularMoviesEvent;", "v5.34.65(539)_debug"})
public final class PopularMovieViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final domain.GetPopularMoviesImpl getPopularMoviesImpl = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<presentation.popular_movies.model.PopularMovieState> _viewState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<presentation.popular_movies.model.PopularMovieState> viewState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<presentation.popular_movies.model.PopularMoviesAction> _viewAction = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.SharedFlow<presentation.popular_movies.model.PopularMoviesAction> viewAction = null;
    
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
    public final kotlinx.coroutines.flow.SharedFlow<presentation.popular_movies.model.PopularMoviesAction> getViewAction() {
        return null;
    }
    
    public final void obtainEvent(@org.jetbrains.annotations.NotNull
    presentation.popular_movies.model.PopularMoviesEvent viewEvent) {
    }
    
    public final void getPopularMovies() {
    }
}