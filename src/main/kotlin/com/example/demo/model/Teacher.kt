package com.example.demo.model


import java.io.Serializable

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
import javax.persistence.Temporal
import javax.persistence.TemporalType
import javax.persistence.Transient

@Entity
@Table(name = "TEACHER")
class Teacher : Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false, precision = 10, scale = 0)
    var id: Long = 0

    @Column(name = "TEACHER_CODE", length = 20)
    var teacherCode: String? = null

    @Column(name = "FIRST_NAME", length = 20)
    var firstName: String? = null

    @Column(name = "MIDDLE_NAME", length = 20)
    var middleName: String? = null

    @Column(name = "LAST_NAME", length = 20)
    var lastName: String? = null

    @Column(name = "DOB")
    @Temporal(TemporalType.DATE)
    var dateOfBirth: java.util.Date? = null

    @Column(name = "PHONE_NUMBER")
    var phoneNumber: Int? = null

    @Column(name = "ADDRESS", length = 100)
    var address: String? = null

    val fullName: String
        @Transient
        get() = arrayOf(this.lastName, this.middleName, this.firstName).joinToString(" ")

    companion object {
        private const val serialVersionUID = 8208045971608928281L
    }


}