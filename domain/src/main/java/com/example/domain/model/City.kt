package com.example.domain.model

import com.example.domain.base.BaseModel

data class City(
    val id: Int? = null,
    val name: String? = null,
    val coord: Coord? = null,
    val country: String? = null,
    val population: Int? = null
) : BaseModel()
