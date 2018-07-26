package com.steven.usercenter.presenter.service.imp

import com.steven.usercenter.presenter.service.UserService
import rx.Observable

class UserServiceImpl:UserService {
    override fun register(mobile: String, vertifyCode: String, pwd: String): Observable<Boolean> {
        return Observable.just(true)
    }
}