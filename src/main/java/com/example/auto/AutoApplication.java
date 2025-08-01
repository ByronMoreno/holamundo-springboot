package com.example.auto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AutoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoApplication.class, args);
	}

	@GetMapping
	public String hello() {
		return "Hola Mundo desde Spring Boot en contenedor CI!, esta es una prueba de que si se puede hacer las cosas como de sebe";
	}
}
