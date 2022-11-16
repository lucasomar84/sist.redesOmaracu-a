package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class CalculadoraLucasomarApplicationTests {

	@Test
	void contextLoads() {
	}

	public MetodosCalculadora Calculadora;

	@BeforeEach
	public void a ()
	{
		Calcu = new MetodosCalculadora();
	}

	@Test
	public void Multiplicacion(){
		Assertions.assertEquals(Calculadora.Multiplicar(3,2),6);
		Assertions.assertNotEquals(Calculadora.Multiplicar(21,76),0);
		Assertions.assertNotEquals(Calculadora.Multiplicar((-6),76),90);
		Assertions.assertEquals(Calculadora.Multiplicar((-9),(-9)),81);
	}

	@Test
	public void Suma(){
		Assertions.assertEquals(Calculadora.SUMA(2,8),10);
		Assertions.assertNotEquals(Calculadora.SUMA(21,2),122);
		Assertions.assertEquals(Calculadora.SUMA((-9),(-9)),(-18));
	}

	@Test
	public void Resta(){
		Assertions.assertEquals(Calculadora.RESTAR(90,55),35);
		Assertions.assertNotEquals(Calculadora.RESTAR(100,12),112);
		Assertions.assertEquals(Calculadora.RESTAR((-9),(-9)),0);
	}

	@Test
	public void Divicion(){
		Assertions.assertEquals(Calculadora.Dividir(90,45),2.0);
		Assertions.assertThrows(ArithmeticException.class,() -> {Calcu.Dividir(12000, 0);}); //Excepcion
		Assertions.assertNotEquals(Calculadora.RESTAR(3,4),0);
	}

	@Test
	public void Cuadratica(){
		double result1[] = {-1 , -1};
		double result2[] = { 1 , -5};

		Assertions.assertArrayEquals(Calculadora.FuncionCuadratica(1,2,1),result1,0);
		Assertions.assertArrayEquals(Calculadora.FuncionCuadratica(1,4,(-5)),result2,0);
		//Excepcion
		Assertions.assertThrows(ArithmeticException.class,() -> {Calculadora.FuncionCuadratica(0,998,234);});
		Assertions.assertThrows(ArithmeticException.class,() -> {Calculadora.FuncionCuadratica(0,1,1);});
	}



}
