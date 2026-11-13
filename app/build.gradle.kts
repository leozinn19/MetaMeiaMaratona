plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.leonardo.meiamaratona"
    compileSdk = 34

    signingConfigs {
        create("fixa") {
            storeFile = file("meia-maratona.keystore")
            storePassword = "meiamaratona123"
            keyAlias = "meiamaratona"
            keyPassword = "meiamaratona123"
        }
    }

    defaultConfig {
        applicationId = "com.leonardo.meiamaratona"
        minSdk = 26
        targetSdk = 34
        versionCode = 3
        versionName = "1.2"
    }

    buildTypes {
        debug {
            signingConfig = signingConfigs.getByName("fixa")
        }
        release {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("fixa")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}
