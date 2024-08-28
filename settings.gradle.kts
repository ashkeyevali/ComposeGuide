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
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ComposeGuide"
include(":app")
include(":base:data:network:api")
include(":base:data:network:impl")
include(":base:domain")
include(":base:domain")
include(":module_injector")
include(":libraries:android")
include(":libraries:di")
include(":libraries:resources")
include(":libraries:kotlin:api")
include(":libraries:kotlin:impl")

