package com.example.demo.repository


import com.example.demo.model.Student
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation

@Api("Student information")
@RepositoryRestResource
interface StudentRepository : JpaRepository<Student, Long> {

    @ApiOperation("Find by FirstName  ")
    @RestResource(path = "byFirstName")
    fun findByFirstNameIgnoreCase(@Param("firstName") firstName: String): List<Student>
}