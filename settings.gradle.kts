pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

rootProject.name = "ComposeGuide"
include(":app")
include(":base:data:network:api")
include(":base:data:network:impl")
include(":base:domain")
include(":base:domain")
include(":base:presentation")
include(":base:data:preference:api")
include(":base:data:preference:impl")
include(":feature:auth:api")
include(":feature:auth:impl")
include(":feature:movie:api")
include(":feature:movie:impl")
include(":module_injector")
include(":libraries:android")
include(":libraries:di")
include(":libraries:resources")
include(":libraries:kotlin:api")
include(":libraries:kotlin:impl")

