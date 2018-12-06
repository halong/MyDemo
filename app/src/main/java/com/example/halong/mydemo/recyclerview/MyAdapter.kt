package com.example.halong.mydemo.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.halong.mydemo.R
import kotlinx.android.synthetic.main.layout_item.view.*

class MyAdapter(val items:List<User>):RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): MyViewHolder {
        val view=LayoutInflater.from(viewGroup.context).inflate(R.layout.layout_item,viewGroup,false)
        val viewHolder=MyViewHolder(view)
        return viewHolder
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.text.text=items[position].name
    }

}