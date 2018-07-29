package com.steven.baselibrary.injection.component

import android.app.Activity
import android.content.Context
import com.steven.baselibrary.injection.ActivityScope
import com.steven.baselibrary.injection.module.ActivityModule
import com.steven.baselibrary.injection.module.LifecycleProviderModule
import com.trello.rxlifecycle.LifecycleProvider
import dagger.Component

@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class),modules = arrayOf(ActivityModule::class,LifecycleProviderModule::class))
interface ActivityComponent {

    fun activity():Activity
    fun context(): Context
    fun lifecycleProvider(): LifecycleProvider<*>
}