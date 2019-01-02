package com.example.domain.model

import com.example.domain.base.BaseModel

data class Response(
    val id: Int? = null,
    val main: String? = null,
    val description: String? = null,
    val icon: String? = null
) : BaseModel()
