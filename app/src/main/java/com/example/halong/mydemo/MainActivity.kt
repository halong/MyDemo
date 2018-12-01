package com.example.halong.mydemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.halong.mydemo.dagger2.TestActivity
import com.example.halong.mydemo.databinding.DataBindingDemoActivity
import com.example.halong.mydemo.retrofit.RetrofitActivity
import com.example.halong.mydemo.room.RoomActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            startActivity(Intent(this,RoomActivity::class.java))
        }

        button2.setOnClickListener {
            startActivity(Intent(this,RetrofitActivity::class.java))
        }

        button3.setOnClickListener {
            startActivity(Intent(this,TestActivity::class.java))
        }

        button4.setOnClickListener {
            startActivity(Intent(this,DataBindingDemoActivity::class.java))
        }


    }
}
