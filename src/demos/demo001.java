package demos;

import java.util.Random;

/*
 * Ejercicio de arreglo Unidimencionales
 *      Hacer un programa que almacene de manera aleatoria valores 0 y 1
 *      en un arreglo de enteros de 8 celdas. A continuacion considere los valores de las celdas 
 *      para hacer una interpretacion hacia el sistema decimal (Utilizando potencias de 2) e
 *      imprima de equivalencia.
 *      ejemplo: |1|1|0|0|0|0|0|1|
 *      11000001 en decimal equivale a 193.
 * 
 */
public class demo001 {

    public static void main(String[] args) {
        Random random = new Random();
        int binary[] = new int[8];
        String result = "";
        for (int i = 0; i < binary.length; i++) {
            binary[i] = random.nextInt(2);
            result += Integer.valueOf(binary[i]);
            System.out.print("\u001B[35m[" + binary[i] + "]\u001B[0m");
        }
        System.out.println("");
        int s = 0;
        for (int i = 0; i < binary.length; i++) {
            if (binary[i] == 1) {
                s += Math.pow(2, (binary.length-1-i));
            }

        }
        System.out.println("el resultado es " + s);

    }
}
