package com.steven.usercenter.data.api

import com.steven.baselibrary.data.protocol.BaseResp
import com.steven.usercenter.data.protocol.RegisterReq
import retrofit2.http.Body
import retrofit2.http.POST
import rx.Observable


interface UserApi {
    @POST("userCenter/register")
    fun register(@Body req: RegisterReq): Observable<BaseResp<String>>
}