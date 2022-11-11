package calculadora;

public class calculadora {
    public int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int restar(int numero1, int numero2) {
        return numero1 - numero2;

    }

    public int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;

    }

    public int dividir(int numero1, int numero2) {
        return numero1 / numero2;

    }

    public double[] raizCuadratica( double a, double  b, double c) {
        double x1 = (-b + Math.sqrt((b * b) - (4 * a * c))) / 2 * a;
        double x2 =  (-b - Math.sqrt((b * b) - (4 * a * c))) / 2 * a;
        double[] results = {x1, x2};
        return results;
    }

}

