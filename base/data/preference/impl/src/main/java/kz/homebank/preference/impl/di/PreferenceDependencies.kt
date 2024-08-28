package kz.homebank.preference.impl.di

import android.content.Context
import kz.homebank.libraries.kotlin.api.serialization.Serializer
import kz.homebank.module_injector.BaseDependencies

interface PreferenceDependencies : BaseDependencies {
    val context: Context
    val serializer: Serializer
}