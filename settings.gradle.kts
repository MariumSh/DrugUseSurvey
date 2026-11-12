pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        maven { url = uri("https://jitpack.io")}
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}

rootProject.name = "DurgUseSurvey"
include(":app")

include(":Database")
project(":Database").projectDir = file("modules/database/Database")

include(":FormBuilder")
project(":FormBuilder").projectDir = file("modules/formBuilder/FormBuilder")

include(":GeoMap")
project(":GeoMap").projectDir = file("modules/geoMap/GeoMap")

include(":TDS")
project(":TDS").projectDir = file("modules/main/TDS")

include(":DatabaseSchemaGenerator")
project(":DatabaseSchemaGenerator").projectDir = file("modules/schema/DatabaseSchemaGenerator")

include(":Utils")
project(":Utils").projectDir = file("modules/utils/Utils")
