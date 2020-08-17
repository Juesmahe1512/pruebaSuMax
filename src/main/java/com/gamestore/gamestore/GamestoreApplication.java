package com.gamestore.gamestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.gamestore.gamestore")
@EnableJpaRepositories("com.gamestore.gamestore.repositories")
@EntityScan(basePackages = "com.gamestore.gamestore.models")
public class GamestoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamestoreApplication.class, args);
	}

}
