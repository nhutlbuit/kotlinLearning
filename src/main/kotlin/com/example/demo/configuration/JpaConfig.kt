package com.example.demo.configuration

import com.example.demo.model.AbstractEntity
import org.springframework.boot.web.servlet.ServletRegistrationBean
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.springframework.transaction.annotation.EnableTransactionManagement
import org.springframework.data.jpa.repository.config.EnableJpaRepositories


@Configuration
@EnableJpaRepositories(basePackages = arrayOf("com.example.demo.repository"))
@EnableTransactionManagement
@EntityScan("com.example.demo.model")
class JpaConfig {
    @Bean
    @Profile("h2")
    internal fun h2servletRegistration(): ServletRegistrationBean<*> {
        val registrationBean =  h2servletRegistration()
        registrationBean.addUrlMappings("/h2console/*")
        return registrationBean
    }

    @Bean
    fun initAbstractEntity(): AbstractEntity {
        return AbstractEntity()
    }

}