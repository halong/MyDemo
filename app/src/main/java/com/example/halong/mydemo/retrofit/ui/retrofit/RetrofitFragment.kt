package com.example.halong.mydemo.retrofit.ui.retrofit

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.halong.mydemo.R

class RetrofitFragment : Fragment() {

    companion object {
        fun newInstance() = RetrofitFragment()
    }

    private lateinit var viewModel: RetrofitViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.retrofit_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(RetrofitViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
