package presentation.movie_detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import domain.GetMovieDetailImpl
import domain.GetPopularMoviesImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import presentation.popular_movies.model.PopularMovieState
import javax.inject.Inject
import kz.homebank.base.domain.result.Result
import presentation.movie_detail.model.MovieDetailState

internal class MovieDetailViewModel  @Inject constructor(
    private val getMovieDetailImpl: GetMovieDetailImpl
): ViewModel() {
    private val _viewState = MutableStateFlow(MovieDetailState())
    val viewState: StateFlow<MovieDetailState> = _viewState


    fun getMovieDetail(id: Int) {
        _viewState.value = _viewState.value.copy(isLoading = true)

        viewModelScope.launch {
            when(val result = getMovieDetailImpl.invoke(id)) {
                is Result.Success -> {
                    _viewState.value = _viewState.value.copy(
                        movieDetail = result.data,
                        isLoading = false,
                        error = null
                    )
                }
                is Result.Error -> {
                    _viewState.value = _viewState.value.copy(
                        movieDetail = null,
                        isLoading = false,
                        error = result.exception.localizedMessage
                    )
                }
                else -> {}
            }
        }
    }


}