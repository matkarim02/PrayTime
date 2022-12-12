package com.example.project

import com.example.project.model.Item

interface PrayerView {
    fun onDataCompleteFromApi(prayer:Item)
    fun onDataErrorFromApi(throwable: Throwable)

}