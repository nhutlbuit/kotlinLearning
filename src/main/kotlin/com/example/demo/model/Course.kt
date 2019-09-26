package com.example.demo.model

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "COURSE")
class Course: Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false, precision = 10, scale = 0)
    var id: Long = 0

    @Column(name = "COURSE_NAME", length = 50)
    var courseName: String? = null


    @Column(name = "COURSE_CODE", length = 20, unique = true, nullable = false)
    var courseCode: String? = null


    @Column(name = "QALF_SCORE", nullable = true)
    var qualifiedScore: Double? = null

    companion object {
        private const val serialVersionUID = 7560332713289109340L
    }


}