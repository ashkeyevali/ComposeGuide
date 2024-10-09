package presentation.movie_detail;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lpresentation/movie_detail/MovieDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "getMovieDetailImpl", "Ldomain/GetMovieDetailImpl;", "(Ldomain/GetMovieDetailImpl;)V", "_viewState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lpresentation/movie_detail/model/MovieDetailState;", "viewState", "Lkotlinx/coroutines/flow/StateFlow;", "getViewState", "()Lkotlinx/coroutines/flow/StateFlow;", "getMovieDetail", "", "id", "", "v5.34.65(539)_debug"})
public final class MovieDetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final domain.GetMovieDetailImpl getMovieDetailImpl = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<presentation.movie_detail.model.MovieDetailState> _viewState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<presentation.movie_detail.model.MovieDetailState> viewState = null;
    
    @javax.inject.Inject
    public MovieDetailViewModel(@org.jetbrains.annotations.NotNull
    domain.GetMovieDetailImpl getMovieDetailImpl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<presentation.movie_detail.model.MovieDetailState> getViewState() {
        return null;
    }
    
    public final void getMovieDetail(int id) {
    }
}