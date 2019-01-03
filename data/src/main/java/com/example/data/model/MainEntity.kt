package com.example.data.model

import com.example.data.base.BaseEntity
import com.example.data.base.EntityMapper
import com.example.domain.model.Main
import com.google.gson.annotations.SerializedName

data class MainEntity(
    @SerializedName("temp")
    val temp: Float? = null,
    @SerializedName("temp_min")
    val tempMin: Float? = null,
    @SerializedName("temp_max")
    val tempMax: Float? = null,
    @SerializedName("pressure")
    val pressure: Float? = null,
    @SerializedName("sea_level")
    val seaLevel: Float? = null,
    @SerializedName("grnd_level")
    val groundLevel: Float? = null,
    @SerializedName("humidity")
    val humidity: Float? = null,
    @SerializedName("temp_kf")
    val tempKf: Float? = null
) : BaseEntity()

class MainEntityMapper() : EntityMapper<Main, MainEntity> {

    override fun mapToDomain(entity: MainEntity): Main = Main(
        temp = entity.temp,
        tempMin = entity.tempMin,
        tempMax = entity.tempMax,
        pressure = entity.pressure,
        seaLevel = entity.seaLevel,
        groundLevel = entity.groundLevel,
        humidity = entity.humidity,
        tempKf = entity.tempKf
    )

    override fun mapToEntity(model: Main): MainEntity = MainEntity(
        temp = model.temp,
        tempMin = model.tempMin,
        tempMax = model.tempMax,
        pressure = model.pressure,
        seaLevel = model.seaLevel,
        groundLevel = model.groundLevel,
        humidity = model.humidity,
        tempKf = model.tempKf
    )
}
