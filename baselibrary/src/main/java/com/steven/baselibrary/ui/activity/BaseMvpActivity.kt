package com.steven.baselibrary.ui.activity

import com.steven.baselibrary.presenter.BasePresenter
import com.steven.baselibrary.presenter.view.BaseView

open class BaseMvpActivity<T:BasePresenter<*>>:BaseActivity(),BaseView{
    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun onError() {
    }

    lateinit var mPresenter:T
}