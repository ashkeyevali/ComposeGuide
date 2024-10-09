plugins {
    id(libs.plugins.android.application.get().pluginId)
    id(libs.plugins.jetbrains.kotlin.android.get().pluginId)
    id("kotlin-kapt")
}

android {
    namespace = "com.example.composeguide"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.composeguide"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        compose =  true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.4"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(Modules.baseNetworkApi))
    implementation(project(Modules.baseNetworkImpl))

//
    implementation(Dependencies.Dagger.dagger)
    kapt(Dependencies.Dagger.daggerCompiler)
    implementation(project(Modules.moduleInjector))
    implementation(project(Modules.kotlinApi))
    implementation(project(Modules.kotlinImpl))
    implementation(project(Modules.android))
    implementation(project(Modules.authApi))
    implementation(project(Modules.authImpl))
    implementation(project(Modules.movieApi))
    implementation(project(Modules.movieImpl))
    implementation(project(Modules.basePresentation))
    implementation(project(Modules.basePreferenceApi))
    implementation(project(Modules.basePreferenceImpl))
    implementation(project(Modules.baseDomain))
    implementation(project(Modules.resources))
    implementation(project(Modules.di))

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.foundation)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.navigation.compose)
}
