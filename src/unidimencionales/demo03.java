package unidimencionales;

import java.util.Random;

/*
 * Generar un arreglo de eneteros de 20 celdas. Llenar las celdas con valores aleatorios del 1 al 20, cuidando de que no 
 * queden valores repetidos en el arreglo.
 */
public class demo03 {
    public static void main(String[] args) {
        Random random = new Random();
        int vector[] = new int[20];
        int number = 0;
        boolean repet;
        for (int i = 0; i < vector.length; i++) {
           
            do {
                number = random.nextInt(1, 20);
                repet = false;
                for (int index = 0; index < vector.length; index++) {
                    if (vector[index] == number) {
                        repet = true;
                        break;
                    }
                }
                
            } while (repet);
            vector[i] = number;
        }

        System.out.println("arreglo: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

    }
}
