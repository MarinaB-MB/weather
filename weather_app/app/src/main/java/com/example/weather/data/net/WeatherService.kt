package com.example.weather.data.net

import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {
    // q - city
    // appid - api token
    // units - temp units
    // lang - resp language
    @GET("weather")
    fun getWeatherByCity(@Query("q") city: String)
}