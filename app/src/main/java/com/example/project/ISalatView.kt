package com.example.project

import com.example.project.model.Item
import com.example.project.model.Solat
import com.example.project.model.TodayWeather

interface ISalatView {
    fun onDataCompleteFromApi(salat:Item, country: Solat, pogoda: TodayWeather)
    fun onDataErrorFromApi(throwable: Throwable)

}