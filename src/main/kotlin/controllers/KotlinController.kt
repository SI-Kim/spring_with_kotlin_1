package controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class KotlinController {
    @GetMapping("/")
    fun printTest(string: String): String {
        print("Printed Test - $string")
        return string
    }
}