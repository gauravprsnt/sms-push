package com.Prashant.smspush;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SmsPushApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmsPushApplication.class, args);
	}
}
