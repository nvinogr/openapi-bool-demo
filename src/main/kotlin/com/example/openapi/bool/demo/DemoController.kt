package com.example.openapi.bool.demo

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Configuration
@OpenAPIDefinition(info = Info(title = "Demo Application", version = "0.0.1"))
open class OpenApiConfiguration

@RestController
@RequestMapping("/api")
class DemoController {
    @GetMapping("/schema")
    fun getSchemaResponse(): Response = Response()
}

@Schema(description = "Demo response object")
data class Response(
    @field:Schema(description = "Schema description (foo)", example = "true")
    val isFoo: Boolean = false,
    @field:Schema(description = "Schema description (bar)", example = "true")
    val bar: Boolean = false
)