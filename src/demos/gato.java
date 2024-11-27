package demos;

import java.util.Scanner;

public class gato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese tablero 3, 5 o 7");
        int tablero = scanner.nextInt();
        String matriz[][] = new String[tablero][tablero];
        String simbolo = "";
        int count = 0;
        String coordenadas;
        System.out.print("Simbolo del jugador 1: ");
        char j1 = scanner.next().charAt(0);
        char j2 = j1;
        System.out.print("El simbolo del J2 debe ser diferente al del J1.\n");
        while(j2 == j1){
            System.out.print("Simbolo del jugador 2: ");
            j2 = scanner.next().charAt(0);
        }

        while (simbolo != "q") {
            System.out.println("Simbolo: ");
            simbolo = scanner.next();
            System.out.println("Coordenada: ");
            coordenadas = scanner.next();
            gato(matriz, coordenadas, simbolo);
            imprimirMatriz(matriz);
             
        
        }
    }

    public static String[][] gato(String matriz[][], String coordenadas, String simbolo) {
        /*
         * coordenada_1 y coordenada_2, guardan el valor numerico ingresados en las
         * cadenas en tipo entero
         */
        int coordenada_1 = Integer.parseInt(coordenadas.substring(0, coordenadas.indexOf(","))); // coordenada 1
        int coordenada_2 = Integer.parseInt(coordenadas.substring(coordenadas.indexOf(",") + 1)); // coordenada 2

        matriz[coordenada_1][coordenada_2] = simbolo;
        return matriz;
    }

    public static void imprimirMatriz(String matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
