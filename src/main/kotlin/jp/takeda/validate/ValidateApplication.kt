package jp.takeda.validate

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ValidateApplication

fun main(args: Array<String>) {
    SpringApplication.run(ValidateApplication::class.java, *args)
}
