package kz.homebank.base.presentation.ktx


val <T : Any> ViewState<T>.dataOrNull: T?
    get() = (this as? ViewState.Data)?.data


inline fun <reified T> Any?.castOrNull(): T? {
    return this as? T
}