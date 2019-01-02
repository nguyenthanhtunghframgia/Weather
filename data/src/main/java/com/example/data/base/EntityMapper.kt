package com.example.data.base

import com.example.domain.base.BaseModel

interface EntityMapper<M : BaseModel, E : BaseEntity> {

    fun mapToDomain(entity: E): M

    fun mapToEntity(model: M): E
}
