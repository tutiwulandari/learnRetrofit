package com.example.learnretrofit.data

import retrofit2.Call
import retrofit2.http.GET

interface Users {
    @GET("users")
    fun getUsers(): Call<List<ResultUsers>>
}