package com.steven.baselibrary.ui.activity

import android.os.Bundle
import com.steven.baselibrary.injection.component.ActivityComponent
import com.steven.baselibrary.common.BaseApplication
import com.steven.baselibrary.injection.component.DaggerActivityComponent
import com.steven.baselibrary.injection.module.ActivityModule
import com.steven.baselibrary.injection.module.LifecycleProviderModule
import com.steven.baselibrary.presenter.BasePresenter
import com.steven.baselibrary.presenter.view.BaseView
import javax.inject.Inject

open class BaseMvpActivity<T:BasePresenter<*>>:BaseActivity(),BaseView{
    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun onError() {
    }
    @Inject
    lateinit var mPresenter:T

    lateinit var activityComponent: ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initActivityInjection()
    }

    private fun initActivityInjection() {
        DaggerActivityComponent.builder().appComponent((application as BaseApplication).appComponent)
                .activityModule(ActivityModule(this))
                .lifecycleProviderModule(LifecycleProviderModule(this))
                .build()
    }
}