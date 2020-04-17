package pl.piomin.services

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringKotlinRest

fun main(args: Array<String>) {
    runApplication<SpringKotlinRest>(*args)
}