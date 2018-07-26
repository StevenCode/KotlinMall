package com.steven.usercenter.presenter.service

import rx.Observable


interface UserService {
    fun register(mobile:String,vertifyCode:String,pwd:String): Observable<Boolean>
}