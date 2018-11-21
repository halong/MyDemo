package com.example.halong.mydemo.retrofit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.halong.mydemo.R
import com.example.halong.mydemo.retrofit.ui.retrofit.RetrofitFragment

class RetrofitActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.retrofit_activity)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, RetrofitFragment.newInstance())
                .commitNow()
        }
    }

}
