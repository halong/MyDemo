package com.example.halong.mydemo.room.ui.room

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import com.example.halong.mydemo.room.data.room.MyDatabase
import com.example.halong.mydemo.room.data.room.User

class RoomViewModel(application: Application) : AndroidViewModel(application) {
    //这里有坑：要在app build.gradle添加apply plugin: 'kotlin-kapt'
    private val userDao = MyDatabase.getInstance(getApplication()).userDao()

    fun getUser(id:Int):User?{
        return userDao.getUser(id)
    }

    fun getUsers():LiveData<List<User>>{
        return userDao.getUsers()
    }

    fun addUser(user: User){
        userDao.insert(user)
    }

    fun removeUser(user: User){
        userDao.delete(user)
    }

    fun updateUser(user: User){
        userDao.update(user)
    }
}
