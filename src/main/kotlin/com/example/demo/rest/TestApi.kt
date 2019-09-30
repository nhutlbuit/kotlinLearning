package com.example.demo.rest

import com.example.demo.service.impl.AService
import io.swagger.annotations.ApiOperation
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class TestController(private val aService: AService) {

    @ApiOperation(value = "test documentation")
    @GetMapping("/test")
    private fun test(): ResponseEntity<*> {
        val result = mutableMapOf<String, String>()
        result["result"] = "ok"
        return ResponseEntity.ok(result)

    }

    @GetMapping("/testInterface")
    fun getData(): ResponseEntity<*>  {
       val result: String = aService.getData();
        return ResponseEntity.ok(result)
    }

    @GetMapping("/testInterface1")
    fun getData1(): ResponseEntity<*>  {
        val result: String = aService.getData1();
        return ResponseEntity.ok(result)
    }


}
