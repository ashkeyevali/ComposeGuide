package kz.homebank.base.presentation.ktx

import kotlinx.serialization.KSerializer
import kotlinx.serialization.serializer
import kz.homebank.base.network.exception.ErrorResponseException
import kz.homebank.base.presentation.di.PresentationComponentHolder

fun <E : Any> ErrorResponseException.map(kSerializer: KSerializer<E>): E? {
    val serializer = PresentationComponentHolder.getComponent().serializer
    return serializer.deserialize(jsonResponse, kSerializer)
}

fun <E : Any> Throwable.map(kSerializer: KSerializer<E>): E? {
    return (this as? ErrorResponseException)?.map(kSerializer)
}

inline fun <reified E> Throwable.map(): E? {
    return map(serializer())
}
