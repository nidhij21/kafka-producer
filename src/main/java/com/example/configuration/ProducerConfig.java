package com.example.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Author : Kanika Kapoor
 * Contains configurations.
 */

@SpringBootApplication
@ComponentScan("com.example")
public class ProducerConfig extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		
		return application.sources(ProducerConfig.class);

	}


	public static void main(String[] args) {
		SpringApplication.run(ProducerConfig.class, args);
		
	}
}

