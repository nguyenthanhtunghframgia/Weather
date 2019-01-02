package com.example.domain.model

import com.example.domain.base.BaseModel

data class Main(
    val temp: Float? = null,
    val tempMin: Float? = null,
    val tempMax: Float? = null,
    val pressure: Float? = null,
    val seaLevel: Float? = null,
    val groundLevel: Float? = null,
    val humidity: Float? = null,
    val tempKf: Float? = null
) : BaseModel()
