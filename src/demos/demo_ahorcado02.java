package demos;

import java.util.Random;
import java.util.Scanner;

public class demo_ahorcado02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] words = new String[15];

        
        // System.out.println(word(words, random.nextInt(15)));
        int aux = random.nextInt(15);
        char[] hide = new char[word(words, aux).length()*2];
        String palabra = word(words, aux);
        
        System.out.println(hide_word(word(words, aux), hide));
        //System.out.println(hide_word(word(words, aux)));
        char selec;
        do {
            selec = scanner.next().charAt(0);
            //ahorcado(hide_word(word(words, aux), hide), selec);
        } while (selec != 'x');

    }

    public static char[] ahorcado(String word, char[] word, char letter){

        for (int i = 0; i < word.length; i++) {
            if () {
                word[i] = letter;
            }
        }

        return word;
    }

    public static String word(String[] word, int random) {
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

    public static char[] hide_word(String word, char[] hide) {
    
        for (int i = 0; i < word.length()*2; i++) {
            if(i%2 == 0){
                hide[i] = '_'; 
            } else {
                hide[i] = ' ';
            }
            
        }
        return hide;
    }


}
