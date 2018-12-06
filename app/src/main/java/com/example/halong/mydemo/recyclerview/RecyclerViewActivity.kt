package com.example.halong.mydemo.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.halong.mydemo.R
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {
    private val items= arrayListOf<User>()
    private val adapter = MyAdapter(items)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        items.add(User("leilei"))
        items.add(User("kkkkkkk"))
        items.add(User("leilei"))
        items.add(User("kkkkkkk"))
        items.add(User("leilei"))
        items.add(User("kkkkkkk"))

        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=adapter
    }
}
