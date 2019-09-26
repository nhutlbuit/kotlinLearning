//package com.example.demo.configuration
//
//import java.util.Arrays
//
//import com.google.common.base.Predicate
//import com.google.common.base.Predicates
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//import org.springframework.context.annotation.Import
//import org.springframework.web.bind.annotation.RequestMethod
//import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
//import springfox.documentation.RequestHandler
//import springfox.documentation.builders.*
//import springfox.documentation.service.*
//import springfox.documentation.spi.DocumentationType
//import springfox.documentation.spi.service.contexts.SecurityContext
//import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration
//import springfox.documentation.spring.web.plugins.Docket
//import springfox.documentation.swagger.web.SecurityConfiguration
//import springfox.documentation.swagger.web.SecurityConfigurationBuilder
//import springfox.documentation.swagger2.annotations.EnableSwagger2
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
//
//@Configuration
//@EnableSwagger2
//@Import(SpringDataRestConfiguration::class)
//class SwaggerConfig: WebMvcConfigurer {
//
//	protected var mainApiMethods = arrayOf(RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH, RequestMethod.DELETE)
//
//	override fun configureDefaultServletHandling(configurer: DefaultServletHandlerConfigurer) {
//		configurer!!.enable()
//	}
//
//    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
//
//        registry
//                .addResourceHandler("swagger-ui.html")
//                .addResourceLocations("classpath:/META-INF/resources/")
//
//        registry
//                .addResourceHandler("/webjars/**")
//                .addResourceLocations("classpath:/META-INF/resources/webjars/")
//
//    }
//
//	@Bean
//    fun kpiApi(): Docket {
//		return Docket(DocumentationType.SWAGGER_2).groupName("teamKpi")
//				//.protocols(Collections.singleton("https"))
//				//.host("abc.cc")
//				.select()
//				.apis(allowGetRequestHandlers())
//				.paths(PathSelectors.ant("/demo/**")).build()
//				.apiInfo(metadata())
//	}
//
//	@Bean
//	fun api(): Docket {
//		return Docket(DocumentationType.SWAGGER_2)
//				.groupName("full-hub-api").select()
//				.apis(RequestHandlerSelectors.any())
//				// .apis(RequestHandlerSelectors.basePackage("com.dxc.integral.springhub.rest.web")
//				.paths(PathSelectors.any()).build()
//		// .pathMapping("/api-docs");
//	}
//
//	@Bean
//	fun defaultApi(): Docket {
//		return Docket(DocumentationType.SWAGGER_2).groupName("JPA Auto Export APIs")
//				.select()
//				.apis(allowRequestHandlers(*mainApiMethods))
//				.apis(RequestHandlerSelectors.basePackage("com.example.demo.repository"))
//				.paths(PathSelectors.ant("/**"))
//				.build().apiInfo(metadata())
//	}
//
//	@Bean
//	fun customApi(): Docket {
//		return Docket(DocumentationType.SWAGGER_2).groupName("Custom APIs")
//				.select()
//				.apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
//				.paths(PathSelectors.ant("/**"))
//				.build()
//				.securitySchemes(Arrays.asList(securityScheme()))
//				.securityContexts(Arrays.asList(securityContext()))
//				.apiInfo(metadata())
//	}
//
//	private fun scopes(): Array<AuthorizationScope> {
//		return arrayOf(AuthorizationScope("read", "for read operations"), AuthorizationScope("write", "for write operations"), AuthorizationScope("foo", "Access foo API"))
//	}
//
//	private fun securityScheme(): SecurityScheme {
//		val grantType = AuthorizationCodeGrantBuilder()
//				.tokenEndpoint(TokenEndpoint("AUTH_SERVER" + "/token", "oauthtoken"))
//				.tokenRequestEndpoint(
//						TokenRequestEndpoint("AUTH_SERVER" + "/authorize", "CLIENT_ID", "CLIENT_ID"))
//				.build()
//
//		return OAuthBuilder().name("spring_oauth")
//				.grantTypes(Arrays.asList<GrantType>(grantType))
//				.scopes(Arrays.asList(*scopes()))
//				.build()
//	}
//
//	private fun securityContext(): SecurityContext {
//		return SecurityContext.builder()
//				.securityReferences(Arrays.asList(SecurityReference("spring_oauth", scopes())))
//				.forPaths(PathSelectors.regex("/trainingClassTests.*"))
//				.build()
//	}
//
//	@Bean
//	fun security(): SecurityConfiguration {
//		return SecurityConfigurationBuilder.builder()
//				.clientId("CLIENT_ID")
//				.clientSecret("CLIENT_SECRET")
//				.scopeSeparator(" ")
//				.useBasicAuthenticationWithAccessCodeGrant(true)
//				.build()
//	}
//
//	@Bean
//	fun allGetApi(): Docket {
//		return Docket(DocumentationType.SWAGGER_2)
//				.select()
//				.apis(allowGetRequestHandlers())
//				.paths(PathSelectors.ant("/api/**")).build()
//				.apiInfo(metadata())
//	}
//
//	@Bean
//	fun agencyDevelopmentApi(): Docket {
//		return Docket(DocumentationType.SWAGGER_2).groupName("Development API")
//				.select()
//				.paths(Predicates.not(PathSelectors.ant("/error")))
//				.paths(Predicates.not(PathSelectors.ant("/api/school")))
//				.build().apiInfo(metadata())
//	}
//
//	private fun metadata(): ApiInfo {
//		return ApiInfoBuilder().title("Development APIs Service")
//				.description("REST API for Training resource").version("0.0.1-SNAPSHOT")
//				.contact(Contact("LBN Invidual", "http://www.lbn.com.vn", "nhutlbuit@gmail.com"))
//				.build()
//	}
//
//	protected fun allowGetRequestHandlers(): Predicate<RequestHandler> {
//		return Predicate { input ->
//			val methods = input!!.supportedMethods()
//			methods.contains(RequestMethod.GET)
//		}
//	}
//
//	protected fun allowRequestHandlers(vararg httpMethods: RequestMethod): Predicate<RequestHandler> {
//		return Predicate { input ->
//			val methods = input!!.supportedMethods()
//			Arrays.asList(*httpMethods).containsAll(methods)
//		}
//	}
//}