package com.example.data.model

import com.example.data.base.EntityMapper
import com.example.data.base.BaseEntity
import com.example.domain.model.Rain
import com.google.gson.annotations.SerializedName

data class RainEntity(
    @SerializedName("3h")
    val threeHours: Float? = null
) : BaseEntity()

class RainEntityMapper : EntityMapper<Rain, RainEntity> {

    override fun mapToDomain(entity: RainEntity): Rain = Rain(
        threeHours = entity.threeHours
    )

    override fun mapToEntity(model: Rain): RainEntity = RainEntity(
        threeHours = model.threeHours
    )
}
