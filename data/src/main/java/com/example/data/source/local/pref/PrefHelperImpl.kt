package com.example.data.source.local.pref

import android.content.Context

class PrefHelperImpl(context: Context) : PrefHelper {

    companion object {
        const val FIRST_RUN = "first_run"
    }

    private val sharedPreferences = context.getSharedPreferences(context.packageName, Context.MODE_PRIVATE)

    override fun getFirstRun(): Boolean = sharedPreferences.getBoolean(FIRST_RUN, true)

    override fun setFirstRun(firstRun: Boolean) {
        sharedPreferences.edit().putBoolean(FIRST_RUN, firstRun).apply()
    }
}
