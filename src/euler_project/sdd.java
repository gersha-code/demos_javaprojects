package euler_project;

import java.util.Scanner;

public class sdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("numero:");
        int n = scanner.nextInt();
        System.out.println("dimencion: ");
        int x = scanner.nextInt();

        matrix(n, x);

    }

    public static int sum(String numero_string, int numero_entero){
        //Integer.parseInt(numero_string);
        int conversion = 0;
        for (int i = 0; i < numero_string.length(); i++) {
                //System.out.println("hay coincidencia" + numero_string.charAt(i));
                conversion *= 10;
                conversion += numero_string.charAt(i)-'0';
        }
        //System.out.println("conversion: " + conversion);
        int suma =  conversion + numero_entero;
        return  suma;
    }


    public static void matrix(int n, int tam){
        int matrix[][] = new int[tam][tam];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = n;
            }
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }


        
        int mult = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                mult *= matrix[i][j];
                
            }
            System.out.print(mult + "\n");
            mult = 1;
        }
    }
}
