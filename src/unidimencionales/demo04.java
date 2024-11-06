package unidimencionales;
/*
 * Generar 6 valores aleatorios entre 0 y 9. Almacenalo en un arreglo de 6 celdas. A continuacion tomar los valores
 * que quedaron en cada celda para formar un solo valor, considerando cada celda como el valor posicional. 
 * Por ejemplo, considere que el arreglo quedara con los valores 
 *      8|3|1|7|2|1
 * 
 */

import java.util.Random;

public class demo04 {
    public static void main(String[] args) {
        Random random = new Random();
        int numbers [] = new int [6];
        String num = "";
        System.out.print(" | ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(0, 9);
            System.out.print(numbers[i] + " | ");
        }
        for (int i = 0; i < numbers.length; i++) {
            num += numbers[i];
        }
        System.out.println("Con los valores del arreglo se forma el numero: " + num);
        
    }

}
