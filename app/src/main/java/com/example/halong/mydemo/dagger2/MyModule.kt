package com.example.halong.mydemo.dagger2

import dagger.Module
import dagger.Provides

/**
 * 职责：为框架提供实例对象
 */
@Module
class MyModule{
    @Provides //提供实例
    fun provideUser():User{
        return User()
    }
}