package com.example.demo.model

import com.example.demo.Utils.DateUtils
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.PreUpdate
import org.springframework.data.annotation.CreatedBy
import org.hibernate.annotations.CreationTimestamp
import org.springframework.data.annotation.LastModifiedBy
import org.hibernate.annotations.UpdateTimestamp
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.io.Serializable
import java.sql.Timestamp
import javax.persistence.Column
import javax.persistence.EntityListeners
import javax.persistence.MappedSuperclass

@MappedSuperclass
//@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties("hibernateLazyInitializer", "handler")
class AbstractEntity : Serializable {

    @Column(name = "UPDT_DT", nullable = true, updatable = true)
    @JsonIgnore
    @UpdateTimestamp
    private var updatedDate: Timestamp? = null

    @Column(name = "UPDT_BY", nullable = true, updatable = true)
    @LastModifiedBy
    var updatedBy: String? = null

    @Column(name = "CREAT_DT", nullable = true, updatable = false)
    @JsonIgnore
    @CreationTimestamp
    private val createdDate: Timestamp? = null

    @Column(name = "CREAT_BY", nullable = true, updatable = false)
    @CreatedBy
    var createdBy: String? = null

    @PreUpdate
    internal fun updatedAt() {
        this.updatedDate = DateUtils.currentTimestamp
    }

    companion object {

        private const val serialVersionUID = 3470819715990404316L
    }

}