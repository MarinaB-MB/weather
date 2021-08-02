object Dependencies {

    //gradle-plugin


    val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlinVersion}"
    val gradlePlugin = "com.android.tools.build:gradle:${Version.gradlePluginVersion}"
    val hiltGradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:${Version.hiltVersion}"


    //Hilt
    val hilt = "com.google.dagger:hilt-android:${Version.hiltVersion}"
    val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Version.hiltVersion}"

    //Moxy
    val moxyBase = "com.github.moxy-community:moxy:${Version.moxyVersion}"
    val moxyAndroid = "com.github.moxy-community:moxy-android:${Version.moxyVersion}"
    val moxyCompiler = "com.github.moxy-community:moxy-compiler:${Version.moxyVersion}"
    val moxyAndroidX = "com.github.moxy-community:moxy-androidx:${Version.moxyVersion}"
    val moxyKtx = "com.github.moxy-community:moxy-ktx:${Version.moxyVersion}"

    //Moshi
    val moshi = "com.squareup.moshi:moshi:${Version.moshiVersion}"

    //Glide
    val glide = "com.github.bumptech.glide:glide:${Version.glideVersion}"
    val glideCompiler = "com.github.bumptech.glide:compiler:${Version.glideVersion}"

    //Retrofit
    val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofitVersion}"
    val rxJavaAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Version.retrofitVersion}"
    val okhttp = "com.squareup.okhttp3:okhttp:${Version.okhttpVersion}"
    val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Version.okhttpVersion}"
    val moshiConverter = "com.squareup.retrofit2:converter-moshi:${Version.moshiConverterVersion}"

    //View binding
    val viewBinding =
        "com.github.kirich1409:viewbindingpropertydelegate-noreflection:${Version.viewBindingVersion}"


    // some default
    val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Version.kotlinVersion}"
    val androixCore = "androidx.core:core-ktx:${Version.kotlinStdlibVersion}"
    val appCompat = "androidx.appcompat:appcompat:${Version.appCompatVersion}"
    val material = "com.google.android.material:material:${Version.materialVersion}"
    val constraintlayout =
        "androidx.constraintlayout:constraintlayout:${Version.constraintlayoutVersion}"
    val junit = "junit:junit:4.+"
    val junitExt = "androidx.test.ext:junit:${Version.junitExtVersion}"
    val espresso = "androidx.test.espresso:espresso-core:${Version.espressoVersion}"

    //RxPermissions
    val rxpermissions = "com.github.tbruyelle:rxpermissions:${Version.rxpermissionsVersion}"

    //Navigation component
    val navigationKtx = "androidx.navigation:navigation-fragment-ktx:${Version.navVersion}"
    val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Version.navVersion}"

    //Fragments
    val fragmentKtx =  "androidx.fragment:fragment-ktx:${Version.fragmentKtxVersion}"

}