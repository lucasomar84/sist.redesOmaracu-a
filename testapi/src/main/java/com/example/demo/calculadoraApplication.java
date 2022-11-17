package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class calculadoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApivanesaApplication.class, args);
	}


	@GetMapping("/suma")
	public int suma (@RequestParam(value="a") int numero1,@RequestParam(value = "b")int numero2) {
		return numero1 + numero2;
	}

	@GetMapping("/restar")
	public int restar(@RequestParam(value="a") int numero1,@RequestParam(value = "b")int numero2) {
		return numero1 - numero2;
	}

	@GetMapping("/multi")
	public int multiplicar(@RequestParam(value="a") int numero1,@RequestParam(value = "b")int numero2) {
		return numero1 * numero2;
	}

	@GetMapping("/dividir")
	public int dividir(@RequestParam(value="a") int numero1,@RequestParam(value = "b")int numero2) {
		return numero1 / numero2;
	}
}
