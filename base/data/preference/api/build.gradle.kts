plugins {
    kotlin("jvm")
}

dependencies {
    implementation(project(Modules.moduleInjector))
    implementation(project(Modules.kotlinApi))
    implementation(project(Modules.baseDomain))

    implementation(Dependencies.Kotlin.serialization)
    implementation(Dependencies.Kotlin.coroutines)
}
