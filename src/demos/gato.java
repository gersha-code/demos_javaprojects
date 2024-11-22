package demos;

import java.util.Scanner;

public class gato {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimenciones = 4;
        String matrix[][] = new String[dimenciones][dimenciones];
        String fig; //figura
        String coordenada;
        do {
            System.out.println("Ingrese figura");
            fig = scanner.next();
            coordenada = scanner.next();
            gato(matrix, fig, coordenada);
            imprimir_gato(matrix);
        } while (true);
        
        
    }

    //Metodo inserta figura en la matriz
    public static String[][] gato(String[][] matrix, String fig, String coordenada){
        int coordenada_1 = coordenada.charAt(0);
        int coordenada_2 = coordenada.charAt(2);
        matrix[coordenada_1][coordenada_2] = fig;

        return matrix;
    }

    public static void imprimir_gato(String[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
            System.out.println();
        }

    }
}
