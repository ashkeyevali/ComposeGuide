package presentation.popular_movies

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import domain.GetPopularMoviesImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import presentation.popular_movies.model.PopularMovieState
import javax.inject.Inject
import kz.homebank.base.domain.result.Result

internal class PopularMovieViewModel  @Inject constructor(
    private val getPopularMoviesImpl: GetPopularMoviesImpl
): ViewModel() {
    private val _viewState = MutableStateFlow(PopularMovieState())
    val viewState: StateFlow<PopularMovieState> = _viewState

    private val _navigateToMovieDetail = MutableStateFlow<Pair<Boolean, Int>>(Pair(false, 0))
    val navigateToMovieDetail: StateFlow<Pair<Boolean, Int>> = _navigateToMovieDetail
    init {
        getPopularMovies()
    }

    private fun getPopularMovies() {
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

    fun onNavigateToMovieDetail(id: Int) {
        _navigateToMovieDetail.value = Pair(true, id)
    }

    fun onNavigationDone(navigation: Pair<Boolean, Int>) {
        _navigateToMovieDetail.value = navigation
    }
}