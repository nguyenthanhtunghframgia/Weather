package com.example.data.source

import com.example.data.source.remote.WeatherApi
import com.example.domain.model.WeatherResponse
import com.example.domain.repository.WeatherRepository
import io.reactivex.Single

class WeatherRepositoryImpl(
    private val weatherApi: WeatherApi
) : WeatherRepository {

    override fun getWeatherByCityName(city: String): Single<WeatherResponse> = weatherApi.getWeatherByLocation(city)
}
