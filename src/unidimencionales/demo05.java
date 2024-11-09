package unidimencionales;

import java.util.Random;

/*
Crear dos arreglos de enteros de 4 celdas. Generar un valor aleatorio entre 1000 y 9999. Separar las cifras de ese
valor para que sea colocada cada cifra del valor en una celda diferente del primer arreglo. Aplicar el siguiente
algoritmo para “cifrar” el contenido del primer arreglo, dejando el cifrado en el segundo arreglo:
a) A cada valor de la celda del primer arreglo debe sumarse 7
b) De cada suma resultante en el paso anterior obtener el residuo entero de su división entre 10 (por ejemplo si la suma
resulta 15, el residuo entero entre 10 sería 5)
c) Colocar los valores resultantes del paso anterior colocando el contenido de la primera celda del primer arreglo en la tercera
celda del segundo arreglo y el contenido de la tercera celda del primer arreglo en la primera celda del segundo arreglo. A
continuación colocar el contenido de la segunda celda del primer arreglo en la cuarta celda del segundo arreglo y el contenido
de la cuarta celda del primer arreglo en la segunda celda del segundo arreglo.
Ejemplo, suponiendo que el valor generado fue 7392
 */
public class demo05 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(1000, 9999);
        int vector[] = new int[String.valueOf(number).length()];
        for (int i = 0; i < String.valueOf(number).length(); i++) {
            vector[i] = String.valueOf(number).charAt(i) - '0';
        }
        /*
         * Con String,valueOf(number).charAt(i) se obtine el valor ASCII
         * Una manera de obtener el valor real es restando otro ASCII,
         * el valor '0' es 46 en ASCII, esto funcionaria para obtener los
         * valores numericos de acuerdo a la tabla ASCII.
         */
        System.out.print("Valor aleatorio: | ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " | ");
        }

        // C I F R A D O
        System.out.print("\nCifrado 1: | ");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (vector[i] + 7) % 10;
            System.out.print(vector[i] + " | ");
        }
        int vector_cifrado[] = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            if (i % 2 == 0) { // es impar
                vector_cifrado[i] = vector[(vector.length / 2) - i];
            } else {
                vector_cifrado[i] = vector[vector.length - i];
            }
        }
        System.out.print("\nCifrado 2: |");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector_cifrado[i] + " | ");
        }

    }

}
