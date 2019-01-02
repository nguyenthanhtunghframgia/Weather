package com.example.data.model

import com.example.data.base.BaseEntity
import com.example.data.base.EntityMapper
import com.example.domain.model.Response
import com.google.gson.annotations.SerializedName

data class ResponseEntity(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("main")
    val main: String? = null,
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("icon")
    val icon: String? = null
) : BaseEntity()

class ResponseEntityMapper : EntityMapper<Response, ResponseEntity> {

    override fun mapToDomain(entity: ResponseEntity): Response = Response(
        id = entity.id,
        main = entity.main,
        description = entity.description,
        icon = entity.icon
    )

    override fun mapToEntity(model: Response): ResponseEntity = ResponseEntity(
        id = model.id,
        main = model.main,
        description = model.description,
        icon = model.icon
    )
}
