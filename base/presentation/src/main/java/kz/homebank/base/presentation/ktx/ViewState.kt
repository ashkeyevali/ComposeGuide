package kz.homebank.base.presentation.ktx

sealed class ViewState<out T : Any> {
    object Loading : ViewState<Nothing>()
    data class Data<out T : Any>(val data: T) : ViewState<T>()
    data class Error<out T : Any>(
        val error: Throwable,
        val errorData: T? = null,
    ) : ViewState<T>()
}