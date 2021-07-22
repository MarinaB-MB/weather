package com.example.weather.base

import android.os.Bundle
import moxy.MvpActivity
import moxy.MvpAppCompatActivity

abstract class BaseActivity : MvpAppCompatActivity(), BaseProgressView {

    protected abstract fun getLayout(): Int
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
    }

    override fun startProgress() {}
    override fun stopProgress() {}
    override fun showError(error: String) {}

}