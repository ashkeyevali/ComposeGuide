package kz.homebank.base.presentation.di

import kz.homebank.libraries.kotlin.api.serialization.Serializer
import kz.homebank.module_injector.BaseDependencies

interface PresentationDependencies : BaseDependencies {
    val serializer: Serializer
}