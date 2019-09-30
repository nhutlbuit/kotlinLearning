//package com.example.demo.repository
//
//
//import com.example.demo.model.Teacher
//import org.springframework.data.jpa.repository.JpaRepository
//import org.springframework.data.repository.query.Param
//import org.springframework.data.rest.core.annotation.RepositoryRestResource
//import org.springframework.data.rest.core.annotation.RestResource
//
//import io.swagger.annotations.Api
//import io.swagger.annotations.ApiOperation
//
//@Api("Teacher information")
//@RepositoryRestResource
//interface TeacherRepository : JpaRepository<Teacher, Long> {
//
//    @ApiOperation("Find by FirstName  ")
//    @RestResource(path = "byFirstName")
//    fun findByFirstNameIgnoreCaseContains(@Param("firstName") firstName: String): List<Teacher>
//}