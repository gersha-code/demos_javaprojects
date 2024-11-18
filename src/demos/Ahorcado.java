import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Random random = new Random();
        String[] palabras = new String[15];

        // Selección de una palabra aleatoria
        String palabraselec = palabras(palabras, random.nextInt(15)).toUpperCase();
        System.out.println("Palabra seleccionada (oculta): " + palabraselec);

        // Mostrar los guiones iniciales
        String palenguion = guiones(palabraselec);
        System.out.println(palenguion);

        boolean bandera = false;

        // Ciclo principal de intentos
        for (int i = 1; i <= 7; i++) {
            // Juego principal
            String game = juego(palenguion, palabraselec, i);
            if (palenguion.equals(game)) {
                System.out.println("La palabra no contiene esa letra :(");
            } else {
                palenguion = game;
            }

            System.out.println(palenguion);

            // Verificar si la palabra fue adivinada
            if (!palenguion.contains("_")) {
                System.out.println("¡Felicidades! Has adivinado la palabra.");
                break; // Salir del ciclo si la palabra fue adivinada
            }

            // Opción de adivinar la palabra completa
            System.out.print("¿Ya sabes cuál es la palabra? (SI/NO): ");
            String resp = leer.nextLine().toUpperCase();
            if (resp.equals("SI")) {
                bandera = true;
                break;
            }
        }

        // Validar adivinanza directa
        if (bandera) {
            System.out.print("Eres un genio, ¿cuál es la palabra? ");
            String posibleResp = leer.nextLine().toUpperCase();
            if (palabraselec.equals(posibleResp)) {
                palenguion = posibleResp;
                System.out.println("¡Felicidades! Has adivinado la palabra: " + posibleResp);
            } else {
                System.out.println("YOU LOSE :(");
            }
        }

        // Última oportunidad si quedan guiones
        if (palenguion.contains("_")) {
            ultimaop(palabraselec);
        }
    }

    public static String palabras(String[] palabras, int random) {
        // Rellenar el array con palabras
        palabras[0] = "casa";
        palabras[1] = "silla";
        palabras[2] = "maestra";
        palabras[3] = "cocina";
        palabras[4] = "arbol";
        palabras[5] = "computadora";
        palabras[6] = "sistema";
        palabras[7] = "perro";
        palabras[8] = "gato";
        palabras[9] = "leon";
        palabras[10] = "mochila";
        palabras[11] = "telefono";
        palabras[12] = "lentes";
        palabras[13] = "reloj";
        palabras[14] = "pizarron";

        return palabras[random];
    }

    public static String guiones(String palabra) {
        // Generar una cadena con guiones
        String guion = "";
        for (int i = 0; i < palabra.length(); i++) {
            guion += "_ ";
        }
        return guion;
    }

    public static String juego(String palenguion, String palabraselec, int intento) throws IOException {
        String resultado = "";
        char letra;

        System.out.print("Intento " + intento + ", ¿qué letra aparece en la palabra? ");
        letra = (char) System.in.read();
        System.in.read(); // Consumir el salto de línea
        letra = Character.toUpperCase(letra); // Convertir la letra a mayúscula

        for (int j = 0; j < palabraselec.length(); j++) {
            if (palabraselec.charAt(j) == letra) {
                resultado += letra + " ";
            } else {
                resultado += palenguion.charAt(j * 2) + " ";
            }
        }
        return resultado;
    }

    public static void ultimaop(String palabraselec) {
        // Última oportunidad para adivinar la palabra completa
        System.out.print("Se agotaron tus oportunidades. Tienes un último intento para adivinar la palabra: ");
        String ultimo = leer.nextLine().toUpperCase();

        if (ultimo.equals(palabraselec)) {
            System.out.println("¡Felicidades! Has adivinado la palabra.");
        } else {
            System.out.println("YOU LOSE :((");
        }
    }
}
