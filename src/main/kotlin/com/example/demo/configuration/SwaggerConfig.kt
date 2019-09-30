package com.example.demo.configuration


import com.google.common.base.Predicate
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.springframework.scheduling.annotation.EnableAsync
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import springfox.documentation.RequestHandler
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2
import java.util.Arrays.asList

@Configuration
@EnableAsync
@EnableSwagger2
//@Import(SpringDataRestConfiguration::class)
private class SwaggerConfig {
    protected var mainApiMethods = arrayOf(RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH, RequestMethod.DELETE)

    @Bean
    fun adapter(): WebMvcConfigurer = object : WebMvcConfigurer {
        override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
            registry.addResourceHandler("swagger-ui.html")
                    .addResourceLocations("classpath:/META-INF/resources/swagger-ui.html")
            registry.addResourceHandler("/webjars/**")
                    .addResourceLocations("classpath:/META-INF/resources/webjars/")
            super.addResourceHandlers(registry)
        }
    }

    @Bean
     fun api(): Docket {
        return Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metadata())
    }

    @Bean
    fun defaultApi(): Docket {
		return Docket(DocumentationType.SWAGGER_2).groupName("JPA Auto Export APIs")
				.select()
                .apis(allowRequestHandlers(mainApiMethods))
				.apis(RequestHandlerSelectors.basePackage("com.example.demo.repository"))
                .paths(PathSelectors.ant("/**"))
                .build()
                .apiInfo(metadata())
	}

    @Bean
    fun customApi(): Docket {
        return Docket(DocumentationType.SWAGGER_2).run {
            groupName("Custom APIs")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.rest"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metadata())
        }
    }

    private fun metadata(): ApiInfo {
		return ApiInfoBuilder().title("Development APIs Service")
				.description("REST API for Demo resource").version("0.0.1-SNAPSHOT")
				.contact(Contact("LBN Invidual", "http://www.lbn.com.vn", "nhutlbuit@gmail.com"))
				.build()
	}

    protected fun allowRequestHandlers(httpMethods: Array<RequestMethod>): Predicate<RequestHandler> {
        return Predicate { input ->
            val methods = input!!.supportedMethods()
            asList(*httpMethods).containsAll(methods)
        }
    }

}