pluginManagement {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
    }

    plugins {
        id("com.android.application") version "7.0.3"
        id("org.jetbrains.kotlin.android") version "1.6.0"
        id("com.android.library") version "7.0.3"
        id("com.google.firebase.crashlytics") version "2.1.0"
    }

    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "com.android.application", "com.android.library" -> useModule("com.android.tools.build:gradle:7.0.3")
                "com.google.firebase.crashlytics" -> useModule("com.google.firebase:firebase-crashlytics-gradle:2.1.0")
            }
        }
    }
}
include("app")
rootProject.name = "GradlePlugins"