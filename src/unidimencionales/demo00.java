package unidimencionales;

import java.util.Random;

/*
 * Hacer un programa que almacene de manera aleatoria valores 0 y 1 en un arreglo de enteros de 8 celdas.
 * A continuacion considere los valores de las celdas para hacer una interpretacion hacia el sistema decimal
 * (Utilizando potencias de 2) e imprima su equivalencia.
 */
public class demo00 {
    public static void main(String[] args) {
        Random random = new Random();
        int binary[] = new int[8];
        System.out.println("the binary value is: |");
        for (int i = 0; i < binary.length; i++) {
            binary[i] = random.nextInt(2);
            System.out.print(binary[i] + " |");
        }
        int decimal = 0;
        for (int i = 0; i < binary.length; i++) {
            if (binary[i] != 0) {
                decimal += (Math.pow(2, binary.length-1-i));
            }
        }
        System.out.println("the decimal value is: " + decimal);
    }

}
