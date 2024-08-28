package kz.homebank.preference.api.domain.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.serialization.KSerializer
import kotlin.reflect.KClass

interface PreferenceRepository {
    /**
     * Put [value] with the specified [key] to the preference. Pass [kserializer] if you have custom
     * object type
     */
    fun <V : Any> put(key: String, value: V, kserializer: KSerializer<V>? = null)

    fun remove(key: String)

    /**
     * Get value[V] with the specified [key]. Pass [kserializer] if you have custom object type
     */
    fun <V : Any> get(
        clazz: KClass<V>,
        key: String,
        kserializer: KSerializer<V>? = null
    ): V?

    /**
     * Get value[V] as a [Flow] with the specified [key]. Pass [kserializer] if you have custom object type
     */
    fun <V : Any> getAsFlow(
        clazz: KClass<V>,
        key: String,
        kserializer: KSerializer<V>? = null
    ): Flow<V?>
}

inline fun <reified V : Any> PreferenceRepository.get(
    key: String,
    kserializer: KSerializer<V>? = null
): V? {
    return get(V::class, key, kserializer)
}

inline fun <reified V : Any> PreferenceRepository.getAsFlow(
    key: String,
    kserializer: KSerializer<V>? = null
): Flow<V?> {
    return getAsFlow(V::class, key, kserializer)
}