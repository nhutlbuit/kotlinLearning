package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.boot.builder.SpringApplicationBuilder



@SpringBootApplication
class DemoApplication: SpringBootServletInitializer()
fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}

@Override
fun configure(builder: SpringApplicationBuilder): SpringApplicationBuilder {
	return builder.sources(DemoApplication::class.java!!)
}