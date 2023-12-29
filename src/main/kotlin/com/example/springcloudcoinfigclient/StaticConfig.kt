package com.example.springcloudcoinfigclient

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
//@Configuration
class StaticConfig(
    @Value("\${my.greeting}")
    val greeting: String? = null,

    @Value("\${password}")
    val password: String? = null
)