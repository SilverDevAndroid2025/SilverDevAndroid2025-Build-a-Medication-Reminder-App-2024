plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    //id("com.google.dagger.hilt.android") version "2.48" apply false
    id("com.google.dagger.hilt.android") version "2.53.1" apply false
    //id ("com.google.devtools.ksp")
    //id("dagger.hilt.android.plugin") version "2.45"
}

android {
    namespace = "com.timerproject.alarmmanagerroomdnotifications"
    //compileSdk = 33
    compileSdk = 34

    defaultConfig {
        applicationId = "com.timerproject.alarmmanagerroomdnotifications"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
        viewBinding = true
    }
    composeOptions {
        //kotlinCompilerExtensionVersion = "1.5.1"
        kotlinCompilerExtensionVersion = "1.5.11"
    }
}

dependencies {

    //implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.core:core-ktx:1.9.23")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.2.0")
    implementation("androidx.room:room-ktx:2.6.1")

    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation ("com.google.code.gson:gson:2.11.0")

    //implementation ("androidx.compose.material3:material3:1.3.1")
    implementation ("androidx.compose.material3:material3:1.2.1")
    implementation ("androidx.compose.material:material:1.6.7")
    implementation ("androidx.activity:activity-compose:1.9.3")
    implementation ("androidx.compose:compose-bom:2023.10.01")

    implementation("androidx.compose.ui:ui:1.5.4")
    implementation("androidx.compose.ui:ui-graphics:1.5.4")
    implementation("androidx.compose.ui:ui-tooling-preview:1.5.4")

    val navigationVersion = "2.7.3"
    // https://mvnrepository.com/artifact/androidx.navigation/navigation-compose
    implementation ("androidx.navigation:navigation-compose:$navigationVersion")
    // https://mvnrepository.com/artifact/androidx.datastore/datastore-preferences
    implementation ("androidx.datastore:datastore-preferences:1.0.0")
    // https://mvnrepository.com/artifact/androidx.navigation/navigation-testing
    androidTestImplementation ("androidx.navigation:navigation-testing:$navigationVersion")

    implementation("androidx.hilt:hilt-navigation-compose:1.2.0")
    //implementation ("androidx.hilt:hilt-navigation-compose:1.1.0")
    implementation("androidx.hilt:hilt-navigation-fragment:1.1.0")
    implementation("com.google.dagger:hilt-android:2.53.1")
    //implementation("com.google.dagger:hilt-android:2.52")
    implementation("com.google.dagger:hilt-android:2.53.1")
    //implementation ("com.google.dagger:hilt-android:2.48")
    //annotationProcessor("com.google.dagger:hilt-compiler:2.52")
    annotationProcessor("com.google.dagger:hilt-compiler:2.53.1")
    //annotationProcessor("com.google.dagger:hilt-compiler:2.48")
    //annotationProcessor("com.google.dagger:hilt-android-compiler:2.48")
    //annotationProcessor("com.google.dagger:hilt-android-compiler:2.52")
    annotationProcessor("com.google.dagger:hilt-android-compiler:2.53.1")
    //implementation("com.google.dagger:hilt-android-gradle-plugin:2.48")
    //implementation("com.google.dagger:hilt-android-gradle-plugin:2.52")
    implementation("com.google.dagger:hilt-android-gradle-plugin:2.53.1")
    implementation("androidx.hilt:hilt-work:1.0.0")
    annotationProcessor("androidx.hilt:hilt-compiler:1.0.0")
    //implementation ("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03")
    implementation("androidx.work:work-runtime-ktx:2.8.1")

    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.7.0")
    debugImplementation("androidx.compose.ui:ui-test-manifest:1.5.4")

    // For instrumentation tests
    //androidTestImplementation("com.google.dagger:hilt-android-testing:2.48")
    //androidTestAnnotationProcessor("com.google.dagger:hilt-compiler:2.48")
    //androidTestImplementation("com.google.dagger:hilt-android-testing:2.52")
    //androidTestAnnotationProcessor("com.google.dagger:hilt-compiler:2.52")
    androidTestImplementation("com.google.dagger:hilt-android-testing:2.53.1")
    androidTestAnnotationProcessor("com.google.dagger:hilt-compiler:2.53.1")

    // For local unit tests
    //testImplementation("com.google.dagger:hilt-android-testing:2.48")
    //testAnnotationProcessor("com.google.dagger:hilt-compiler:2.48")
    //testImplementation("com.google.dagger:hilt-android-testing:2.52")
    //testAnnotationProcessor("com.google.dagger:hilt-compiler:2.52")
    testImplementation("com.google.dagger:hilt-android-testing:2.53.1")
    testAnnotationProcessor("com.google.dagger:hilt-compiler:2.53.1")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
}