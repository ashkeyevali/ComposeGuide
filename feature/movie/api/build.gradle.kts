plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
}


dependencies {
    implementation(project(Modules.moduleInjector))
    implementation(project(Modules.baseDomain))
//    implementation(libs.androidx.navigation.runtime.ktx)
//    implementation("androidx.navigation:navigation-compose:2.7.7")
//    implementation(libs.androidx.navigation.runtime)

}