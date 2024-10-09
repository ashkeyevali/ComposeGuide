plugins {
    id("android-library-convention")
    kotlin("kapt")
}

android {
    namespace = "kz.homebank.base.data.preference.impl"
}

dependencies {
    implementation(project(Modules.moduleInjector))
    implementation(project(Modules.kotlinApi))
    implementation(project(Modules.basePreferenceApi))
    implementation(project(Modules.baseDomain))

    implementation(Dependencies.Kotlin.serialization)
    implementation(Dependencies.Kotlin.coroutines)
    implementation(libs.androidx.compose.runtime)

    implementation(Dependencies.Dagger.dagger)
    kapt(Dependencies.Dagger.daggerCompiler)
}