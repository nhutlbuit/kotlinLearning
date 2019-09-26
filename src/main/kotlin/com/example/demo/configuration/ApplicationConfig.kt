package com.example.demo.configuration


import java.io.IOException
import java.math.BigDecimal
import java.util.Locale
import java.util.TimeZone

import javax.servlet.Filter

import org.springframework.cache.annotation.EnableCaching
import org.springframework.context.MessageSource
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.support.ReloadableResourceBundleMessageSource
import org.springframework.web.filter.CharacterEncodingFilter
import org.springframework.web.servlet.LocaleResolver
import org.springframework.web.servlet.i18n.SessionLocaleResolver

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.module.SimpleModule

@Configuration
@EnableCaching
class ApplicationConfig {
//    @Bean
//    fun characterEncodingFilter(): Filter {
//        val characterEncodingFilter = CharacterEncodingFilter()
//        characterEncodingFilter.encoding = "UTF-8"
//        characterEncodingFilter.setForceEncoding(true)
//        return characterEncodingFilter
//    }

    @Bean
    fun localeResolver(): LocaleResolver {
        val slr = SessionLocaleResolver()
        slr.setDefaultLocale(Locale.US) // Set default Locale as US
        return slr
    }

    @Bean
    fun jsonObjectMapper(): ObjectMapper {
        val mapper = ObjectMapper()
        mapper.setTimeZone(TimeZone.getDefault())
        val module = SimpleModule("DoubleSerializer")
        module.addSerializer(Double::class.java, DoubleSerializer())
        mapper.registerModule(module)
        return mapper
    }

}

internal class DoubleSerializer : JsonSerializer<Double>() {
    @Throws(IOException::class, JsonProcessingException::class)
    override fun serialize(value: Double?, jgen: JsonGenerator, provider: SerializerProvider) {
        val realString = BigDecimal(value!!).toPlainString()
        jgen.writeString(realString)
    }

    @Bean
    fun messageSource(): MessageSource {
        val messageSource = ReloadableResourceBundleMessageSource()
        messageSource.setBasename("classpath:messages")
        messageSource.setCacheSeconds(10) //reload messages every 10 seconds
        return messageSource
    }
}