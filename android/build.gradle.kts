
plugins {
    id("com.android.library")
}

group = "dev.fluttercommunity.plus.share"
version = "1.0-SNAPSHOT"

repositories {
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

    defaultConfig {
        minSdk = 24
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    lint {
        disable += "InvalidPackage"
    }
}


dependencies {
}