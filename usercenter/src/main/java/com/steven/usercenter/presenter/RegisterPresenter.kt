package com.steven.usercenter.presenter

import com.steven.baselibrary.ext.execute
import com.steven.baselibrary.presenter.BasePresenter
import com.steven.baselibrary.rx.BaseSubcriber
import com.steven.usercenter.presenter.service.imp.UserServiceImpl
import com.steven.usercenter.presenter.view.RegisterView


class RegisterPresenter: BasePresenter<RegisterView>() {
    fun register(mobile: String, vertifyCode: String,pwd:String) {

        val userSerivce = UserServiceImpl()
        userSerivce.register(mobile, vertifyCode, pwd).execute(object :BaseSubcriber<Boolean>(){
            override fun onNext(t: Boolean) {
                mView.onRegisterResult(t)
            }
        })



    }
}