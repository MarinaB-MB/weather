package com.example.weather.base

import moxy.MvpPresenter

abstract class BasePresenter<T: BaseView>: MvpPresenter<T>() {
}