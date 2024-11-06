package demos;

import java.util.Random;

public class demo004 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(2, 6);
        int y = random.nextInt(2, 6);
        int matrix[][] = new int[x][y];

        String cadena = "";
        // genera numeros
        for (int i = 0; i < (x * y * 2); i++) {
            cadena += String.valueOf(random.nextInt(0, 9));
        }
        System.out.println(
                "Cadena generada: " + cadena + " de dimencion " + (cadena.length()) + "\nMatriz de: " + x + "x" + y);
      
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[j][i] = Integer.parseInt(cadena.substring(j * 2, j * 2 + 2));
            }
        }

        // impresion de matriz
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
