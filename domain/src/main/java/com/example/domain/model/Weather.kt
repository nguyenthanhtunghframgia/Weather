package com.example.domain.model

import com.example.domain.base.BaseModel

data class Weather(
    val listResponse: List<Response>? = null
) : BaseModel()
