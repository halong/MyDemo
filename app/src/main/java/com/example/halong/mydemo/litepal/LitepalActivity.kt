package com.example.halong.mydemo.litepal

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.halong.mydemo.R
import com.example.halong.mydemo.litepal.ui.litepal.LitepalFragment

class LitepalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.litepal_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, LitepalFragment.newInstance())
                .commitNow()
        }
    }

}
