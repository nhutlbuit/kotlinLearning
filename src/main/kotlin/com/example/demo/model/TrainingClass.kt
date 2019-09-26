package com.example.demo.model

import org.hibernate.annotations.Fetch
import org.hibernate.annotations.FetchMode
import org.hibernate.annotations.LazyToOne
import org.hibernate.annotations.LazyToOneOption

import javax.persistence.*
import java.io.Serializable

@Entity
@Table(name = "TRAINING_CLASS")
class TrainingClass : Serializable {

    /**
     * @return the id
     */
    /**
     * @param id the id to set
     */
    @Id
    @SequenceGenerator(name = "classIdSeq", sequenceName = "SEQ_CLASS_ID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "classIdSeq")
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

    /**
     * @return the students
     */
    /**
     * @param students the students to set
     */
    @OrderBy("firstName desc")
    @OneToMany(mappedBy = "trainingClass", fetch = FetchType.LAZY, targetEntity = Student::class)
    var students: List<Student>? = null

    /**
     * @return the refTeacherCode
     */
    /**
     * @param refTeacherCode the refTeacherCode to set
     */
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "REF_TEACHER_CODE", length = 20)
    var refTeacherCode: String? = null

    /**
     * @return the teacherRef
     */
    /**
     * @param teacherRef the teacherRef to set
     */
    @Fetch(FetchMode.SELECT)
    @OneToOne(cascade = arrayOf(CascadeType.DETACH), fetch = FetchType.LAZY, optional = false)
    @LazyToOne(value = LazyToOneOption.NO_PROXY)
    @JoinColumn(name = "REF_TEACHER_CODE", referencedColumnName = "TEACHER_CODE", insertable = false, updatable = false)
    var teacherRef: Teacher? = null

    /**
     * @return the refCourseCode
     */
    /**
     * @param refCourseCode the refCourseCode to set
     */
    @Column(name = "REF_COURSE_CODE", length = 20)
    var refCourseCode: String? = null

    /**
     * @return the courseRef
     */
    /**
     * @param courseRef the courseRef to set
     */
    @OneToOne(optional = false)
    @JoinColumn(name = "REF_COURSE_CODE", referencedColumnName = "COURSE_CODE", insertable = false, updatable = false)
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

        /**
         *
         */
        private const val serialVersionUID = 7189872751297163713L
    }


}