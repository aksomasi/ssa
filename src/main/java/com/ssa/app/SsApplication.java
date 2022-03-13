package com.ssa.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@EnableWebMvc
@OpenAPIDefinition(info = @Info(title = "Self Service App", version = "1.0", description = "Manuplaitinbg Datapucks Information"))
public class SsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsApplication.class, args);
	}

	@Bean
	public InternalResourceViewResolver defaultViewResolver() {
		return new InternalResourceViewResolver();
	}

}
