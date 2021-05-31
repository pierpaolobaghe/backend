package it.jitterclick

import io.micronaut.runtime.Micronaut.*
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.info.*

@OpenAPIDefinition(
    info = Info(
            title = "backend",
            version = "0.0"
    )
)
object Api {
}
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("it.jitterclick")
		.start()
}

