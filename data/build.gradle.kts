plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdkVersion(28)

    defaultConfig {
        minSdkVersion(16)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
            buildConfigField("String", "BASE_URL", "\"https://api.openweathermap.org/data/2.5/\"")
            buildConfigField("String", "API_KEY", "\"f379cbdb9874a4eb73071829c180eea1\"")
        }

        getByName("debug") {
            buildConfigField("String", "BASE_URL", "\"https://api.openweathermap.org/data/2.5/\"")
            buildConfigField("String", "API_KEY", "\"f379cbdb9874a4eb73071829c180eea1\"")
        }
    }

    compileOptions {
        setSourceCompatibility(JavaVersion.VERSION_1_8)
        setTargetCompatibility(JavaVersion.VERSION_1_8)
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation("androidx.appcompat:appcompat:1.1.0-alpha01")
    testImplementation("junit:junit:4.12")
    testImplementation("com.squareup.okhttp3:mockwebserver:3.8.1")
    testImplementation("org.robolectric:robolectric:4.0.1")
    testImplementation("androidx.arch.core:core-testing:2.0.0")
    testImplementation("org.mockito:mockito-core:2.7.19")
    androidTestImplementation("androidx.test:runner:1.1.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.11")

    //gson
    implementation("com.google.code.gson:gson:2.8.2")

    //retrofit2
    implementation("com.squareup.retrofit2:retrofit:2.4.0")
    implementation("com.squareup.retrofit2:converter-gson:2.4.0")
    implementation("com.jakewharton.retrofit:retrofit2-rxjava2-adapter:1.0.0")
    implementation("com.squareup.okhttp3:logging-interceptor:3.9.1")

    //rx
    implementation("io.reactivex.rxjava2:rxjava:2.2.2")
    implementation("io.reactivex.rxjava2:rxandroid:2.1.0")

    //room
    val roomVersion = "2.0.0"
    implementation("androidx.room:room-runtime:$roomVersion")
    kapt("androidx.room:room-compiler:$roomVersion")
    implementation("androidx.room:room-rxjava2:$roomVersion")

    //annotation
    implementation("androidx.annotation:annotation:1.0.1")

    //module
    implementation(project(":domain"))
}
