package com.example.weather.presentation.ui.main

import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.weather.R
import com.example.weather.base.BaseActivity
import com.example.weather.databinding.ActivityMainRootBinding

class MainActivity : BaseActivity() {
    private val viewBinding by viewBinding(ActivityMainRootBinding::bind, R.id.rootMain)
    override fun getLayout(): Int = R.layout.activity_main_root
}