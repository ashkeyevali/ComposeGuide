plugins {
    id("android-library-convention")
    kotlin("kapt")
    kotlin("plugin.serialization")
    id(libs.plugins.compose.get().pluginId)
}

android {
    namespace = "kz.homebank.feature.movie.impl"
}

dependencies {
    implementation(project(Modules.android))
    implementation(project(Modules.moduleInjector))
    implementation(project(Modules.baseNetworkApi))
    implementation(project(Modules.movieApi))
    implementation(project(Modules.baseDomain))
    implementation(project(Modules.kotlinApi))
    implementation(project(Modules.resources))
    implementation(project(Modules.basePresentation))

    implementation(Dependencies.Dagger.dagger)
    kapt(Dependencies.Dagger.daggerCompiler)

    implementation(Dependencies.Retrofit.retrofit)
    implementation(Dependencies.Kotlin.serialization)
    implementation(Dependencies.Kotlin.coroutines)

    implementation(compose.ui)
    implementation(compose.uiTooling)
    implementation(compose.material3)
    implementation(compose.material)
    implementation(compose.runtime)
    implementation(compose.ui)
    implementation(libs.androidx.activity.compose)
    implementation(libs.compose.viewmodel)
    implementation(libs.androidx.navigation.compose)
}