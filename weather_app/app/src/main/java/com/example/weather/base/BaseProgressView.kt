package com.example.weather.base

interface BaseProgressView {
    fun startProgress()
    fun stopProgress()
    fun showError(error: String)
}
