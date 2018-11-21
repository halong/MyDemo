package com.example.halong.mydemo.room.data.room

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*
import com.example.halong.mydemo.room.data.room.User

@Dao
interface UserDao {
    @Query("select * from user where id= :id")
    fun getUser(id: Int): User?

    @Query("select * from user")
    fun getUsers(): LiveData<List<User>>

    @Insert(onConflict = OnConflictStrategy.REPLACE) //插入时如果PrimaryKey相同则替换
    fun insert(user: User)

    @Delete
    fun delete(user: User)

    @Update
    fun update(user: User)
}