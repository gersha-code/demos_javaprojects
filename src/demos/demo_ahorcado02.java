package demos;

import java.util.Random;
import java.util.Scanner;

public class demo_ahorcado02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] words = new String[15];
        //x variable auxiliar
        int x = random.nextInt(15);
        
        //sout de abajo es auxiliar
        System.out.println(words(words, x) + "  " + words(words, x).length());
        System.out.println(hide_word(words(words, x)));
    }

    /*
     * Este metodo resguarda las 15 palabras aleatorias que pueden ser seleccionadas
     * de manera aleatoria para jugar.
     */
    public static String words(String[] word, int random) {  
        word[0] = "casa";
        word[1] = "silla";
        word[2] = "maestra";
        word[3] = "cocina";
        word[4] = "arbol";
        word[5] = "computadora";
        word[6] = "sistema";
        word[7] = "perro";
        word[9] = "leon";
        word[10] = "mochila";
        word[11] = "telefono";
        word[12] = "lentes";
        word[13] = "reloj";
        word[14] = "pizarron";
        return word[random];
    }
    
    public static String hide_word(String word){
        String hide = "";
        for (int i = 0; i < word.length(); i++) {
            hide += "_" + " ";
        }
        return hide;
    }
}
