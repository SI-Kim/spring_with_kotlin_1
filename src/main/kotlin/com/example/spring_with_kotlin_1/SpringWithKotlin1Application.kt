package com.example.spring_with_kotlin_1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringWithKotlin1Application

fun main(args: Array<String>) {
    runApplication<SpringWithKotlin1Application>(*args)
    println("test")
}
