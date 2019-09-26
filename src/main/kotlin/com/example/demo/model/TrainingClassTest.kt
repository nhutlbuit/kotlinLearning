package com.example.demo.model


import org.hibernate.annotations.Fetch
import org.hibernate.annotations.FetchMode
import org.hibernate.annotations.LazyToOne
import org.hibernate.annotations.LazyToOneOption
import org.springframework.data.rest.core.annotation.RestResource

import javax.persistence.*
import java.io.Serializable

@Entity
@Table(name = "TRAINING_CLASS_TEST")
class TrainingClassTest : Serializable {

    /**
     * @return the id
     */
    /**
     * @param id the id to set
     */
    @Id
    @SequenceGenerator(name = "classIdSeq1", sequenceName = "SEQ_CLASS_ID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "classIdSeq1")
    @Column(name = "ID", unique = true, nullable = false, precision = 10, scale = 0)
    var id: Long = 0

    /**
     * @return the className
     */
    /**
     * @param className the className to set
     */
    @Column(name = "CLASS_NAME", length = 50)
    var className: String? = null

    /**
     * @return the classCode
     */
    /**
     * @param classCode the classCode to set
     */
    @Column(name = "CLASS_CODE", length = 20)
    var classCode: String? = null

    @Column(name = "REF_TEACHER_ID")
    private val refTeacherCode: Long = 0

    /**
     * @return the teacherRef
     */
    /**
     * @param teacherRef the teacherRef to set
     */
    @Fetch(FetchMode.SELECT)
    @OneToOne(cascade = arrayOf(CascadeType.DETACH), fetch = FetchType.LAZY, optional = true)
    @LazyToOne(value = LazyToOneOption.NO_PROXY)
    @JoinColumn(name = "REF_TEACHER_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @RestResource(exported = true)
    var teacherRef: Teacher? = null

    @Column(name = "REF_COURSE_ID")
    private val refCourseId: Long = 0

    /**
     * @return the courseRef
     */
    /**
     * @param courseRef the courseRef to set
     */
    @OneToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "REF_COURSE_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @RestResource(exported = false) /* Enabled to hibernate to know to export the resource */
    var courseRef: Course? = null

    /**
     * @return the fromDate
     */
    /**
     * @param fromDate the fromDate to set
     */
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.DATE)
    var fromDate: java.util.Date? = null

    /**
     * @return the toDate
     */
    /**
     * @param toDate the toDate to set
     */
    @Column(name = "TO_DATE")
    @Temporal(TemporalType.DATE)
    var toDate: java.util.Date? = null

    /**
     * @return the score
     */
    /**
     * @param score the score to set
     */
    @Column(name = "SCORE")
    var score: Double? = null

    companion object {

        private const val serialVersionUID = -7866462895714629393L
    }


}