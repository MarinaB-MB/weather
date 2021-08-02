package com.example.weather.presentation.ui.weather

import com.example.weather.R
import com.example.weather.base.BaseFragment
import moxy.ktx.moxyPresenter
import javax.inject.Inject
import javax.inject.Provider

class WeatherFragment : BaseFragment() {
    @Inject
    lateinit var presenterProvider: Provider<WeatherPresenter>

    private val presenter by moxyPresenter { presenterProvider.get() }

    override fun getLayout() = R.layout.fragment_weather
}
