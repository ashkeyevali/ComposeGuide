plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
}

dependencies {
    implementation(project(Modules.moduleInjector))
    implementation(project(Modules.kotlinApi))

    implementation(Dependencies.Kotlin.coroutines)
    implementation(Dependencies.Kotlin.serialization)
    implementation(Dependencies.AndroidX.pagingCommon)
}