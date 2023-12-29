package com.example.springcloudcoinfigclient

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.stereotype.Component

@Component
@RefreshScope
class DynamicConfig(
    @Value("\${my.greeting}")
    val greeting: String? = null,

    @Value("\${password}")
    val password: String? = null
)