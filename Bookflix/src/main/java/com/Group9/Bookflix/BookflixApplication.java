package com.Group9.Bookflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.Group9"})

public class BookflixApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookflixApplication.class, args);
	}

}
