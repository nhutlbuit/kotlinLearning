package com.example.demo.model

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "COURSE")
@ApiModel(description = "Scourse on university of Infomation Technology 2019. ")
class Course: Serializable {

    @ApiModelProperty(notes = "Course ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false, precision = 10, scale = 0)
    var id: Long = 0

    @ApiModelProperty(notes = "Course Name")
    @Column(name = "COURSE_NAME", length = 50)
    var courseName: String? = null

    @ApiModelProperty(notes = "Course code")
    @Column(name = "COURSE_CODE", length = 20, unique = true, nullable = false)
    var courseCode: String? = null


    @ApiModelProperty(notes = "Quality of score")
    @Column(name = "QALF_SCORE", nullable = true)
    var qualifiedScore: Double? = null

    companion object {
        private const val serialVersionUID = 7560332713289109340L
    }

    /*
    *
    * @Api	Marks a class as a Swagger resource.
    @ApiModel	Provides additional information about Swagger models.
    @ApiModelProperty	Adds and manipulates data of a model property.
    @ApiOperation	Describes an operation or typically an HTTP method against a specific path.
    @ApiParam	Adds additional meta-data for operation parameters.
    @ApiResponse	Describes a possible response of an operation.
    @ApiResponses
    A wrapper to allow a list of multiple ApiResponse objects.*/


}