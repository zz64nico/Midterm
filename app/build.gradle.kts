plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdkVersion(34)

    defaultConfig {
        applicationId = "com.example.midterm" // Replace with your actual package name
        minSdkVersion(21)
        targetSdkVersion(34)
        versionCode = 1
        versionName = "1.0"

        // Set the correct namespace here
        buildConfigField("String", "NAMESPACE", "\"http://schemas.android.com/apk/res-auto\"")

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    viewBinding {
        // Enable View Binding without isEnabled property
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk7"))
    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.appcompat:appcompat:1.4.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.3")
    implementation("androidx.activity:activity-ktx:1.4.0")
    implementation("androidx.fragment:fragment-ktx:1.4.0")
    implementation("com.google.android.material:material:1.5.0")
    implementation("androidx.navigation:navigation-fragment-ktx:2.4.1")
    implementation("androidx.navigation:navigation-ui-ktx:2.4.1")

    // If you're using Room or any other library that requires annotation processing, add the kapt dependencies here
    // For example:
    // implementation("androidx.room:room-runtime:2.3.0")
    // kapt("androidx.room:room-compiler:2.3.0")
    // implementation("androidx.room:room-ktx:2.3.0")
}
