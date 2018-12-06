package com.example.halong.mydemo.kolley.ui.kolley

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.halong.mydemo.R

class KolleyFragment : Fragment() {

    companion object {
        fun newInstance() = KolleyFragment()
    }

    private lateinit var viewModel: KolleyViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.kolley_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(KolleyViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
