package com.steven.usercenter.presenter.service

import rx.Observable


interface UserService {
    fun register(mobile: String, pwd: String, vertifyCode: String): Observable<Boolean>
}