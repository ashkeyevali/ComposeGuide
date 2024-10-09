import com.android.build.gradle.BaseExtension
import gradle.kotlin.dsl.accessors._624aae704a5c30b505ab3598db099943.android

configure<BaseExtension> {

    setCompileSdkVersion(AppConfig.compileSdkVersion)
    android {
        buildFeatures {
            viewBinding = true
            buildFeatures.compose = true
        }

        composeOptions {
            kotlinCompilerExtensionVersion = "1.5.4"
        }
    }

    defaultConfig {

        minSdk = AppConfig.minSdkVersion
        targetSdk = AppConfig.targetSdkVersion
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName
        renderscriptTargetApi = AppConfig.renderscriptTargetApi
        renderscriptSupportModeEnabled = true
        multiDexEnabled = true
        resourceConfigurations.addAll(listOf("ru", "kk", "en"))

        javaCompileOptions {
            annotationProcessorOptions {
                argument("room.schemaLocation", "$projectDir/schemas")
            }

        }

        setProperty("archivesBaseName", "v${versionName}(${versionCode})")

        ndk {
            abiFilters.addAll(listOf("arm64-v8a", "armeabi-v7a"))
        }
    }

    packagingOptions {
        resources.excludes.addAll(listOf(
            "META-INF/LICENSE.txt",
            "META-INF/NOTICE.txt",
            "META-INF/DEPENDENCIES"
        ))
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}