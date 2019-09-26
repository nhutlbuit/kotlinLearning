//package com.example.demo.rest
//import kotlinx.coroutines.*
//import channel.*
//import channel.boring.*
//
//fun main() = runBlocking {
//    repeat(100_000) { // launch a lot of coroutines
//        launch {
//            delay(1000L)
//            print(".")
//        }
//    }
//}