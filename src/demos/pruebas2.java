package demos;

public class pruebas2 {
      public static void main(String[] args) {
        // Declarar e inicializar la matriz
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Recorrer la matriz con bucles anidados
        for (int i = 0; i < matriz.length; i++) { // Recorre las filas
            for (int j = 0; j < matriz[i].length; j++) { // Recorre las columnas
                // Imprimir el elemento en la posición [i][j]
                System.out.println("Elemento en matriz[" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }
        
    }
}
