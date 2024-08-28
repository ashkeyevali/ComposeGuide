plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
}

dependencies {
    implementation(project(Modules.moduleInjector))
    implementation(project(Modules.baseDomain))
}