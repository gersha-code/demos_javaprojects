package unidimencionales;
/*
 * Llenar un arreglo unidimencional de N celdas, con valores aleatorios entre 3 y 900, cuidando que los valores queden en orden ascendente.
 * El valor de la celda 1 debe ser mayor o igual que el de la celda 0, el valor de la celda 2 debe ser mayor o igual que el de la celda 1, etc.
 * Mostrar el arreglo. N es un valor ingresado por el usuario y debe validarse que sea mayor que 1 y menor que 50. Observe el ejemplo, suponiendo
 * que N vale 8. |3|7|9|12|25|25|60|500|
 *
 */

import java.util.Random;

public class demo06 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(10);
        int vector [] = new int[10];
        int aux;
        for (int i = 0; i < vector.length; i++) {
            aux = random.nextInt(0, 20);
            for (int j = 0; j < vector.length; j++) {
                if (aux >= vector[j]) {
                    vector[i] = aux;
                } else { 
                    aux = vector[j];
                }
            }
            System.out.print(vector[i] + "\t");
        }
    }
}
