package com.example.retrofitapi

import com.example.retrofitapi.Models.CatModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {


    @GET("cat?json=true")
    fun getCat():Call <CatModel>
}