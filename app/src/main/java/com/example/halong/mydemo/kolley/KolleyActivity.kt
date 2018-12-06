package com.example.halong.mydemo.kolley

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.halong.mydemo.R
import com.example.halong.mydemo.kolley.ui.kolley.KolleyFragment

class KolleyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kolley_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, KolleyFragment.newInstance())
                .commitNow()
        }
    }

}
