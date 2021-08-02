package com.example.weather.presentation.ui.main

import androidx.navigation.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.weather.R
import com.example.weather.base.BaseActivity
import com.example.weather.databinding.ActivityMainRootBinding
import moxy.ktx.moxyPresenter
import javax.inject.Inject
import javax.inject.Provider

class MainActivity : BaseActivity() {
    private val viewBinding by viewBinding(ActivityMainRootBinding::bind, R.id.rootMain)
    override fun getLayout(): Int = R.layout.activity_main_root

    @Inject
    lateinit var presenterProvider: Provider<MainPresenter>

    private val presenter by moxyPresenter { presenterProvider.get() }

    private val navController by lazy { findNavController(R.id.navHost) }
}
