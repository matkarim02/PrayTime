package com.example.project

import com.example.project.model.Item
import com.example.project.model.Solat
import com.example.project.screens.vremya.VremyaFragment
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SalatPresenter(context: VremyaFragment){
    val salatView = context as ISalatView

    fun getDataFromApi(city:String) {
        RetrofitService.create()
            .getApi(city)
            .enqueue(object : Callback<Solat> {
                override fun onFailure(call: Call<Solat>, t: Throwable) {
                    salatView.onDataErrorFromApi(t)
                }

                override fun onResponse(call: Call<Solat>, response: Response<Solat>) {
                    salatView.onDataCompleteFromApi(response.body()?.items?.get(0) as Item)
                }

            })

    }
}