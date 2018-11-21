package com.example.halong.mydemo.room.data.room

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "user")
data class User(
    @PrimaryKey(autoGenerate = true) //ID 自增
    var id: Int=0,
    @ColumnInfo(name= "name")
    var name: String="",
    var age: Int=0
)