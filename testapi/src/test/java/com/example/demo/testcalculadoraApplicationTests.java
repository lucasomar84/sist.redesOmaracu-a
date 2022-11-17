package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Value;


import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class testcalculadoraApplicationTests {

	testcalculadoraApplicationTests calculator = new ApivanesaApplication();

	@Test
	public void sumaTest() {
		assertEquals(calculator.sumar(1, 1), 2);
	}

	@Test
	public void sumaFail() {
		assertNotEquals(calculator.sumar(2, 2), 1);
	}


	@Test
	public void restarTest() {
		assertEquals(calculator.restar(2, 2), 1);
	}

	@Test
	public void restarFail() {
		assertNotEquals(calculator.restar(4, 1), 2);
	}

	@Test
	public void multiplicarTest() {
		assertEquals(calculator.multiplicar(2, 2), 4);
	}

	@Test
	public void multiplicarFail() {
		assertNotEquals(calculator.multiplicar(2, 4), 2);
	}

	@Test
	public void dividirTest() {
		assertEquals(calculator.dividir(3, 2), 2);
	}

	@Test
	public void dividirFail() {
		assertNotEquals(calculator.dividir(2, 2), 2);
	}

	@Test
	public void dividirException() {
		Assertions.assertThrows(ArithmeticException.class, () -> {
			calculator.dividir(1, 0);
		});

	}
}
