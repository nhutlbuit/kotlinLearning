package com.example.demo.rest

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping

@RestController
@RequestMapping("/test")
class TestController {

    @GetMapping("/test")
    fun test(): ResponseEntity<*> {
        return ResponseEntity.ok("ok")
    }


}
