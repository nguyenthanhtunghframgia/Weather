package com.example.domain.model

import com.example.domain.base.BaseModel

data class WeatherResponse(
    val cod: Int? = null,
    val message: String? = null,
    val cnt: Int? = null,
    val listResults: List<Result>? = null,
    val city: City? = null
) : BaseModel()
