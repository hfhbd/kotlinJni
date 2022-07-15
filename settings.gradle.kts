pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "kotlinJni"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include(":helloc")
include(":mainc")
