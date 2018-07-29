package com.steven.usercenter.presenter

import com.steven.baselibrary.ext.execute
import com.steven.baselibrary.presenter.BasePresenter
import com.steven.baselibrary.rx.BaseSubcriber
import com.steven.usercenter.presenter.service.UserService
import com.steven.usercenter.presenter.service.imp.UserServiceImpl
import com.steven.usercenter.presenter.view.RegisterView
import javax.inject.Inject


class RegisterPresenter @Inject constructor(): BasePresenter<RegisterView>() {
    @Inject
    lateinit var userSerivce : UserServiceImpl
    fun register(mobile: String, vertifyCode: String,pwd:String) {

        userSerivce.register(mobile, vertifyCode, pwd).execute(object :BaseSubcriber<Boolean>(){
            override fun onNext(t: Boolean) {
                mView.onRegisterResult(t)
            }
        },lifecycleProvider)



    }
}