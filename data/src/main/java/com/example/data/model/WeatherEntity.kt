package com.example.data.model

import com.example.data.base.BaseEntity
import com.example.data.base.EntityMapper
import com.example.domain.model.Weather
import com.google.gson.annotations.SerializedName

data class WeatherEntity(
    @SerializedName("weather")
    val listResponse: List<ResponseEntity>? = null
) : BaseEntity()

class WeatherEntityMapper(
    private val responseEntityMapper: ResponseEntityMapper

) : EntityMapper<Weather, WeatherEntity> {

    override fun mapToDomain(entity: WeatherEntity): Weather = Weather(
        listResponse = entity.listResponse?.map { responseEntityMapper.mapToDomain(it) }
    )

    override fun mapToEntity(model: Weather): WeatherEntity = WeatherEntity(
        listResponse = model.listResponse?.map { responseEntityMapper.mapToEntity(it) }
    )
}
