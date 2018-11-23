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

        viewModel.getUsers().observe(this, Observer {
            if (it != null) {
                message.text=it.toString()
            }
        })


        button1.setOnClickListener {
            val user = User()
            user.name="dadadadad"
            user.age=100
            viewModel.addUser(user)
        }

        button2.setOnClickListener {
//            val user=viewModel.getUser(14)
//            if (user != null) {
//                viewModel.removeUser(user)
//            }

            viewModel.removeAllUsers()
        }

        button3.setOnClickListener {
//            val user=viewModel.getUser(5)
//            if (user != null) {
//                user.name="uuuuuuuuuuuuuuuuuu"
//                viewModel.updateUser(user)
//            }

            viewModel.updateAllUsers()

        }


    }

}
