package com.youngmin.me;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
<<<<<<< HEAD
@EnableJpaRepositories(repositoryBaseClass = SimpleMyRepository.class)
=======
@EnableJpaRepositories(repositoryImplementationPostfix = "Default", repositoryBaseClass = SimpleMyRepository.class)
>>>>>>> 873a367003ad3bdad240b9c6b5ce8513eeced3d7
public class Jpademo3Application {

	public static void main(String[] args) {
		SpringApplication.run(Jpademo3Application.class, args);
	}

}
