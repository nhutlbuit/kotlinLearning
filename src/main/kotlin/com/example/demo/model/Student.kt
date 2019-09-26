package com.example.demo.model

import java.io.Serializable

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.SequenceGenerator
import javax.persistence.Table
import javax.persistence.Temporal
import javax.persistence.TemporalType

@Entity
@Table(name = "STUDENT")
class Student : Serializable, Cloneable {

    @Id
    @SequenceGenerator(name = "studentIdSeq", sequenceName = "SEQ_STUDENT_ID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "studentIdSeq")
    @Column(name = "ID", unique = true, nullable = false, precision = 10, scale = 0)
    var id: Long = 0

    @Column(name = "STUDENT_CODE", length = 20)
    var studentCode: String? = null

    @Column(name = "REF_CLASS_CODE", length = 20)
    var classCode: String? = null

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "REF_CLASS_CODE", referencedColumnName = "CLASS_CODE", nullable = true, insertable = false, updatable = false)
    var trainingClass: TrainingClass? = null

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

    companion object {
        private const val serialVersionUID = 8208045971608928281L
    }
}