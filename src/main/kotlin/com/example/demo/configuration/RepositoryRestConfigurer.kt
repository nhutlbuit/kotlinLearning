package com.example.demo.configuration


import org.springframework.context.annotation.Configuration
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter


@Configuration
class RepositoryRestConfigurer : RepositoryRestConfigurerAdapter() {

    override fun configureRepositoryRestConfiguration(
            repositoryRestConfiguration: RepositoryRestConfiguration?) {
        repositoryRestConfiguration!!.projectionConfiguration
    }
}