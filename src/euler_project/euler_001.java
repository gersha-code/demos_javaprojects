package euler_project;
/*
 * Si enumeramos todos los numeros naturales de 10 que son multiplos de 3 o 5, obtenemos 3, 5, 6,  9. La suma de estos multiplos es 23.
 * Encuentra la suma de todos los multiplos de 3 o 5 menores que 1000.
 */

public class euler_001 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i%3 == 0 || i%5==0) {
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }   
}

