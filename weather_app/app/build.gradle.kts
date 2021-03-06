plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdkVersion(Config.compileSdkVersion)

    defaultConfig {
        applicationId = Config.applicationId
        minSdkVersion(Config.minSdkVersion)
        targetSdkVersion(Config.targetSdkVersion)
        versionCode = Config.versionCode
        versionName = Config.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        buildTypes {
            getByName("release") {
                isMinifyEnabled = true
                proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            }
        }
        buildTypes {
            getByName("debug") {
                isMinifyEnabled = false
                proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    packagingOptions {
        exclude("META-INF/gradle/incremental.annotation.processors")
        exclude("META-INF/proguard/androidx-annotations.pro")
        exclude("META-INF/DEPENDENCIES")
        exclude("META-INF/LICENSE")
        exclude("META-INF/LICENSE.txt")
        exclude("META-INF/license.txt")
        exclude("META-INF/NOTICE")
        exclude("META-INF/NOTICE.txt")
        exclude("META-INF/notice.txt")
        exclude("META-INF/ASL2.0")
    }

    buildFeatures {
        viewBinding = true
    }

}

dependencies {
    implementation(Dependencies.kotlinStdlib)
    implementation(Dependencies.androixCore)
    implementation(Dependencies.appCompat)
    implementation(Dependencies.material)
    implementation(Dependencies.constraintlayout)
    testImplementation(Dependencies.junit)
    androidTestImplementation(Dependencies.junitExt)
    androidTestImplementation(Dependencies.espresso)

    implementation(Dependencies.hilt)
    kapt(Dependencies.hiltCompiler)

    implementation(Dependencies.moxyBase)
    implementation(Dependencies.moxyAndroid)
    implementation(Dependencies.moxyAndroidX)
    implementation(Dependencies.moxyCompiler)
    implementation(Dependencies.moxyKtx)

    implementation(Dependencies.moshi)

    implementation(Dependencies.glide)
    implementation(Dependencies.glideCompiler)

    implementation(Dependencies.retrofit)
    implementation(Dependencies.rxJavaAdapter)
    implementation(Dependencies.okhttp)
    implementation(Dependencies.loggingInterceptor)
    implementation(Dependencies.moshiConverter)

    implementation(Dependencies.viewBinding)

    implementation(Dependencies.rxpermissions)

    implementation(Dependencies.navigationKtx)
    implementation(Dependencies.navigationUiKtx)

    implementation(Dependencies.fragmentKtx)
}