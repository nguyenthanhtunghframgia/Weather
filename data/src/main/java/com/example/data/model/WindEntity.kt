package com.example.data.model

import com.example.data.base.BaseEntity
import com.example.data.base.EntityMapper
import com.example.domain.model.Wind
import com.google.gson.annotations.SerializedName

data class WindEntity(
    @SerializedName("speed")
    val speed: Float? = null,
    @SerializedName("deg")
    val deg: Float? = null
) : BaseEntity()

class WindEntityMapper : EntityMapper<Wind, WindEntity> {

    override fun mapToDomain(entity: WindEntity): Wind = Wind(
        speed = entity.speed,
        deg = entity.deg
    )

    override fun mapToEntity(model: Wind): WindEntity = WindEntity(
        speed = model.speed,
        deg = model.deg
    )
}
