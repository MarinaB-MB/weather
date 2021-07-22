package com.example.weather.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import moxy.MvpAppCompatFragment
import moxy.MvpFragment

abstract class BaseFragment : MvpAppCompatFragment(), BaseProgressView {

    protected abstract fun getLayout(): Int

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(getLayout(), container, false)
    }

    override fun startProgress() {}
    override fun stopProgress() {}
    override fun showError(error: String) {}


}