package com.example.domain.model

import com.example.domain.base.BaseModel

data class Wind(
    val speed: Float? = null,
    val deg: Float? = null
) : BaseModel()
