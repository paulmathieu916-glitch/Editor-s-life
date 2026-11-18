plugins {
    id 'com.android.application'
    id 'org.jetbrains.kotlin.android'
}

android {
    namespace 'com.zeyrox.editorslife'
    compileSdk 35

    defaultConfig {
        applicationId 'com.zeyrox.editorslife'
        minSdk 23
        targetSdk 35
        versionCode 1
        versionName '1.0'
    }

    buildFeatures {
        compose true
    }

    composeOptions {
        kotlinCompilerExtensionVersion '1.5.15'
    }
}
