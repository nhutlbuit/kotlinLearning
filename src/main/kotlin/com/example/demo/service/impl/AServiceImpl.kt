package com.example.demo.service.impl

import org.springframework.stereotype.Service

@Service
class AServiceImpl(val aDao: ADao): AService {

    override fun getData(): String {
       return "result"
    }

    override fun getData1(): String {
        return aDao.getData1()
    }

}

