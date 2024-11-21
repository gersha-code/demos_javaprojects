package demos;

public class Conway {

    public static void main(String[] args) {
        int filas = 10; // Número de filas deseadas
        String[][] matrix = new String[filas][100]; // Ajuste del tamaño según filas
        serie(matrix, filas); // Generar la serie
        imprimirMatriz(matrix); // Imprimir la matriz
    }

    public static void serie(String[][] matrix, int filas) {
        String actual = "1"; // Primer término de la serie

        for (int i = 0; i < filas; i++) {
            // Almacena el término actual de la matriz
            llenarFila(matrix, i, actual);
            actual = generarSiguienteTermino(actual); // Genera el siguiente término
        }
    }

    /*
     * Llena la fila de la matriz con los caracteres del término actual
     */
    public static void llenarFila(String[][] matrix, int fila, String termino) {
        for (int j = 0; j < termino.length() && j < matrix[fila].length; j++) {
            matrix[fila][j] = String.valueOf(termino.charAt(j));
        }
    }

    /*
     * Genera el siguiente término de la serie de Conway
     */
    public static String generarSiguienteTermino(String actual) {
        StringBuilder siguiente = new StringBuilder(); // Uso de StringBuilder para optimizar
        int contador = 1;

        for (int j = 1; j < actual.length(); j++) {
            if (actual.charAt(j) == actual.charAt(j - 1)) {
                contador++;
            } else {
                siguiente.append(contador).append(actual.charAt(j - 1));
                contador = 1; // Reiniciar el contador
            }
        }
        // Agrega el último grupo
        siguiente.append(contador).append(actual.charAt(actual.length() - 1));
        return siguiente.toString();
    }

    /*
     * Imprime la matriz
     */
    public static void imprimirMatriz(String[][] matrix) {
        for (String[] fila : matrix) {
            for (String elemento : fila) {
                if (elemento != null) {
                    System.out.print(elemento);
                }
            }
            System.out.println(); // Nueva línea después de cada fila
        }
    }
}
