package kz.homebank.libraries.kotlin.serialization

import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.Json
import kz.homebank.libraries.kotlin.api.serialization.Serializer
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
internal class SerializerImpl @Inject constructor(
    private val jsonSerializer: Json
) : Serializer {
    override fun <V : Any> serialize(value: V, serializer: KSerializer<V>): String {
        return jsonSerializer.encodeToString(serializer, value)
    }

    override fun <V> deserialize(json: String?, serializer: KSerializer<V>): V? {
        if (json.isNullOrEmpty()) return null
        return jsonSerializer.decodeFromString(serializer, json)
    }
}