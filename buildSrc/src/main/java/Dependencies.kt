object Versions {

    // Release info
    const val minSdk = 21
    const val targetSdk = 28
    const val compileSdk = 28
    const val releaseCode = 1
    const val releaseName = "0.0.1"

    // Build tools and languages
    const val androidPlugin = "3.4.0-alpha07"
    const val kotlin = "1.3.11"
    const val googleServicesPlugin = "4.0.1"
    const val coveralls = "2.8.2"
    const val buildProperties = "0.4"
    const val ktlint = "0.24.0"
    const val kotlinJvmTarget = "1.6"
    const val javaCompatibilityVersion = 1.7

    // Support Libraries
    const val supportLibs = "27.1.1"
    const val googleServices = "15.0.1"
    const val firebaseMessaging = "17.0.0"
    const val firebaseCore = "16.0.1"
    const val constraintLayout = "1.0.2"
    const val multidex = "1.0.2"
    const val lifecycle = "1.1.1"

    // Networking, RxJava
    const val retrofit = "2.4.0"
    const val okHttp = "3.10.0"
    const val okIo = "1.14.1"
    const val moshi = "1.6.0"
    const val dagger = "2.16"
    const val rxKotlin = "2.2.0"
    const val rxAndroid = "2.0.2"
    const val rxBinding = "2.1.1"
    const val rxFingerprint = "2.2.1"

    // Utils, Ethereum
    const val commonsCodec = "1.3"
    const val commonsLang = "3.4"
    const val commonsCli = "1.3"
    const val commonsIo = "2.4"
    const val guava = "24.0-android"
    const val dexter = "4.2.0"

    // Logging
    const val timber = "4.6.0"
    const val crashlytics = "2.9.4"
    const val fabricTools = "1.24.4"

    // Testing
    const val mockito = "2.10.0"
    const val mockitoKotlin = "1.5.0"
    const val kluent = "1.19"
    const val junit = "4.12"
    const val robolectric = "3.8"
    const val json = "20140107"
    const val espresso = "3.0.2"
    const val jacoco = "0.8.1"
    const val testRunner = "1.0.2"
}

object Libraries {

    // Build tools and languages
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidPlugin}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val kotlinAllOpen = "org.jetbrains.kotlin:kotlin-allopen:${Versions.kotlin}"
    const val coveralls = "org.kt3k.gradle.plugin:coveralls-gradle-plugin:${Versions.coveralls}"
    const val googleServicesPlugin =
        "com.google.gms:google-services:${Versions.googleServicesPlugin}"
    const val buildProperties =
        "com.novoda:gradle-build-properties-plugin:${Versions.buildProperties}"
    const val ktlint = "com.github.shyiko:ktlint:${Versions.ktlint}"

    // Support Libraries
    const val appCompat = "com.android.support:appcompat-v7:${Versions.supportLibs}"
    const val recyclerView = "com.android.support:recyclerview-v7:${Versions.supportLibs}"
    const val cardView = "com.android.support:cardview-v7:${Versions.supportLibs}"
    const val gridLayout = "com.android.support:gridlayout-v7:${Versions.supportLibs}"
    const val design = "com.android.support:design:${Versions.supportLibs}"
    const val v13 = "com.android.support:support-v13:${Versions.supportLibs}"
    const val v14 = "com.android.support:preference-v14:${Versions.supportLibs}"
    const val dynamicAnims = "com.android.support:support-dynamic-animation:${Versions.supportLibs}"
    const val annotations = "com.android.support:support-annotations:${Versions.supportLibs}"
    const val constraintLayout =
        "com.android.support.constraint:constraint-layout:${Versions.constraintLayout}"
    const val dataBindingKapt = "com.android.databinding:compiler:${Versions.androidPlugin}"
    const val multidex = "com.android.support:multidex:${Versions.multidex}"
    const val lifecycle = "android.arch.lifecycle:extensions:${Versions.lifecycle}"

    // Google & Firebase
    const val firebaseCore = "com.google.firebase:firebase-core:${Versions.firebaseCore}"
    const val firebaseMessaging =
        "com.google.firebase:firebase-messaging:${Versions.firebaseMessaging}"
    const val googlePlayServicesBase =
        "com.google.android.gms:play-services-base:${Versions.googleServices}"

    // Networking, RxJava
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitRxMoshiConverter =
        "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    const val retrofitRxJavaAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    const val okHttpInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
    const val okIo = "com.squareup.okio:okio:${Versions.okIo}"
    const val moshi = "com.squareup.moshi:moshi:${Versions.moshi}"
    const val moshiKotlin = "com.squareup.moshi:moshi-kotlin:${Versions.moshi}"
    const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    const val daggerKapt = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxKotlin}"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"
    const val rxBindingV4 = "com.jakewharton.rxbinding2:rxbinding-support-v4:${Versions.rxBinding}"
    const val rxBindingV7 =
        "com.jakewharton.rxbinding2:rxbinding-appcompat-v7:${Versions.rxBinding}"
    const val rxFingerprint = "com.mtramin:rxfingerprint:${Versions.rxFingerprint}"

    // Utils
    const val commonsCodec = "commons-codec:commons-codec:${Versions.commonsCodec}"
    const val commonsLang = "org.apache.commons:commons-lang3:${Versions.commonsLang}"
    const val commonsCli = "commons-cli:commons-cli:${Versions.commonsCli}"
    const val commonsIo = "commons-io:commons-io:${Versions.commonsIo}"
    const val guava = "com.google.guava:guava:${Versions.guava}"
    const val dexter = "com.karumi:dexter:${Versions.dexter}"

    // Logging
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
    const val crashlytics = "com.crashlytics.sdk.android:crashlytics:${Versions.crashlytics}@aar"
    const val fabricTools = "io.fabric.tools:gradle:${Versions.fabricTools}"

    // Testing
    const val mockito = "org.mockito:mockito-core:${Versions.mockito}"
    const val mockitoKotlin = "com.nhaarman:mockito-kotlin:${Versions.mockitoKotlin}"
    const val kluent = "org.amshove.kluent:kluent:${Versions.kluent}"
    const val kotlinJunit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
    const val junit = "junit:junit:${Versions.junit}"
    const val robolectric = "org.robolectric:robolectric:${Versions.robolectric}"
    const val json = "org.json:json:${Versions.json}"
    const val testRules = "com.android.support.test:rules:${Versions.testRunner}"
    const val testRunner = "com.android.support.test:runner:${Versions.testRunner}"
    const val espresso = "com.android.support.test.espresso:espresso-core:${Versions.espresso}"
    const val okHttpMock = "com.squareup.okhttp3:mockwebserver:${Versions.okHttp}"
    const val jacoco = "org.jacoco:org.jacoco.core:${Versions.jacoco}"
}