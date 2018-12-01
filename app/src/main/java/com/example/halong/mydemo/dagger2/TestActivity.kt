package com.example.halong.mydemo.dagger2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.halong.mydemo.R
import kotlinx.android.synthetic.main.activity_test.*
import javax.inject.Inject

/**
 * Dagger2:依赖注入框架    依赖=创建实例+变量声明+赋值变量
 * 基本使用方法：1，@Module  @Provides提供实例 或 @Inject标记类的构造方法
 *               2，@Component 指定注入的目标类和提供实例对象的类
 *               3，在目标类注册框架 指定赋值的变量
 */
class TestActivity : AppCompatActivity() {
    @Inject //指定框架赋值的变量
    lateinit var user: User

    @Inject //指定框架赋值的变量
    lateinit var user2: User2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        DaggerMyComponent.builder()  //注册框架  注意加前缀Dagger  DaggerMyComponent这个类由kapt框架编译时生成
            .build()
            .inject(this)

        text.text = user.name   //使用已赋值的变量
        text2.text = user2.name
    }
}
