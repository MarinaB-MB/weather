package com.example.weather.presentation

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class WeatherApplication : Application() {
    private var _shared: WeatherApplication? = null
    val shared: WeatherApplication
        get() = checkNotNull(_shared) { "Shared cannot be null" }

    override fun onCreate() {
        super.onCreate()
        _shared = this
    }
}