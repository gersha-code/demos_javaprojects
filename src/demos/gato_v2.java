package demos;

import java.util.Scanner;

public class gato_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimencionesTablero;
        int aux_count = 1;
        boolean valido = false;
        boolean valido_2 = false;
        int coordenada_1 = 0;
        int coordenada_2 = 0;
        System.out.println("G  A   T   O");
        while (!valido) {
            System.out.println(">Seleccione la dimenciones del tablero de juego:\n[3]\t[5]\t[7]");
            dimencionesTablero = scanner.nextInt();
            if (dimencionesTablero == 3 || dimencionesTablero == 5 || dimencionesTablero == 7) {
                valido = true;
                char tablero[][] = new char[dimencionesTablero][dimencionesTablero];
                inicializarTablero(tablero);
                while (true) {
                    imprimirTablero(tablero);
                    System.out.println("Turno de jugador " + aux_count);
                    char jugador = scanner.next().charAt(0);
                   
                        System.out.println("Coordenada:");
                        String coordenadas = scanner.next();
                        coordenada_1 = Integer.parseInt(coordenadas.substring(0, coordenadas.indexOf(","))); // coordenada
                        coordenada_2 = Integer.parseInt(coordenadas.substring(coordenadas.indexOf(",") + 1)); // coordenada
                        if (coordenada_1 < tablero.length && coordenada_2 < tablero.length) {
                            valido_2 = true;
                        } else {
                            System.out.println("Coordenada invdalida");
                        }
                    
                    // 2
                    if (verificarCoordenadas(tablero, coordenada_1, coordenada_2)) {
                        tablero[coordenada_1][coordenada_2] = jugador;
                        System.out.println(ganador(tablero, jugador));
                    } else {
                        System.out.println("Coordenadas invalidas");
                    }
                }
            } else {
                System.out.println("Dato invalido");
            }
        }

    }

    public static boolean ganador(char tablero[][], char jugador) {
        /*
         * La razon de una variable booleana es para poder pasar todas las posibilidades
         * de gandores falsas, asignar un valor y
         * romper ciclo.
         */
        boolean ganador;

        // Verificar FILAS
        for (int i = 0; i < tablero.length; i++) {
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

        // Verificar COLUMNAS
        for (int j = 0; j < tablero[0].length; j++) {
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

        // Verificar DIAGONAL izquierda-derecha
        ganador = true;
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

        // Verificar DIAGONAL derecha-izquierda
        ganador = true;
        for (int i = 0; i < tablero.length; i++) {
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

    public static char[][] inicializarTablero(char tablero[][]) {
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
