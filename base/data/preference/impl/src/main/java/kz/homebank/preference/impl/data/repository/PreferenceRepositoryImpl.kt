package kz.homebank.preference.impl.data.repository

import android.content.SharedPreferences
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.serialization.KSerializer
import kz.homebank.libraries.kotlin.api.serialization.Serializer
import kz.homebank.preference.api.domain.repository.PreferenceRepository
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.reflect.KClass

@Singleton
internal class PreferenceRepositoryImpl @Inject constructor(
    private val preference: SharedPreferences,
    private val serializer: Serializer
) : PreferenceRepository {

    private val flows = mutableMapOf<String, MutableStateFlow<*>>()

    override fun <V : Any> put(key: String, value: V, kserializer: KSerializer<V>?) {
        if (kserializer == null) {
            putAsStandardType(key, value)
        } else {
            putAsSerializedObject(key, value, kserializer)
        }

        (flows[key] as MutableStateFlow<V?>?)?.let { it.value = value }
    }

    private fun <V : Any> putAsStandardType(key: String, value: V) {
        when(value) {
            is Boolean -> editInternal { putBoolean(key, value) }
            is Int -> editInternal { putInt(key, value) }
            is Long -> editInternal { putLong(key, value) }
            is Float -> editInternal { putFloat(key, value) }
            is String -> editInternal { putString(key, value) }
            is Set<*> -> {
                val filtered = value.filterIsInstance<String>()
                if (filtered.isNotEmpty()) {
                    editInternal { putStringSet(key, filtered.toSet()) }
                }
            }
            else -> {
                throw UnsupportedOperationException("Cannot find preference casting")
            }
        }
    }

    private fun <V : Any> putAsSerializedObject(key: String, value: V, kserializer: KSerializer<V>) {
        val json = serializer.serialize(value, kserializer)
        editInternal { putString(key, json) }
    }

    private inline fun editInternal(action: SharedPreferences.Editor.() -> Unit) {
        preference.edit().apply {
            action()
            apply()
        }
    }

    override fun remove(key: String) {
        editInternal { remove(key) }
    }

    override fun <V : Any> get(
        clazz: KClass<V>,
        key: String,
        kserializer: KSerializer<V>?
    ): V? {
        if (!preference.contains(key)) return null

        return if (kserializer == null) {
            getAsStandardType(clazz, key)
        } else {
            return getAsSerializedObject(key, kserializer)
        }
    }

    @Suppress("IMPLICIT_CAST_TO_ANY")
    private fun <V : Any> getAsStandardType(clazz: KClass<V>, key: String): V? {
        with(preference) {
            val result = when (clazz) {
                Boolean::class -> getBoolean(key, false)
                Int::class -> getInt(key, 0)
                Long::class -> getLong(key, 0)
                Float::class -> getFloat(key, 0f)
                String::class -> getString(key, null)
                Set::class -> getStringSet(key, null)
                else -> {
                    throw UnsupportedOperationException("Cannot find preference casting")
                }
            }
            return result as V?
        }
    }

    private fun <V> getAsSerializedObject(key: String, kSerializer: KSerializer<V>): V? {
        val json = preference.getString(key, null)
        if (json.isNullOrEmpty()) return null
        return serializer.deserialize(json, kSerializer)
    }

    override fun <V: Any> getAsFlow(clazz: KClass<V>, key: String, kserializer: KSerializer<V>?): Flow<V?> {
        val value = get(clazz, key, kserializer)
        var flow = flows[key] as MutableStateFlow<V?>?
        if (flow == null) {
            flow = MutableStateFlow(value)
            flows[key] = flow
        }
        if (value != null) flow.value = value

        return flow
    }
}
