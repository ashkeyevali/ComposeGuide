plugins {
    kotlin("jvm")
}

dependencies {
    implementation(project(Modules.moduleInjector))

    implementation(Dependencies.Dagger.dagger)

    implementation(Dependencies.Kotlin.coroutines)
    implementation(Dependencies.Kotlin.serialization)
}
