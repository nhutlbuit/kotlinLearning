package com.example.demo.rest

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/test")
class TestController {

    @GetMapping("/test")
    fun test(): ResponseEntity<*> {
        val result = mutableMapOf<String, String>()
        result["result"] = "ok"
        return ResponseEntity.ok(result)

    }


}
