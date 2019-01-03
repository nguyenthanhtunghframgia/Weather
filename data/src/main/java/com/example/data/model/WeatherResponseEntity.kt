package com.example.data.model

import com.example.data.base.BaseEntity
import com.example.data.base.EntityMapper
import com.example.domain.model.WeatherResponse
import com.google.gson.annotations.SerializedName

data class WeatherResponseEntity(
    @SerializedName("cod")
    val cod: Int? = null,
    @SerializedName("message")
    val message: String? = null,
    @SerializedName("cnt")
    val cnt: Int? = null,
    @SerializedName("list")
    val listResult: List<ResultEntity>? = null,
    @SerializedName("city")
    val city: CityEntity? = null
) : BaseEntity()

class WeatherResponseEntityMapper(
    private val resultEntityMapper: ResultEntityMapper,
    private val cityEntityMapper: CityEntityMapper
) : EntityMapper<WeatherResponse, WeatherResponseEntity> {

    override fun mapToDomain(entity: WeatherResponseEntity): WeatherResponse = WeatherResponse(
        cod = entity.cod,
        message = entity.message,
        cnt = entity.cnt,
        listResults = entity.listResult?.map { resultEntityMapper.mapToDomain(it) },
        city = entity.city?.let { cityEntityMapper.mapToDomain(it) }
    )

    override fun mapToEntity(model: WeatherResponse): WeatherResponseEntity = WeatherResponseEntity(
        cod = model.cod,
        message = model.message,
        cnt = model.cnt,
        listResult = model.listResults?.map { resultEntityMapper.mapToEntity(it) },
        city = model.city?.let { cityEntityMapper.mapToEntity(it) }
    )
}
