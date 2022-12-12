package com.example.project

import com.example.project.model.Item

interface ISalatView {
    fun onDataCompleteFromApi(salat:Item)
    fun onDataErrorFromApi(throwable: Throwable)

}