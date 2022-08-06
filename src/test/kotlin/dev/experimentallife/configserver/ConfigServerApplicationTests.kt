package dev.experimentallife.configserver

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(properties=["spring.cloud.config.server.git.url=https://github.com/experimentallife/config-development-k8s"])
class ConfigServerApplicationTests {

	@Test
	fun contextLoads() {
	}

}
