package com.example.demo.repository


import com.example.demo.model.TrainingClass
import com.example.demo.model.TrainingClassTest
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation

@Api("Training Class")
@RepositoryRestResource
interface TrainingClassRepositoryTest : JpaRepository<TrainingClassTest, Long> {

    @ApiOperation("Find by Class Code ")
    @RestResource(path = "byClassCode")
    fun findByClassCodeIgnoreCaseContains(@Param("classCode") classCode: String): List<TrainingClassTest>
}