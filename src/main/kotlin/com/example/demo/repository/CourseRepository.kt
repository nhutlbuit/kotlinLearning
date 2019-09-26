package com.example.demo.repository

import com.example.demo.model.Course
import io.swagger.annotations.Api
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource


@Api("Course information")
@RepositoryRestResource(collectionResourceRel = "course", path = "course")
interface CourseRepository : JpaRepository<Course, Long>