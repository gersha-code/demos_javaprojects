package demos;

import java.util.Scanner;

public class gato_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimencionesTablero = 3;
        char tablero[][] = new char[dimencionesTablero][dimencionesTablero];
        inicializarTablero(tablero);
        while (true) {
            imprimirTablero(tablero);
            System.out.println("Caracter:");
            char jugador = scanner.next().charAt(0);
            System.out.println("Coordenada:");
            String coordenadas = scanner.next();
            int coordenada_1 = Integer.parseInt(coordenadas.substring(0, coordenadas.indexOf(","))); // coordenada 1
            int coordenada_2 = Integer.parseInt(coordenadas.substring(coordenadas.indexOf(",") + 1)); // coordenada 2
        
            if (verificarCoordenadas(tablero, coordenada_1, coordenada_2)) {
                tablero[coordenada_1][coordenada_2] = jugador;
                System.out.println(ganador(tablero));
            } else {
                System.out.println("Coordenadas invalidas");
            }
        }
    }

    public static boolean ganador(char tablero[][]){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[0][i] != tablero[0][j] && tablero[i][0] != ' ') {//Columna 1
                    System.out.println("posicion: [" + i + ","+ j + "]");
                    return false;
                }

                if (tablero[1][i] != tablero[1][j] && tablero[i][1] != ' ') {
                    System.out.println("posicion: [" + i + ","+ j + "]");
                    return false;
                }

                /*
                   if (tablero[0][0] != tablero[0][i]) {//Fila
                    return false;
                } 
                 */
              
            }
        }
        return true;
    }

    public static char[][] inicializarTablero(char tablero[][]){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = ' ';
            }
        }
        return tablero;
    }
 
    public static void imprimirTablero(char tablero[][]){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == ' ') {
                    System.out.print("[ " + " ]\t");
                } else {
                    System.out.print("[ "+tablero[i][j] + " ]\t");
                }
            }
            System.out.println();
        }
    }

    public static boolean verificarCoordenadas(char tablero[][], int a, int b) {
        if (tablero[a][b] == ' ') {
            return true;
        } else {
            return false;
        }

    }

}
