package test;

import org.junit.Test;

import calculadora.calculadora;

import java.util.Arrays;

import static org.junit.Assert.*;

public class test {
    calculadora calculator = new calculadora();

    @Test
    public void sumaTestOk() {
        assertEquals(calculator.sumar(1, 1), 2);
    }

    @Test
    public void sumaTestFail() {
        assertNotEquals(calculator.sumar(1, 1), 5);
    }

    @Test
    public void restarTestok() {
        assertEquals(calculator.restar(320, 319), 1);
    }

    @Test
    public void restarTestfail() {
        assertNotEquals(calculator.restar(2, 1), 5);
    }



    @Test
    public void multiplicarTestok() {
        assertEquals(calculator.multiplicar(9, 2), 18);}

    @Test
    public void multiplicarTestfail() {
        assertNotEquals(calculator.multiplicar(4, 3), 11);
    }


    @Test
    public void dividirTestok() {
        assertEquals(calculator.dividir(10, 2), 5);
    }

    @Test
    public void dividirTestfail() {
        assertNotEquals(calculator.dividir(11, 3), 5);
    }

    @Test(expected = ArithmeticException.class)
    public void div2TestException() {
        calculator.dividir(1,0);
    }

    @Test
    public void raizCuadraticaTest(){
        double[] result = calculator.raizCuadratica(4.0, 4.0, -3.0);
        double [] Expectedresults  = {-0.5, 1.5};
        assertFalse(Arrays.equals(Expectedresults, result));
    }

}
