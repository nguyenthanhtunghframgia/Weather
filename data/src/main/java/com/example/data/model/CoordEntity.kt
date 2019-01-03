package com.example.data.model

import com.example.data.base.BaseEntity
import com.example.data.base.EntityMapper
import com.example.domain.model.Coord
import com.google.gson.annotations.SerializedName

data class CoordEntity(
    @SerializedName("lat")
    var lat: Float? = null,
    @SerializedName("lon")
    var long: Float? = null
) : BaseEntity()

class CoordEntityMapper : EntityMapper<Coord, CoordEntity> {

    override fun mapToDomain(entity: CoordEntity): Coord = Coord(
        lat = entity.lat,
        long = entity.long
    )

    override fun mapToEntity(model: Coord): CoordEntity = CoordEntity(
        lat = model.lat,
        long = model.long
    )
}
