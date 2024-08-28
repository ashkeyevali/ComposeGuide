package kz.homebank.libraries.kotlin.api.serialization

import kotlinx.serialization.KSerializer
import kotlinx.serialization.serializer

interface Serializer {
    fun <V : Any> serialize(value: V, serializer: KSerializer<V>): String
    fun <V> deserialize(json: String?, serializer: KSerializer<V>): V?
}

inline fun <reified V : Any> Serializer.serialize(value: V): String {
    return serialize(value, serializer())
}

inline fun <reified V> Serializer.deserialize(json: String): V? {
    return deserialize(json, serializer())
}