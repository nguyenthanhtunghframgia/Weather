package com.example.data.source.local.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.data.model.CityEntity
import io.reactivex.Single

@Dao
interface CityEntityDao {

    @Query("SELECT * FROM tb_city")
    fun getCityEntity(): Single<List<CityEntity>>
}
