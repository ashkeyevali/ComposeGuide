plugins {
    id("android-library-convention")
    kotlin("kapt")
    id("kotlin-parcelize")
}

android {
    namespace = "kz.homebank.base.presentation"
}

dependencies {
    implementation(project(Modules.moduleInjector))
    implementation(project(Modules.baseDomain))
    implementation(project(Modules.baseNetworkApi))
    implementation(project(Modules.kotlinApi))
    implementation(project(Modules.resources))
    implementation(Dependencies.material)
    implementation(libs.androidx.compose.runtime)

//    implementation(Dependencies.dateRangePicker)
    implementation(Dependencies.Dagger.dagger)
    kapt(Dependencies.Dagger.daggerCompiler)

    implementation(Dependencies.Kotlin.serialization)

    api(Dependencies.AndroidX.fragment)
    api(Dependencies.AndroidX.viewModel)
    api(Dependencies.AndroidX.liveData)
    api(Dependencies.AndroidX.navFragment)
    api(Dependencies.AndroidX.navUi)
    api(Dependencies.AndroidX.biometric)
    api(Dependencies.viewBinding)
    api(Dependencies.AndroidX.pagingRuntime)
}