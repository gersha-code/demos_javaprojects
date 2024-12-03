package demos;

import java.io.IOException;
import java.util.Scanner;

public class gato_saul {

    public static void main(String[] args)throws IOException {
        Scanner leer = new Scanner(System.in);
        int dimension = 0, turno = 1, ren = 0, col = 0;
        char j1 = ' ', j2 = ' ', jactual = ' ';
        String coordenadas = " ";
        System.out.print("Las dimensiones pueden ser de 3, 5 o 7.\n");
        while(dimension != 3 && dimension != 5 && dimension != 7){
            System.out.print("Dimensiones? ");
            dimension = leer.nextInt();
        }
        String[][]gatito = new String[dimension][dimension];
        System.out.print("Caracter del jugador 1: ");
        j1 = (char)System.in.read();
        System.in.read();
        j2 = j1;
        System.out.print("El caracter del J2 debe ser distinto al del J1.\n");
        while(j1 == j2){
            System.out.print("Caracter del jugador 2: ");
            j1 = (char)System.in.read();
            System.in.read();
        }
        boolean victoria = false;
        mostrar(gatito);
        while(victoria == false){
            if (turno % 2 != 0){
                jactual = j1;
            }else{
                jactual = j2;
            }
            System.out.print("Turno de "+jactual+"\n");
            coordenadas = leer.next();
            llenado(gatito, jactual, coordenadas);
            mostrar(gatito);
            victoria = win(gatito, jactual, coordenadas);
            turno++;
        }
    }

    public static void mostrar(String[][]matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == null){
                    System.out.print("[ " + " ]\t");
                }else{
                    System.out.print("[ " + matrix[i][j] + " ]\t");
                }
            }System.out.println();
        }
    }

    public static void llenado(String[][]matrix, char jactual, String coordenadas){
        int ren = Integer.parseInt(coordenadas.substring(0, coordenadas.indexOf(',')));
        int col = Integer.parseInt(coordenadas.substring(coordenadas.indexOf(',') + 1));
        if (ren < matrix.length && col < matrix[0].length && matrix[ren][col] == null){
            matrix[ren][col] = String.valueOf(jactual); 
        }else{
            System.out.print("Espacio ya ocupado o coordenadas fuera de rango...\n");
        }
    }

    public static boolean win(String[][] matrix, char jactual, String coordenadas){
        int ren = Integer.parseInt(coordenadas.substring(0, coordenadas.indexOf(',')));
        int col = Integer.parseInt(coordenadas.substring(coordenadas.indexOf(',') + 1));
        int renverif = 0, colverif = 0, diag1= 0, diag2 = 0;
        if (ren < matrix.length && col < matrix[0].length){//columna renglon
            for (int i = 0; i < matrix.length; i++) {
                if(String.valueOf(jactual).equals(matrix[ren][i])){
                    renverif++;
                }
            }
            if(renverif == matrix.length){//
                return true;
            }
            for (int j = 0; j < matrix[0].length; j++) {//coluna
                if(String.valueOf(jactual).equals(matrix[j][col])){
                    colverif++;
                }
            }
            if(colverif == matrix[0].length){
                return true;
            }
            for (int k = 0; k < matrix.length; k++) {//diagonal
                if(String.valueOf(jactual).equals(matrix[k][k])){
                    diag1++;
                }   
            }
            if(diag1 == matrix.length){
                return true;
            }
            int auxilioo = matrix.length-1;
            for (int l = 0; l < matrix.length; l++) {//diagonal derecha-izquierda
                if(String.valueOf(jactual).equals(matrix[l][auxilioo])){
                    diag2++;
                }auxilioo--;  
            }
            if(diag2 == matrix.length){
                return true;
            }
        }
        return false;
    }

}
