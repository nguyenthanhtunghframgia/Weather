package com.example.data.model

import com.example.data.base.EntityMapper
import com.example.data.base.BaseEntity
import com.example.domain.model.Sys
import com.google.gson.annotations.SerializedName

data class SysEntity(
    @SerializedName("pod")
    val pod: String? = null
) : BaseEntity()

class SysEntityMapper : EntityMapper<Sys, SysEntity> {

    override fun mapToDomain(entity: SysEntity): Sys = Sys(
        pod = entity.pod
    )

    override fun mapToEntity(model: Sys): SysEntity = SysEntity(
        pod = model.pod
    )
}
