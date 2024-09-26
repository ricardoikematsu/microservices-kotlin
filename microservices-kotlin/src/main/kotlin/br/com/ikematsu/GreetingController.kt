package br.com.ikematsu

import org.springframework.boot.context.properties.bind.DefaultValue
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {

    val counter: AtomicLong = AtomicLong()

    @RequestMapping("/greeting")
    fun greeting(@RequestParam(value="name", defaultValue = "world") name: String?): Greeting {
        return Greeting(counter.incrementAndGet(), content = "Hello, $name!")
    }
}