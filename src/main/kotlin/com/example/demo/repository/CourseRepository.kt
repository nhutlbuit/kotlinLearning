package com.example.demo.repository

import com.example.demo.model.Course
import io.swagger.annotations.Api
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource


//@Api("Course information")
// @Api(value="Employee Management System", description="Operations pertaining to employee in Employee Management System")
@Api(tags = arrayOf("course Entity"))
@RepositoryRestResource(collectionResourceRel = "course", path = "course")
interface CourseRepository : JpaRepository<Course, Long>