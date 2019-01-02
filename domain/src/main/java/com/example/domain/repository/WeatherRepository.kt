package com.example.domain.repository

import com.example.domain.model.WeatherResponse
import io.reactivex.Single

interface WeatherRepository {

    fun getWeatherByCityName(city: String): Single<WeatherResponse>
}
