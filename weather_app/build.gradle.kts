// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Dependencies.gradlePlugin)
        classpath(Dependencies.kotlinGradlePlugin)
        classpath(Dependencies.hiltGradlePlugin)

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
        jcenter() // Warning: this repository is going to shut down soon
    }
}
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
