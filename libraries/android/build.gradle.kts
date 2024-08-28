plugins {
    id("android-library-convention")
    kotlin("kapt")
}

android {
    namespace = "kz.homebank.libraries.android"
}

dependencies {
    implementation(project(Modules.moduleInjector))

    implementation(Dependencies.AndroidX.core)
    implementation(Dependencies.AndroidX.fragment)


    implementation(Dependencies.Dagger.dagger)
    kapt(Dependencies.Dagger.daggerCompiler)
}