package com.example.data.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.data.base.BaseEntity
import com.example.data.base.EntityMapper
import com.example.domain.model.City
import com.google.gson.annotations.SerializedName

@Entity(tableName = "tb_city")
data class CityEntity(
    @PrimaryKey(autoGenerate = true)
    @SerializedName("id")
    var id: Int? = 0,
    @SerializedName("name")
    var name: String? = null,
    @Embedded
    @SerializedName("coord")
    var coord: CoordEntity? = null,
    @SerializedName("country")
    var country: String? = null,
    @SerializedName("population")
    var population: Int? = null
) : BaseEntity()

class CityEntityMapper(
    private val coordEntityMapper: CoordEntityMapper
) : EntityMapper<City, CityEntity> {

    override fun mapToDomain(entity: CityEntity): City = City(
        id = entity.id,
        name = entity.name,
        coord = entity.coord?.let { coordEntityMapper.mapToDomain(it) },
        country = entity.country,
        population = entity.population
    )

    override fun mapToEntity(model: City): CityEntity = CityEntity(
        id = model.id,
        name = model.name,
        coord = model.coord?.let { coordEntityMapper.mapToEntity(it) },
        country = model.country,
        population = model.population
    )
}
