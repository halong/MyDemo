package com.example.halong.mydemo.retrofit.ui.retrofit

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.halong.mydemo.retrofit.data.retrofit.MyRetrofit
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RetrofitViewModel : ViewModel() {
    val text=MutableLiveData<String>()

    fun getHTMLString() {
        MyRetrofit.getInstance().getService().getHTMLString().enqueue(object :Callback<ResponseBody>{//注意object关键词
            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
            }
            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                text.postValue(response.body()!!.string())
            }
        })
    }
}
