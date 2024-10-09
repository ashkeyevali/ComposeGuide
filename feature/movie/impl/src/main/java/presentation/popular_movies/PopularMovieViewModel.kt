package presentation.popular_movies

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import domain.GetPopularMoviesImpl
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import presentation.popular_movies.model.PopularMovieState
import javax.inject.Inject
import kz.homebank.base.domain.result.Result
import presentation.popular_movies.model.PopularMoviesAction
import presentation.popular_movies.model.PopularMoviesEvent

internal class PopularMovieViewModel  @Inject constructor(
    private val getPopularMoviesImpl: GetPopularMoviesImpl
): ViewModel() {
    private val _viewState = MutableStateFlow(PopularMovieState())
    val viewState: StateFlow<PopularMovieState> = _viewState

    private val _viewAction = MutableSharedFlow<PopularMoviesAction>(replay = 1, onBufferOverflow = BufferOverflow.DROP_OLDEST)
    val viewAction: SharedFlow<PopularMoviesAction> = _viewAction

    init {
        getPopularMovies()
    }

    fun obtainEvent(viewEvent: PopularMoviesEvent) {
        when(viewEvent){
            is PopularMoviesEvent.MovieClicked ->
                _viewAction.tryEmit(PopularMoviesAction.OpenDetailScreen(viewEvent.movieId))
        }
    }

    fun getPopularMovies() {
        _viewState.value = _viewState.value.copy(isLoading = true)

        viewModelScope.launch {
            when(val result = getPopularMoviesImpl.invoke()) {
                is Result.Success -> {
                    _viewState.value = _viewState.value.copy(
                        selectedMovie = null,
                        isLoading = false,
                        movies = result.data.results,
                        error = null
                    )
                }
                is Result.Error -> {
                    _viewState.value = _viewState.value.copy(
                        movies = emptyList(),
                        selectedMovie = null,
                        isLoading = false,
                        error = result.exception.localizedMessage
                    )
                }
                else -> {}
            }
        }
    }
}