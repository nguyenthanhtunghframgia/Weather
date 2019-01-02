package com.example.data.model

import com.example.data.base.BaseEntity
import com.example.data.base.EntityMapper
import com.example.domain.model.Clouds
import com.google.gson.annotations.SerializedName

data class CloudsEntity(
    @SerializedName("all")
    val all: Int? = null
) : BaseEntity()

class CloudsEntityMapper : EntityMapper<Clouds, CloudsEntity> {

    override fun mapToDomain(entity: CloudsEntity): Clouds = Clouds(
        all = entity.all
    )

    override fun mapToEntity(model: Clouds): CloudsEntity = CloudsEntity(
        all = model.all
    )
}
