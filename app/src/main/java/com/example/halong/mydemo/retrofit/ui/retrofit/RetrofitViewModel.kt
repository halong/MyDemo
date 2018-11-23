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
        MyRetrofit.getInstance().getService().getHTMLString().enqueue(object :Callback<ResponseBody>{
            /**
             * Invoked when a network exception occurred talking to the server or when an unexpected
             * exception occurred creating the request or processing the response.
             */
            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
            }

            /**
             * Invoked for a received HTTP response.
             *
             *
             * Note: An HTTP response may still indicate an application-level failure such as a 404 or 500.
             * Call [Response.isSuccessful] to determine if the response indicates success.
             */
            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                text.postValue(response.body()!!.string())
            }
        })
    }
}
