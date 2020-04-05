package com.youngmin.me;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = SimpleMyRepository.class)
public class Jpademo3Application {

	public static void main(String[] args) {
		SpringApplication.run(Jpademo3Application.class, args);
	}

}
