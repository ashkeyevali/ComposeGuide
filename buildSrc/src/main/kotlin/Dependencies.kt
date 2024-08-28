object Dependencies {
    object AndroidX {
        private const val roomVersion = "2.4.2"
        private const val navigationComponent = "2.5.0"
        private const val lifecycleVersion = "2.5.1"

        const val core = "androidx.core:core-ktx:1.7.0"
        const val multidex = "androidx.multidex:multidex:2.0.1"
        const val appCompat = "androidx.appcompat:appcompat:1.4.1"
        const val recyclerView = "androidx.recyclerview:recyclerview:1.2.1"
        const val cardView = "androidx.cardview:cardview:1.0.0"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.1.3"
        const val roomRuntime = "androidx.room:room-runtime:$roomVersion"
        const val roomCompiler = "androidx.room:room-compiler:$roomVersion"
        const val roomKtx = "androidx.room:room-ktx:$roomVersion"
        const val roomRxJava = "androidx.room:room-rxjava2:$roomVersion"
        const val roomTesting = "androidx.room:room-testing:$roomVersion"
        const val lifeCycle = "androidx.lifecycle:lifecycle-common-java8:2.4.1"
        const val lifeCycleExt = "androidx.lifecycle:lifecycle-extensions:2.2.0"
        const val biometric = "androidx.biometric:biometric:1.1.0"
        const val navFragment = "androidx.navigation:navigation-fragment-ktx:$navigationComponent"
        const val navUi = "androidx.navigation:navigation-ui-ktx:$navigationComponent"
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion"
        const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion"
        const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion"
        const val lifecycleCommon = "androidx.lifecycle:lifecycle-common:$lifecycleVersion"
        const val lifecycleProcess = "androidx.lifecycle:lifecycle-process:$lifecycleVersion"
        const val fragment = "androidx.fragment:fragment-ktx:1.5.2"
        const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:2.2.0"
        const val pagingRuntime = "androidx.paging:paging-runtime-ktx:3.0.0"
        const val pagingCommon = "androidx.paging:paging-common-ktx:3.0.0"
    }

    object GooglePlayServices {
        const val base = "com.google.android.gms:play-services-base:18.1.0"
        const val adId = "com.google.android.gms:play-services-ads-identifier:18.0.1"
        const val location = "com.google.android.gms:play-services-location:19.0.1"
        const val auth = "com.google.android.gms:play-services-auth:20.1.0"
        const val authPhone = "com.google.android.gms:play-services-auth-api-phone:18.0.1"
        const val tapAndPay = "com.google.android.gms:play-services-tapandpay:17.1.2"
        const val mlKit = "com.google.android.gms:play-services-mlkit-text-recognition:18.0.3"

    }

    object Firebase {
        const val core = "com.google.firebase:firebase-core:20.1.0"
        const val messaging = "com.google.firebase:firebase-messaging:23.0.1"
        const val remoteConfig = "com.google.firebase:firebase-config:21.0.2"
        const val analytics = "com.google.firebase:firebase-analytics:20.1.0"
        const val dynamicLinks = "com.google.firebase:firebase-dynamic-links-ktx:21.0.1"
        const val crashlytics = "com.google.firebase:firebase-crashlytics-ktx:18.2.9"
        const val perf = "com.google.firebase:firebase-perf-ktx:20.3.0"
    }

    object Dagger {
        private const val version = "2.49"

        const val dagger = "com.google.dagger:dagger:$version"
        const val daggerCompiler = "com.google.dagger:dagger-compiler:$version"
        const val inject = "javax.inject:javax.inject:1"
    }

    object OkHttp {
        private const val version = "4.12.0"

        const val okhttp = "com.squareup.okhttp3:okhttp:$version"
        const val okhttpLogging = "com.squareup.okhttp3:logging-interceptor:$version"
    }

    object Retrofit {
        private const val version = "2.11.0"

        const val retrofit = "com.squareup.retrofit2:retrofit:$version"
        const val retrofitRxJava = "com.squareup.retrofit2:adapter-rxjava2:$version"
        const val retrofitGson = "com.squareup.retrofit2:converter-gson:$version"
        const val serialization = "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.8.0"
    }

    object RxJava {
        const val rxJava = "io.reactivex.rxjava2:rxjava:2.2.9"
        const val rxJavaAndroid = "io.reactivex.rxjava2:rxandroid:2.1.0"
    }

    object Kotlin {
        private const val kotlinVersion = "1.8.0"
        private const val ankoVersion = "0.10.8"
        private const val coroutinesVersion = "1.6.0"

        const val koltin = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
        const val koltinReflect = "org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion"
        const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"
        const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"
        const val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2"
        const val anko = "org.jetbrains.anko:anko:$ankoVersion"
        const val ankoDesign = "org.jetbrains.anko:anko-design:$ankoVersion"
    }

    object Glide {
        private const val version = "4.11.0"
        const val glide = "com.github.bumptech.glide:glide:$version"
        const val glideCompiler = "com.github.bumptech.glide:compiler:$version"
    }

    object Testing {
        const val junit = "junit:junit:4.13.2"
        const val mockitoCore = "org.mockito:mockito-core:5.4.0"
        const val mockitoKotlin = "org.mockito.kotlin:mockito-kotlin:5.0.0"
        const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.4"
        const val archCore = "androidx.arch.core:core-testing:2.2.0"
    }

    object Camera{
        const val core = "androidx.camera:camera-core:1.1.0"
        const val camera = "androidx.camera:camera-camera2:1.1.0"
        const val lifecycle = "androidx.camera:camera-lifecycle:1.1.0"
        const val view = "androidx.camera:camera-view:1.1.0"
    }

    const val material = "com.google.android.material:material:1.5.0"
    const val onboarding = "kz.homebank:onboarding:1.3.5"
    const val zxingEmbeded = "com.journeyapps:zxing-android-embedded:4.3.0"
    const val zxingCore = "com.google.zxing:core:3.3.0"
    const val picasso = "com.squareup.picasso:picasso:2.5.2"
    const val blurView = "com.github.mmin18:realtimeblurview:1.2.1"
    const val gson = "com.google.code.gson:gson:2.11.0"
    const val cardIo = "io.card:android-sdk:5.5.1"
    const val decoro = "ru.tinkoff.decoro:decoro:1.5.1"
    const val dateRangePicker = "com.borax12.materialdaterangepicker:library:1.9"
    const val amplitude = "com.amplitude:android-sdk:2.23.2"
    const val adjust = "com.adjust.sdk:adjust-android:4.22.0"
    const val adaptivePlus = "plus.adaptive:android-sdk:2.3.19"
    const val compressor = "id.zelory:compressor:3.0.0"
    const val yandexMap = "com.yandex.android:mapkit:3.5.0"
    const val viewBinding = "com.github.kirich1409:viewbindingpropertydelegate-noreflection:1.5.6"
    const val flexBox = "com.google.android:flexbox:2.0.1"
    const val dynatrace = "com.dynatrace.tools.android:gradle-plugin:8.279.1.1002"
    const val liveness = "com.ozforensics.liveness:sdk:8.8.2"
    const val luna = "ai.visionlabs.lunaid:core:1.7.4@aar"
    const val liveTex = "com.github.LiveTex:sdk-android:1.2.13"
    const val uCrop = "com.github.maxxx:uCrop:2.3.1"
    const val chucker = "com.github.chuckerteam.chucker:library:3.5.0"
    const val notShowChuckerinRelease = "com.github.chuckerteam.chucker:library-no-op:3.5.0"
    const val scanCardIo = "io.card:android-sdk:5.5.1"
    const val rootbeer = "com.scottyab:rootbeer-lib:0.1.0"
}