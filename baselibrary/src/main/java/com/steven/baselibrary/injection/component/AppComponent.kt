package com.steven.baselibrary.injection.component

import android.content.Context
import com.steven.baselibrary.injection.module.AppModule
import dagger.Component
import javax.inject.Singleton

@Component(modules = arrayOf(AppModule::class))
@Singleton
interface AppComponent {
    fun context():Context
}