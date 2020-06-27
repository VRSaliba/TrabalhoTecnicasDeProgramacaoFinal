package com.Group9.Bookflix.Interface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.Group9"})
@EnableJpaRepositories(basePackages = {"com.group9"})
@EntityScan(basePackages = {"com.group9"})
public class BookflixApplication {
	public static void main(String[] args) {
		SpringApplication.run(BookflixApplication.class, args);
	}

}
