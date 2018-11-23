package com.example.halong.mydemo.retrofit.data.retrofit

import retrofit2.Retrofit

class MyRetrofit {
    private constructor()

    companion object {
        private var Instance:MyRetrofit?=null
        fun getInstance():MyRetrofit= Instance?:MyRetrofit().also { Instance=it }

        private var mRetrofit:Retrofit? = null
        private fun getRetrofit():Retrofit= mRetrofit?:imitRetrofit()
        private fun imitRetrofit()=Retrofit.Builder().baseUrl("https://www.uc123.com/").build().also { mRetrofit=it }
    }

    fun getService():ApiService= getRetrofit().create(ApiService::class.java)
}