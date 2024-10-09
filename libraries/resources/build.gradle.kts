plugins {
    id("android-library-convention")
//    id(libs.plugins.compose.get().pluginId)

}

android {
    namespace = "kz.homebank.libraries.resources"
}

dependencies {
    implementation(Dependencies.material)
//    implementation(li)
//    implementation(compose.uiTooling)
//    implementation(compose.material3)
    implementation(libs.androidx.activity.compose)
//    implementation(compose.material)
    implementation(libs.androidx.compose.runtime)
}