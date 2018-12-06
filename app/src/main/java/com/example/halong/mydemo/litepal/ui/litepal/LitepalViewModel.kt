package com.example.halong.mydemo.litepal.ui.litepal

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.content.ContentValues
import com.example.halong.mydemo.litepal.data.litepal.User
import org.litepal.LitePal
import org.litepal.extension.deleteAll
import org.litepal.extension.findAll

class LitepalViewModel : ViewModel() {
    fun insert() {
        val user = User("lilei", 9)
        user.save()
    }

    fun query(): List<User> {
        return LitePal.findAll<User>()
    }

    fun delete() {
        LitePal.deleteAll<User>()
    }

    fun update() {
        val values = ContentValues()
        values.put("name", "lllllllllllllll")
        LitePal.updateAll(User::class.java, values)
    }


}
