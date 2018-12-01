package com.example.halong.mydemo.dagger2

import dagger.Component

/**
 * 职责：为框架指定注入的目标类和提供实例对象的类
 */
@Component(modules = arrayOf(MyModule::class))
interface MyComponent {
    fun inject(activity: TestActivity)  //这里有个坑 一定要指明具体注入的类  eg: activity:TestActivity 而不是 Activity
}