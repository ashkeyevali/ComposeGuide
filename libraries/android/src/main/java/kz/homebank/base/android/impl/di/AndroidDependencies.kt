package kz.homebank.base.android.impl.di

import android.content.Context
import kz.homebank.module_injector.BaseDependencies

interface AndroidDependencies : BaseDependencies {
    val context: Context
    val isTestEnvironment: Boolean
}