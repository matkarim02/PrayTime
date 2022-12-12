package com.example.project

import android.content.Context
import com.example.project.model.Item
import com.example.project.model.prayer
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PrayerPresenter(context: Context){
    val prayerView = context as PrayerView

    fun getDataFromApi(city:String) {
        RetrofitService.create()
            .getApi(city)
            .enqueue(object : Callback<prayer> {
                override fun onFailure(call: Call<prayer>, t: Throwable) {
                    prayerView.onDataErrorFromApi(t)
                }

                override fun onResponse(call: Call<prayer>, response: Response<prayer>) {
                    prayerView.onDataCompleteFromApi(response.body()?.items?.get(0) as Item )
                }

            })

    }
}