package introduccion_POO;

public class demo01 {
    /*
     * hacer un metodo que se llame factorial que devuleva el factorial de un valor
     * entero. Validar que el parametro reciba un valor positivo
     * de lo contrario devolder -1
     */
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int a) {
        int d = 0;
        if (a > 0) {
            for (int i = 0; i < a; i++) {
                d += (a - i) * i ;  
            }
        }
        return d;
    }
}
