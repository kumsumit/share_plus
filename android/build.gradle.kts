import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android") version "2.3.21"
}

group = "dev.fluttercommunity.plus.share"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    google()
    mavenCentral()
}

android {
    namespace = "dev.fluttercommunity.plus.share"
    compileSdk = flutter.compileSdkVersion

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    kotlin {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_21)
        }
    }

    defaultConfig {
        minSdk = 19
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    lintOptions {
        disable 'InvalidPackage'
    }
}

dependencies {
        implementation "org.jetbrains.kotlin:kotlin-stdlib:2.3.21"
    }