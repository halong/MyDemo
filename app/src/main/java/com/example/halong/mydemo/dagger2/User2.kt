package com.example.halong.mydemo.dagger2

import javax.inject.Inject

/**
 * @Inject->为框架指定创建实例的构造方法  若该构造方法有参数 则会在框架内继续寻找参数的实例或构造方法
 */
class User2 @Inject constructor() {
    val name="我是通过Inject注释传过来的"
}