plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id 'kotlin-kapt'
    id 'com.google.dagger.hilt.android'

}

android {
    namespace 'com.ulan.weatherapp_for_15_1j'
    compileSdk 34

    defaultConfig {
        applicationId "com.ulan.weatherapp_for_15_1j"
        minSdk 26
        targetSdk 34
        versionCode 1
        versionName "1.0"

        buildConfigField 'String', 'BASE_URL', '\"https://api.weatherapi.com/v1/\"'
        buildConfigField 'String', 'API_KEY', '\"37971a4e43bb4e57991112442241803\"'

        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            minifyEnabled true
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
                targetCompatibility JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = '1.8'
    }

    buildFeatures {
        viewBinding true
        buildConfig true
    }
}

dependencies {

    implementation libs.androidx.core.ktx
            implementation libs.androidx.appcompat
            implementation libs.material
            implementation libs.androidx.activity
            implementation libs.androidx.constraintlayout
            testImplementation libs.junit
            androidTestImplementation libs.androidx.junit
            androidTestImplementation libs.androidx.espresso.core

            //Retrofit
            implementation libs.retrofit
            implementation libs.converter.gson

            //Glide
            implementation libs.glide

            //Dagger Hilt
            implementation "com.google.dagger:hilt-android:2.48"
    kapt "com.google.dagger:hilt-compiler:2.48"

    //Lifecycle
    implementation libs.androidx.lifecycle.livedata.ktx
            implementation libs.androidx.lifecycle.viewmodel.ktx

            implementation "androidx.core:core-splashscreen:1.0.0"


    //OkHttpClient
    implementation(platform(libs.okhttp.bom))
    // define any required OkHttp artifacts without version
    //noinspection UseTomlInstead
    implementation'com.squareup.okhttp3:okhttp'
    //noinspection UseTomlInstead
    implementation'com.squareup.okhttp3:logging-interceptor'
}