plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.lx.oneteamproject"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.lx.oneteamproject"
        minSdk = 28
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

    viewBinding {
        enable = true
    }


    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation ("com.google.code.gson:gson:2.8.8")

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // 1. 레트로핏 라이브러리 추가
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.okhttp3:okhttp:4.11.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.11.0")

    // 글라이드
    implementation("com.github.bumptech.glide:glide:4.16.0")
    implementation("jp.wasabeef:glide-transformations:4.3.0")

    // 위험 권한을 위한 라이브러리 추가
    implementation("com.guolindev.permissionx:permissionx:1.7.1")

    // 내 위치 확인
    implementation("com.google.android.gms:play-services-location:21.0.1")

    //지도
    implementation("com.google.android.gms:play-services-maps:18.1.0")


    //당연준 채팅 땜에 추가
    //파이어베이스 storage , realtime database 용
    annotationProcessor ("com.github.bumptech.glide:compiler:4.12.0")

    implementation(platform("com.google.firebase:firebase-bom:32.3.1"))
    implementation("com.google.firebase:firebase-database-ktx:20.2.2")
    implementation("com.google.firebase:firebase-firestore-ktx:24.8.1")
    implementation("com.google.firebase:firebase-storage-ktx:20.2.1")
    implementation("com.google.firebase:firebase-auth-ktx")
    implementation("com.google.firebase:firebase-analytics-ktx")
}