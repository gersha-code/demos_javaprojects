package demos;

import java.util.Scanner;

public class curp {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String nombre = scanner.nextLine();
            int aux = 0;
            //String fecha = scanner.nextLine();
            String curp = "";
    
            for (int i = 0; i < nombre.length(); i++) {
                if (" ".indexOf(nombre.charAt(i)) != -1 && aux == 0) {
                    curp += nombre.substring(i+1, i+3);
                    aux++;
                }
                if (" ".indexOf(nombre.charAt(i)) != -1 && aux ==1) {
                    curp += nombre.charAt(i+1);
                }
            }
            
            System.out.println(curp);
        }

    }


