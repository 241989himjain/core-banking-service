package com.hmr.infotech.core.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfiguration {

	@Bean
	public OpenAPI defineOpenApi() {
		Info info = new Info().title("Core Banking Services").version("1.0")
				.description("This service will provide the core banking API's");
		return new OpenAPI().info(info);
	}
}