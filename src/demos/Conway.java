package demos;

public class Conway {

    public static void main(String[] args) {
        String[][] matrix = new String[100][100];
        serie(matrix, 10);
        imprimirMatriz(matrix);
    }

    public static void serie(String[][] matrix, int filas) {
        String actual = "1"; // Primer término de la serie
        matrix[0][0] = "1";

        for (int i = 0; i < filas; i++) {
            // almacena el termino actual de la matriz
            llenarFila(matrix, i, actual);
            actual = generarSiguienteTermino(actual);
        }
    }

    /*
     * llena la fila de la matriz con los caracteres del termino actual
     */
    public static void llenarFila(String[][] matrix, int fila, String termino) {
        for (int j = 0; j < termino.length() && j < 10; j++) {
            matrix[fila][j] = String.valueOf(termino.charAt(j));
        }
    }

    public static String generarSiguienteTermino(String actual) {
        String siguiente = "";
        int contador = 1;

        for (int j = 1; j < actual.length(); j++) {
            if (actual.charAt(j) == actual.charAt(j - 1)) {
                contador++;
            } else {
                siguiente += contador + "" + actual.charAt(j - 1);
                contador = 1; // Reiniciar el contador
            }
        }
        // concatena el siguiente termino a la cadena
        siguiente += contador + "" + actual.charAt(actual.length() - 1);
        return siguiente;
    }

    public static void imprimirMatriz(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != null) {
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.println();
        }
    }
}
