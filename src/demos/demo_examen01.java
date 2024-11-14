package demos;

import java.util.Random;

/*
 * +Generar una matriz cuadrada NxN con elementos entre o y 12,
 * generados eleatoriamente. N generado aleatoriamente entre
 * 3 y 9. 
 * +Suma los elementos de la diagonal y deja esos elementos
 * en una variable de tipo cadena para mostrarla.
 * +Que sume los elementos que estan arriba de la diagonal y 
 * que son multiplos de 3.
 * +Mostrar la matriz y las sumas solicitadas
 */
public class demo_examen01 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(3, 9);
        int matrix[][] = new int[n][n];
        String numbers = "";
        int suma_1 = 0;
        int suma_2 = 0;
        System.out.println("n: " + n);
        // Matriz
        System.out.println("Matriz");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(0, 12);
                if (i == j) {
                    System.out.print("[" + matrix[i][j] + "]\t");
                } else {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println("");
        }
        // elementos de la diagonal y elementos arriba de la diagonal que son multiplos
        // de 3
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    numbers += String.valueOf(matrix[i][j]) + " ";
                    suma_1 += matrix[i][j];
                }
                if (j > i && matrix[i][j] % 3 == 0) {
                    // System.out.print(matrix[i][j] + " ");
                    suma_2 += matrix[i][j];
                }
            }
        }
        System.out.println("Suma de la diagonal: " + suma_1);
        System.out.println("La suma de multiplos de 3 arriba de la diagonal: " + suma_2);
        System.out.print("Los elementos de la diagonal son: ");
        for (int i = 0; i < numbers.length() - 1; i++) {
            if (numbers.indexOf(" ") != -1) {
                System.out.print(numbers.substring(i, i + 1));
            }
        }
    }
}
