package com.example.mobileapp.Common

import com.example.mobileapp.Interface.RetrofitServices
import com.example.mobileapp.Retrofit.RetrofitClient
object Common {
    private const val BASE_URL = "https://www.simplifiedcoding.net/demos"
    val retrofitService: RetrofitServices
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitServices::class.java)
}