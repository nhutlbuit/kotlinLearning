package com.example.demo.service.impl

import org.springframework.stereotype.Service

@Service
class ADaoImpl: ADao {

    override fun getData(): String {
       return "result"
    }

    override fun getData1(): String {
        return "result1"
    }

}

