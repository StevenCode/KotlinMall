package com.steven.baselibrary.presenter

import com.steven.baselibrary.presenter.view.BaseView

open class BasePresenter<T: BaseView> {
    lateinit var mView:T
}