package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculadoraLucasomarApplication {

	private static Logger logger = LoggerFactory.getLogger(CalculadoraLucasomarApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraLucasomarApplication.class, args);

		logger.warn("Hola mundo");


	}

}
