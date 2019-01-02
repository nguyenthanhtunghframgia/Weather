package com.example.domain.base

abstract class BaseUseCase<in Param, out T> where T : Any {

    abstract fun createObservable(param: Param? = null): T

    abstract fun onClear()
}
