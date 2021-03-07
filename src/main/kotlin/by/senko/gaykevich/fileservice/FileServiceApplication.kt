package by.senko.gaykevich.fileservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableEurekaClient
@SpringBootApplication
class FileServiceApplication

fun main() {
    runApplication<FileServiceApplication>()
}
