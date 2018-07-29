package com.steven.baselibrary.presenter

import com.steven.baselibrary.presenter.view.BaseView
import com.trello.rxlifecycle.LifecycleProvider
import javax.inject.Inject

open class BasePresenter<T: BaseView> {
    lateinit var mView:T

    @Inject
    lateinit var lifecycleProvider:LifecycleProvider<*>
}