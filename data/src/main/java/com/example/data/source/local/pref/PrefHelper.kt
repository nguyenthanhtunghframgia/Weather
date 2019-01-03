package com.example.data.source.local.pref

interface PrefHelper {

    fun getFirstRun(): Boolean

    fun setFirstRun(firstRun: Boolean)
}
