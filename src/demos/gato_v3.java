package demos;

import java.util.Scanner;

public class gato_v3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coordenada_1;
        int coordenada_2;
       
        char jugador_1;
        char jugador_2;
        System.out.println("Seleccione tablero [3] [5] [7]");
        ;
        int dimencionesTablero = scanner.nextInt();
        imprimirTablero(inicializarTablero(dimencionesTablero));
        System.out.println("Ingrese caracter Jugador 1: ");
        jugador_1 = scanner.next().charAt(0);
        System.out.println("Ingrese caracter Jugador 2: ");
        jugador_2 = scanner.next().charAt(0);
        String coordenada = scanner.next();
    }

    public static int conversionCoordenada(String coordenada){
        int coordenada_1 = Integer.parseInt(coordenada.substring(0, coordenada.indexOf(","))); // coordenada 1
        int coordenada_2 = Integer.parseInt(coordenada.substring(coordenada.indexOf(",") + 1)); // coordenada 2
    }

    public static char[][] inicializarTablero(int dimenciones) {
        char tablero[][] = new char[dimenciones][dimenciones];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = ' ';
            }
        }
        return tablero;
    }

    public static void imprimirTablero(char tablero[][]) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == ' ') {
                    System.out.print("[ " + " ]\t");
                } else {
                    System.out.print("[ " + tablero[i][j] + " ]\t");
                }
            }
            System.out.println("");
        }
    }

    public static boolean ganador(char tablero[][], char jugador) {
        boolean ganador;
        for (int i = 0; i < tablero.length; i++) {// Verificar filas
            ganador = true;
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] != jugador) {
                    ganador = false;
                    break;
                }
            }
            if (ganador) {
                System.out.println("Ganador fila: " + i);
                return true;
            }
        }
        for (int j = 0; j < tablero[0].length; j++) {// Verificar columnas
            ganador = true;
            for (int i = 0; i < tablero.length; i++) {
                if (tablero[i][j] != jugador) {
                    ganador = false;
                    break;
                }
            }
            if (ganador) {
                System.out.println("Ganador columna: " + j);
                return true;
            }
        }
        ganador = true;// Verificar diagonal izquierda-derecha
        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i][i] != jugador) {
                ganador = false;
                break;
            }
        }
        if (ganador) {
            System.out.println("Ganador diagonal izquierda-derecha");
            return true;
        }
        ganador = true;
        for (int i = 0; i < tablero.length; i++) {// Verificar diagonal derecha-izquierda
            if (tablero[i][tablero.length - 1 - i] != jugador) {
                ganador = false;
                break;
            }
        }
        if (ganador) {
            System.out.println("Ganador diagonal derecha-izquierda");
            return true;
        }
        return false;
    }
}
