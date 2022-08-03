package dev.experimentallife.configserver

import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableConfigServer
@SpringBootApplication
class ConfigServerApplication

fun main(args: Array<String>) {
	runApplication<ConfigServerApplication>(*args)
}
