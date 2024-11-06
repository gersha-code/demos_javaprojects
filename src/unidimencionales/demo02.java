package unidimencionales;
/*
 * Genere un arreglo de N celdas. N es un valor aleatorio entre 5 y 20. Ingresar valores aleatorios (solo ceros y unos) en cada celda del arreglo.
 * Mostrar los valores de cada celda, a partir del primer uno (es decir, no mostrar los ceros a la izquiera). Por ejemplo, si en el arreglo quedaron
 * los valores 000110, entonces solo mostrar 110.
 */

import java.util.Random;

public class demo02 {
    public static void main(String[] args) {
        Random random = new Random();
        int vector[] = new int[(int) random.nextDouble(5, 20)];
        System.out.println("random vector: " + vector.length);
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(2);
            System.out.print(vector[i] + " ");
        }
        boolean band = true;
        System.out.println();
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 0 && band == true) {
            } else {
                System.out.print(vector[i] + " ");
                band = false;
            }
        }
    }
}
