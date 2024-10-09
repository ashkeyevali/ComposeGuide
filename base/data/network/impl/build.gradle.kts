plugins {
    id("android-library-convention")
    kotlin("kapt")
}

android {
    namespace = "kz.homebank.base.data.network"

    buildFeatures {
        buildConfig = true
    }
}

dependencies {
    implementation(project(Modules.moduleInjector))
    implementation(project(Modules.kotlinApi))
    implementation(project(Modules.baseNetworkApi))
    implementation(project(Modules.baseDomain))

    implementation(Dependencies.Kotlin.coroutines)
    implementation(Dependencies.Kotlin.serialization)

    implementation(Dependencies.OkHttp.okhttp)
    implementation(Dependencies.OkHttp.okhttpLogging)
    implementation(Dependencies.Retrofit.retrofit)
    implementation(Dependencies.Retrofit.retrofitGson)
    implementation(Dependencies.Retrofit.serialization)
    debugImplementation(Dependencies.chucker)
    releaseImplementation(Dependencies.notShowChuckerinRelease)
    api(Dependencies.AndroidX.pagingRuntime)
    implementation(libs.androidx.compose.runtime)

    implementation(Dependencies.Dagger.dagger)
    kapt(Dependencies.Dagger.daggerCompiler)
}