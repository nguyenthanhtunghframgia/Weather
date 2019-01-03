package com.example.data.model

import com.example.data.base.BaseEntity
import com.example.data.base.EntityMapper
import com.example.domain.model.Result
import com.google.gson.annotations.SerializedName

data class ResultEntity(
    @SerializedName("dt")
    val dt: Int? = null,
    @SerializedName("main")
    val main: MainEntity? = null,
    @SerializedName("weather")
    val weather: WeatherEntity? = null,
    @SerializedName("clouds")
    val clouds: CloudsEntity? = null,
    @SerializedName("wind")
    val wind: WindEntity? = null,
    @SerializedName("rain")
    val rain: RainEntity? = null,
    @SerializedName("sys")
    val sys: SysEntity? = null,
    @SerializedName("dt_txt")
    val dtText: String? = null
) : BaseEntity()

class ResultEntityMapper(
    private val mainEntityMapper: MainEntityMapper,
    private val weatherEntityMapper: WeatherEntityMapper,
    private val cloudsEntityMapper: CloudsEntityMapper,
    private val windEntityMapper: WindEntityMapper,
    private val rainEntityMapper: RainEntityMapper,
    private val sysEntityMapper: SysEntityMapper
) : EntityMapper<Result, ResultEntity> {

    override fun mapToDomain(entity: ResultEntity): Result = Result(
        dt = entity.dt,
        main = entity.main?.let { mainEntityMapper.mapToDomain(it) },
        weather = entity.weather?.let { weatherEntityMapper.mapToDomain(it) },
        clouds = entity.clouds?.let { cloudsEntityMapper.mapToDomain(it) },
        wind = entity.wind?.let { windEntityMapper.mapToDomain(it) },
        rain = entity.rain?.let { rainEntityMapper.mapToDomain(it) },
        sys = entity.sys?.let { sysEntityMapper.mapToDomain(it) },
        dtText = entity.dtText
    )

    override fun mapToEntity(model: Result): ResultEntity = ResultEntity(
        dt = model.dt,
        main = model.main?.let { mainEntityMapper.mapToEntity(it) },
        weather = model.weather?.let { weatherEntityMapper.mapToEntity(it) },
        clouds = model.clouds?.let { cloudsEntityMapper.mapToEntity(it) },
        wind = model.wind?.let { windEntityMapper.mapToEntity(it) },
        rain = model.rain?.let { rainEntityMapper.mapToEntity(it) },
        sys = model.sys?.let { sysEntityMapper.mapToEntity(it) },
        dtText = model.dtText
    )
}
