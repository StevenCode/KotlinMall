package com.steven.usercenter.presenter.service.imp

import com.steven.baselibrary.data.protocol.BaseResp
import com.steven.baselibrary.rx.BaseException
import com.steven.usercenter.data.respository.UserRespository
import com.steven.usercenter.presenter.service.UserService
import rx.Observable
import rx.functions.Func1
import javax.inject.Inject

class UserServiceImpl @Inject constructor(): UserService {
    @Inject
    lateinit var respository:UserRespository

    override fun register(mobile: String, pwd: String, vertifyCode: String): Observable<Boolean> {

        return respository.register(mobile, pwd, vertifyCode)
                .flatMap(object : Func1<BaseResp<String>, Observable<Boolean>> {
                    override fun call(t: BaseResp<String>): Observable<Boolean> {
                        if (t.statu != 0) {
                            return Observable.error(BaseException(t.statu, t.message))

                        }
                        return Observable.just(true)
                    }

                })
    }
}