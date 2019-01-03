package com.example.data.source.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.data.util.DB_VERSION
import com.example.data.model.CityEntity
import com.example.data.source.local.dao.CityEntityDao

@Database(entities = [CityEntity::class], version = DB_VERSION, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun cityDao(): CityEntityDao
}
