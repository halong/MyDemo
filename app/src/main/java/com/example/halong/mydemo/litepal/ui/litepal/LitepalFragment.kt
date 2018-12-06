package com.example.halong.mydemo.litepal.ui.litepal

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.halong.mydemo.R
import com.example.halong.mydemo.litepal.data.litepal.User
import kotlinx.android.synthetic.main.litepal_fragment.*

class LitepalFragment : Fragment() {

    companion object {
        fun newInstance() = LitepalFragment()
    }

    private lateinit var viewModel: LitepalViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.litepal_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(LitepalViewModel::class.java)

        button1.setOnClickListener {
            viewModel.insert()
        }

        button2.setOnClickListener {
            val users = viewModel.query()
            var text = ""
            for (user in users){
                text += user.name + user.age + "\n"
            }
            message.text = text
        }

        button3.setOnClickListener {
            viewModel.delete()
        }

        button4.setOnClickListener {
            viewModel.update()
        }
    }

}
