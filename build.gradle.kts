// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id(libs.plugins.android.application.get().pluginId).apply(false)
    id(libs.plugins.jetbrains.kotlin.android.get().pluginId).apply(false)
}