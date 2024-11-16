package demos;

import java.util.Random;
import java.util.Scanner;

public class ahorcado0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] palabras = new String[15];
        // este metodo regresa una palabra random del metodo palabras
        // palabras(palabras, random.nextInt(14));
        String palabraselec = palabras(palabras, random.nextInt(14));
        System.out.println(palabraselec);
        guiones(palabraselec);

        // System.out.println(guiones(palabraselec));

        String letra;
        do {
            letra = scanner.next();
            ahorcado(letra, palabraselec);
        } while (letra != "x");

    }

    public static String palabras(String[] palabras, int random) {
        // String[] palabras = new String[15];
        palabras[0] = "casa";
        palabras[1] = "silla";
        palabras[2] = "maestra";
        palabras[3] = "cocina";
        palabras[4] = "arbol";
        palabras[5] = "computadora";
        palabras[6] = "sistema";
        palabras[7] = "perro";
        palabras[9] = "leon";
        palabras[10] = "mochila";
        palabras[11] = "telefono";
        palabras[12] = "lentes";
        palabras[13] = "reloj";
        palabras[14] = "pizarron";
        return palabras[random];
    }

    public static String guiones(String palabra) {
        String guion = "";
        for (int i = 0; i < palabra.length(); i++) {
            guion += "_";
        }

        return guion;
    }

    public static String ahorcado(String letra, String palabra) {
        String guion = guiones(palabra);
        System.out.println(guion);
        String des = "";
        String s = ;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.contentEquals(letra)) {
                
                System.out.println("coincidencia en: " + i);
                des = guion.replace("o", letra );
            }
        }
        System.out.print("aa: " + des);
        return des;
    }

}
