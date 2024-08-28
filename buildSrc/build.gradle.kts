plugins {
    `kotlin-dsl`
}

repositories {
    google {
        content {
            includeGroupByRegex("com.android.*")
            includeGroupByRegex("androidx.*")
            includeGroupByRegex("android.arch.*")
            includeGroupByRegex("com.google.*")

            excludeGroupByRegex("com.google.dagger.*")
            excludeGroupByRegex("com.google.code.gson.*")
            excludeGroupByRegex("com.google.guava.*")
            excludeGroupByRegex("com.google.errorprone.*")
            excludeGroupByRegex("com.google.code.findbugs.*")
            excludeGroupByRegex("com.google.auto.*")
            excludeGroupByRegex("com.google.j2objc.*")
            excludeGroupByRegex("com.google.protobuf.*")
            excludeGroupByRegex("com.google.googlejavaformat.*")
        }
    }
    mavenCentral()
}

dependencies {
    implementation("com.android.tools.build:gradle:8.2.0")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.0")
    implementation("org.jetbrains.kotlin:kotlin-serialization:1.5.10")
    implementation("androidx.navigation:navigation-safe-args-gradle-plugin:2.5.0")
}