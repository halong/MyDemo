package com.example.halong.mydemo.retrofit.data.retrofit

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("/")   //参数不能为空
    fun getHTMLString():Call<ResponseBody>  //注意返回值
}