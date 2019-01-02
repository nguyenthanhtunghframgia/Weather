plugins {
    id("java-library")
    id("kotlin")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.11")

    //rx
    implementation("io.reactivex.rxjava2:rxjava:2.2.2")
    implementation("io.reactivex.rxjava2:rxandroid:2.1.0")
    implementation("io.reactivex.rxjava2:rxkotlin:2.3.0")
}
