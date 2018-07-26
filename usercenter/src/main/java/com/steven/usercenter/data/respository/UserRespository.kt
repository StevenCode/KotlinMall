package com.steven.usercenter.data.respository

import com.steven.baselibrary.data.net.RetrofitFactory
import com.steven.baselibrary.data.protocol.BaseResp
import com.steven.usercenter.data.api.UserApi
import com.steven.usercenter.data.protocol.RegisterReq
import rx.Observable

class UserRespository {
    fun register(mobile: String, pwd: String, vertifyCode: String): Observable<BaseResp<String>>{
        return RetrofitFactory.instance.create(UserApi::class.java).register(RegisterReq(mobile, pwd, vertifyCode))
    }
}