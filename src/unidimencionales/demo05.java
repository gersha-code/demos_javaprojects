package unidimencionales;

import java.util.Random;

/*
 * Crear arreglos enteros de 4 celdas. Generar un valor aleatorio entre 1000 y 9999. Separar las cifras de ese
 * valor para que sea colocada cada cifra del valor en una celda diferente del primer arreglo. Aplica el siguiente
 * algoritmo para "cifrar" el contenido del primer arreglo, dejando el cifrado en el segundo arreglo:
 *      a) A cada valor de la celda del primer arreglo debe sumarse 7
 *      b) De cada suma resultante del paso anterior obtener el residuo de su division entre 10
 *      c) Colocar los valores resultantes del paso anterior colocando el contenido de la primera celda del primer
 *          arreglo en la tercera...
 */
public class demo05 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(1000, 9999);
        System.out.println(number);
        String string_number = String.valueOf(number);
        int vector_1 [] = new int[string_number.length()];
        System.out.print("Primer arreglo: | ");
        for (int i = 0; i < string_number.length(); i++) {
            
            System.out.print(vector_1[i] + " | ");
        }
        
    }

}
