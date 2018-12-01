package com.example.halong.mydemo.retrofit.ui.retrofit

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.halong.mydemo.R
import kotlinx.android.synthetic.main.retrofit_fragment.*

class RetrofitFragment : Fragment() {

    companion object {
        fun newInstance() = RetrofitFragment()
    }

    private lateinit var viewModel: RetrofitViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.retrofit_fragment, container, false)


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(RetrofitViewModel::class.java)

        viewModel.text.observe(this, Observer {
                text.text=it   //数据控制视图
        })

        button1.setOnClickListener {
            viewModel.getHTMLString();//事件改变数据
        }
    }

}
