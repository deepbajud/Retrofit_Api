package com.example.retrofitapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.retrofitapi.Models.CatModel
import com.example.retrofitapi.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnChange.setOnClickListener {
            callApi()
        }

    }

    private fun callApi() {
        var api = ApiClient.getApiClient().create(ApiInterface::class.java)
        api.getCat().enqueue(object : Callback<CatModel>{
            override fun onResponse(call: Call<CatModel>, response: Response<CatModel>) {
                if (response.isSuccessful){
                    var data = response.body()

                    Glide.with(this@MainActivity).load(ApiClient.BASE_URI+data?.url).into(binding.imgImages)
                }
            }

            override fun onFailure(call: Call<CatModel>, t: Throwable) {

            }

        })
    }
}