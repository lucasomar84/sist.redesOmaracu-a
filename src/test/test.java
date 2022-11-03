package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import calculadora.calculadora;

public class test {
    calculadora calculator = new calculadora();

    @Test
    public void sumaTest() {
        assertEquals(calculator.sumar(1, 1), 2);
        assertNotEquals(calculator.sumar(1, 1), 5);

    }

    @Test
    public void restarTest() {
        assertEquals(calculator.restar(320, 319), 1);
        assertNotEquals(calculator.restar(2, 1), 5);
    }

    @Test
    public void multiplicarTest() {
        assertEquals(calculator.multiplicar(9, 2), 18);
        assertNotEquals(calculator.multiplicar(4, 3), 11);
    }

    @Test
    public void dividirTest() {
        assertEquals(calculator.dividir(10, 2), 5);
        assertNotEquals(calculator.dividir(11, 3), 5);
    }

    @Test
    public void raizCuadraticaTest(){
        assertEquals(calculator.raizCuadratica(1,2,-8),-4,2);
        assertNotEquals(calculator.raizCuadratica(2,4,-16),-2,1);
    }
}