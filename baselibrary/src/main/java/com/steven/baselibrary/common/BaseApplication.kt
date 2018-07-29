package com.steven.baselibrary.common

import android.app.Application
import com.steven.baselibrary.injection.component.AppComponent
import com.steven.baselibrary.injection.component.DaggerAppComponent
import com.steven.baselibrary.injection.module.AppModule

open class BaseApplication: Application() {
     lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()

        initAppInjection()
    }

    private fun initAppInjection() {
        DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
}