package com.example.halong.mydemo.room.data.room

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context

@Database(entities = arrayOf(User::class), version = 1)
abstract class MyDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao

    //伴生对象 相当于static
    companion object {
        @Volatile private var INSTANCE: MyDatabase? = null

        // 单例
        fun getInstance(context: Context) =
            INSTANCE ?: synchronized(this) {
                INSTANCE
                    ?: buildDatabase(context).also { INSTANCE = it }
            }

        // 新建数据库
        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(context.applicationContext,
                MyDatabase::class.java, "Sample.db")
                .allowMainThreadQueries()
                .build()
    }
}