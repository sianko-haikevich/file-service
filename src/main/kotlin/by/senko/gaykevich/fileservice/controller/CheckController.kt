package by.senko.gaykevich.fileservice.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author Anton Senko-Gaykevich
 * @since 2021-03-07
 */
@RestController
@RequestMapping("/file")
class CheckController {

    @GetMapping("/check")
    fun check(): String {
        return "File service works"
    }
}
