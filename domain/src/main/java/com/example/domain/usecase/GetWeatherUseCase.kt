package com.example.domain.usecase

import com.example.domain.base.BaseUseCase
import com.example.domain.model.WeatherResponse
import com.example.domain.repository.WeatherRepository
import io.reactivex.Single

class GetWeatherUseCase(private val weatherRepository: WeatherRepository) :
    BaseUseCase<GetWeatherUseCase.Param, Single<WeatherResponse>>() {

    override fun createObservable(param: Param?): Single<WeatherResponse> {
        param?.let {
            return weatherRepository.getWeatherByCityName(param.city)
        }
        return Single.error(Throwable("Invalid Param"))
    }

    override fun onClear() {
    }

    class Param(val city: String)
}
