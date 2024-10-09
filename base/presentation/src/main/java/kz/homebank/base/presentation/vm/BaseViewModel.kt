package kz.homebank.base.presentation.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import androidx.paging.map
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kz.homebank.base.domain.result.Result
import kz.homebank.base.network.exception.ErrorResponseException
import kz.homebank.base.network.exception.NoInternetException
import kz.homebank.base.network.model.PaymentResponseException
import kz.homebank.base.network.model.ResponseError
import kz.homebank.base.presentation.di.PresentationComponentHolder
import kz.homebank.base.presentation.livedata.Event
import kz.homebank.base.presentation.text.PlainText
import kz.homebank.base.presentation.text.ResourceText
import kz.homebank.base.presentation.text.UiText
import kz.homebank.base.presentation.text.asString
import kz.homebank.libraries.resources.ResourceString

abstract class BaseViewModel : ViewModel() {
    protected val _toast = MutableLiveData<Event<UiText>>()
    val toast: LiveData<Event<UiText>> get() = _toast

    protected val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> get() = _isLoading

    protected val _noConnection = MutableLiveData<Event<Unit>>()
    val noConnection: LiveData<Event<Unit>> get() = _noConnection

    protected val serializer
        get() = PresentationComponentHolder.getComponent().serializer

    protected inline fun withLoading(action: () -> Unit) {
        _isLoading.value = true
        action()
        _isLoading.value = false
    }

   protected fun <T> networkRequest(
        request: suspend () -> T,
        onSuccess: suspend (T) -> Unit = {},
        onLoading: suspend (Boolean) -> Unit = {},
        onError: (suspend (Throwable) -> Unit)? = null,
        finally: () -> Unit = { },
    ) = viewModelScope.launch(Dispatchers.IO) {
        try {
            onLoading.invoke(true)
            val response = request()
            onSuccess(response)
        } catch (ex: Throwable) {
            withContext(Dispatchers.Main) {
                try {
                    onError?.invoke(ex) ?: handleException(ex)
                } catch (ex: Throwable) {
                    handleException(ex)
                }
            }
        } finally {
            finally.invoke()
            onLoading.invoke(false)
        }
    }

    protected fun <R> handleResult(
        result: Result<R>, onError: ((ResponseError) -> Unit)? = null, onSuccess: (R) -> Unit
    ) {
        _isLoading.value = result is Result.Loading
        when (result) {
            is Result.Error -> handleException(result.exception, onError)
            is Result.Success -> onSuccess(result.data)
            else -> {}
        }
    }

    protected fun handleException(
        exception: Throwable,
        onError: ((ResponseError) -> Unit)? = null,
    ) {
        when (exception) {
            is ErrorResponseException -> {
                val responseError =
                    serializer.deserialize(exception.jsonResponse, ResponseError.serializer())
                if (onError == null) {
                    val errorMessage = responseError?.resultDescription
                    val uiText = if (errorMessage.isNullOrEmpty()) {
                        ResourceText(ResourceString.all_generic_error)
                    } else {
                        PlainText(errorMessage)
                    }
                    _toast.value = Event(uiText)
                } else {
                    if (responseError == null) {
                        _toast.value = Event(ResourceText(ResourceString.all_generic_error))
                    } else {
                        onError(responseError)
                    }
                }
            }
            is NoInternetException -> {
                _noConnection.value = Event(Unit)
            }
            else -> {
                _toast.value = Event(ResourceText(ResourceString.all_generic_error))
            }
        }
    }

    protected fun <R> handlePaymentResult(
        result: Result<R>,
        onError: ((ResponseError) -> Unit)? = null,
        onSuccess: (R) -> Unit
    ) {
        when (result) {
            is Result.Error -> handlePaymentException(result.exception, onError)
            is Result.Success -> onSuccess(result.data)
            else -> {}
        }
    }

    private fun handlePaymentException(
        exception: Throwable,
        onError: ((ResponseError) -> Unit)? = null,
    ) {
        when (exception) {
            is ErrorResponseException -> {
                try {
                    val responseError = serializer.deserialize(exception.jsonResponse, ResponseError.serializer())
                    if (onError == null) {
                        val errorMessage = responseError?.resultDescription
                        val uiText = if (errorMessage.isNullOrEmpty()) {
                            ResourceText(ResourceString.all_generic_error)
                        } else {
                            PlainText(errorMessage)
                        }
                        _toast.value = Event(uiText)
                    } else {
                        if (responseError == null) {
                            _toast.value = Event(ResourceText(ResourceString.all_generic_error))
                        } else {
                            onError(responseError)
                        }
                    }
                } catch (e: Exception) {
                    if (onError == null) {
                        _toast.value = Event(ResourceText(ResourceString.all_generic_error))
                    } else {
                        onError(ResponseError(-1, e.localizedMessage))
                    }
                }
            }
            is PaymentResponseException -> {
                val responseError =
                    try {   exception  }
                    catch (e: Exception) { null }
                if (onError == null) {
                    val errorMessage = responseError?.resultCodeDescription
                    val uiText = if (errorMessage.isNullOrEmpty()) {
                        ResourceText(ResourceString.all_generic_error)
                    } else {
                        PlainText(errorMessage)
                    }
                    _toast.value = Event(uiText)
                } else {
                    if (responseError == null) {
                        _toast.value = Event(ResourceText(ResourceString.all_generic_error))
                    } else {
                        onError(ResponseError(responseError.resultCode?:-1, responseError.resultCodeDescription))
                    }
                }
            }
            is NoInternetException -> {
                _noConnection.value = Event(Unit)
            }
            else -> {
                _toast.value = Event(ResourceText(ResourceString.all_generic_error))
            }
        }
    }

    protected fun <T> Flow<Result<T>>.onResultSuccess(onSuccess: (T) -> Unit): Flow<Result<T>> {
        return onEach { result ->
            handleResult(result, onSuccess = onSuccess)
        }
    }

    protected fun <T : Any, S : Any> Flow<PagingData<T>>.collectPagingRequest(
        mappedData: (T) -> S
    ) = map { it.map { data -> mappedData(data) } }.cachedIn(viewModelScope)

}
