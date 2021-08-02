package com.example.weather.data.net

import com.example.weather.utils.Token
import okhttp3.Interceptor
import okhttp3.Response

class QueryInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        request.url().newBuilder()
            .addQueryParameter("appId", Token.TOKEN)
            .addQueryParameter("units", "metric")
            .addQueryParameter("lang", "ru")
            .build()
        return chain.proceed(request)
    }
}