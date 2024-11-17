package demos;

import java.util.Random;
import java.util.Scanner;

public class pruebas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] words = new String[15];

        // Variables auxiliares que guardan los datos de los metodos, que facilidan la
        // legibilidad y entendimiento del codigo, pero podrian ser usados sin ser
        // resguardados en una variable
        int random_main = random.nextInt(15);
        String word_main = word(words, random_main); // Obtiene la palabra seleccionada
        char[] oculto_main = hide_word(word_main); // Inicializa la palabra oculta
        //System.out.println("palabra: " + word_main);
        char letter = ' ';
        int count = 1;
        do {
            //este for recorre el vector y agrega espacios entre los guiones
            for (int i = 0; i < oculto_main.length; i++) {
                System.out.print(oculto_main[i] + " "); // Imprime cada caracter seguido de un espacio
            }
            
            System.out.print("\nPalabra a adivinar: ");
            letter = scanner.next().toLowerCase().charAt(0);
            ahorcado(word_main, oculto_main, letter);
            // System.out.println(check(oculto_main)); //Este sout es para revisar el estado
            // de la palabra
            System.out.println("Oportunidad " + count + ", que letra aparece en la palabra? ");
            if (o(word_main, letter) == 1) {
                count += o(word_main, letter);
            }
            
        } while (check(oculto_main) != true && count != 8);

        if (count <= 8 && check(oculto_main)) {
            System.out.println("Felicidades, lograste adivinar la palabra!");
        } else {
            System.out.println("Tienes una ultima oportunidad de adivinar la palabra, ingresa la palabra completa: ");
            String last_word = scanner.next().toLowerCase();
            last_chance(word_main, last_word);
        }
    }
    //este metodo corrobora si existe coincidencia, sino entonces regresa 1 para restar al contador de oportunidades
    public static int o(String word, char letter){
        String x = String.valueOf(letter);
        if (word.contains(x)) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void last_chance(String main_word, String last_word) {
        if (main_word.equals(last_word)) {
            System.out.println("Felicidades!, lograste adivinar la palabra");
        } else {
            System.out.println("Lo siento has perdido, agotaste tus oportunidades");
        }
    }

    public static boolean check(char[] oculto) { // metodo para revisar si el metodo ya no contiene '_'
        for (int i = 0; i < oculto.length; i++) {
            if (oculto[i] == '_') {
                return false;
            }
        }
        // cuando regrese true es porque es verdad que ya esta completado y no existen
        // mas caracters guion bajo
        return true;
    }

    public static char[] ahorcado(String word, char[] oculto, char letter) {
        int a = 8;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter && oculto[i] == '_') {
                oculto[i] = letter;
            } 
        }
        return oculto;
    }

    // Este metodo inicializa el vector de palabras.Fue ingresado de esta manera
    // para mejor legibilidad en caso de moficicaciones de palabras.
    public static String word(String[] word, int random) {
        word[0] = "casa";
        word[1] = "silla";
        word[2] = "maestra";
        word[3] = "cocina";
        word[4] = "arbol";
        word[5] = "computadora";
        word[6] = "sistema";
        word[7] = "perro";
        word[8] = "leon";
        word[9] = "mochila";
        word[10] = "telefono";
        word[11] = "lentes";
        word[12] = "reloj";
        word[13] = "pizarron";
        word[14] = "espejo";
        return word[random];
    }

    // Este metodo oculta las palabras lol
    public static char[] hide_word(String word) {
        char[] oculto = new char[word.length()];
        for (int i = 0; i < oculto.length; i++) {
            oculto[i] = '_';
        }
        return oculto;
    }
}
