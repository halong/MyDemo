package com.example.halong.mydemo.room.ui.room

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.example.halong.mydemo.room.data.room.MyDatabase
import com.example.halong.mydemo.room.data.room.User
//这是业务层 调用工具层  被UI层的事件调用
class RoomViewModel(application: Application) : AndroidViewModel(application) {
    //这里有坑：要在app build.gradle添加apply plugin: 'kotlin-kapt'
    private val userDao = MyDatabase.getInstance(getApplication()).userDao()

    fun getUser(id:Int):User?{
        return userDao.getUser(id)
    }

    fun getUsers():LiveData<List<User>> =userDao.getUsers()

    fun addUser(user: User){
        userDao.insert(user)
    }

    fun removeUser(user: User){
        userDao.delete(user)
    }

    fun updateUser(user: User){
        userDao.update(user)
    }

    fun removeAllUsers() {
        for (user in userDao.getUser()){
            removeUser(user)
        }
    }

    fun updateAllUsers() {
        for ( user in userDao.getUser()){
            user.name="我是更新的名字"
            updateUser(user)
        }
    }


}
