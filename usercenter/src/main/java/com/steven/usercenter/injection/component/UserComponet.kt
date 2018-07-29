package com.steven.usercenter.injection.component

import com.steven.baselibrary.injection.component.ActivityComponent
import com.steven.baselibrary.injection.PerComponentScope
import com.steven.usercenter.injection.module.UserModule
import com.steven.usercenter.ui.activity.RegisterActivity
import dagger.Component

@PerComponentScope
@Component(dependencies = arrayOf(ActivityComponent::class), modules = arrayOf(UserModule::class))
interface UserComponet {
    fun inject(activity: RegisterActivity)
}