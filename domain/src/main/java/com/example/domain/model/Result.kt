package com.example.domain.model

import com.example.domain.base.BaseModel

data class Result(
    val dt: Int? = null,
    val main: Main? = null,
    val weather: Weather? = null,
    val clouds: Clouds? = null,
    val wind: Wind? = null,
    val rain: Rain? = null,
    val sys: Sys? = null,
    val dtText: String? = null
) : BaseModel()
