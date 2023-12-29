package com.example.springcloudcoinfigclient

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/test")
class TestController(
    private val staticConfig: StaticConfig,
    private val dynamicConfig: DynamicConfig
) {

//    @Value("\${my.greeting}")
//    private val greeting: String? = null
//
//    @Value("\${password}")
//    private val password: String? = null

    @GetMapping("")
    fun get(): String {
        return """
            static ::${staticConfig.greeting} :: ${staticConfig.password} 
            <br/> --- <br/>
            dynamic ::${dynamicConfig.greeting} :: ${dynamicConfig.password} 
        """.trimIndent()
    }
}