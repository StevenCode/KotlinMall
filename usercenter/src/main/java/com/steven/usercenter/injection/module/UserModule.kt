package com.steven.usercenter.injection.module

import com.steven.usercenter.presenter.service.UserService
import com.steven.usercenter.presenter.service.imp.UserServiceImpl
import dagger.Module

@Module
class UserModule {

    fun providersUserService(service: UserServiceImpl): UserService {
        return service
    }
}