package com.example.project

import com.example.project.model.prayer
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path


interface RetrofitService {

    @GET("{city}.json?key=ba1bf1eec09e02ac9bff09142c4d2371")
    fun getApi(@Path("city") city: String) : Call<prayer>

    companion object {
        fun create(): RetrofitService{
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://muslimsalat.com")
                .build()
            return retrofit.create(RetrofitService::class.java)
        }

    }
}