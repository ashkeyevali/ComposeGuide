plugins {
    id("android-library-convention")
    kotlin("kapt")
    kotlin("plugin.serialization")
}

android {
    namespace = "kz.homebank.feature.auth.impl"
}

dependencies {
    implementation(project(Modules.android))
    implementation(project(Modules.moduleInjector))
    implementation(project(Modules.baseNetworkApi))
    implementation(project(Modules.authApi))
    implementation(project(Modules.baseDomain))
    implementation(project(Modules.kotlinApi))

    implementation(Dependencies.Dagger.dagger)
    kapt(Dependencies.Dagger.daggerCompiler)

    implementation(Dependencies.Retrofit.retrofit)
    implementation(Dependencies.Kotlin.serialization)
    implementation(Dependencies.Kotlin.coroutines)
}