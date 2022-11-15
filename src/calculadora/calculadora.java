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

   public static double[] raizCuadratica(double a, double b, double c){

        double b2 = b*b;
        double dentroraiz = b2 - (4*a*c);
        double raiz = (double) Math.sqrt(dentroraiz);

        double cuenta = (double )raiz;
        double veri =cuenta;
            if (veri % 2 ==0)
            {
                double primero = ((-b + raiz)/2*a);
                double segundo = ((-b - raiz)/2*a);
                double  result[] = {primero, segundo};
                return  result;
            }
     return null;
    }
}
