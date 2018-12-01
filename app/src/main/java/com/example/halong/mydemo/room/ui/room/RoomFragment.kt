package com.example.halong.mydemo.room.ui.room

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.halong.mydemo.R
import com.example.halong.mydemo.room.data.room.User
import kotlinx.android.synthetic.main.room_fragment.*

class RoomFragment : Fragment() {

    companion object {
        fun newInstance() = RoomFragment()
    }

    private lateinit var viewModel: RoomViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.room_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(RoomViewModel::class.java)

        //model control ui
        viewModel.getUsers().observe(this, Observer {
                message.text=it!!.toString()
        })


        // events control model
        button1.setOnClickListener {
            val user = User()  //data class 里面的参数全赋值就会自动生成一个无参构造方法
            user.name="dadadadad"
            user.age=100
            viewModel.addUser(user)
        }

        button2.setOnClickListener {
            viewModel.removeAllUsers()
        }

        button3.setOnClickListener {
            viewModel.updateAllUsers()

        }


    }

}
