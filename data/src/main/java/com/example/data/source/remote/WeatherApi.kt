package com.example.data.source.remote

import com.example.data.util.API_QUERY_PARAM
import com.example.data.util.API_WEATHER_PARAM
import com.example.domain.model.WeatherResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET(API_WEATHER_PARAM)
    fun getWeatherByLocation(@Query(API_QUERY_PARAM) location: String): Single<WeatherResponse>
}
