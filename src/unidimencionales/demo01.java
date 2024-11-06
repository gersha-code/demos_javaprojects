package unidimencionales;
import java.util.Random;
/*
 * Genere un valor aleatorio entre 1 y 500,000. Haciendo divisiones sucesivas entre dos, utilice los residuos para calcular
 * y mostrar la interpretacion a binario del valor generado aleatoriamente. Utilice un arreglo de 10 celdas para almacenar
 * en los residuos de 2. Mostrar los valores que quedaron en el arreglo. Valide su programa para el caso en el que las celdas
 * del arreglo no sean sufiecientes para almacenar todos los residuos necesarios (en ese caso, mostrar mensaje "celdas del arrelgo
 * se agotaron"). Muestre el contenido del arreglo en caso de que las celdas hayan sido suficientes.
 */
public class demo01 {
    public static void main(String[] args) {
        Random random = new Random();
        int binary[] = new int[10];
        int number = random.nextInt(1, 500000);
        System.out.println("value generaded " + number);
        for (int i = 0; i < binary.length && number > 0; i++) {
            binary[i] = (number % 2);
            number = number / 2;
        }
        if (number > 0) {
            System.out.println("sould out");
        } else {
            for (int i = 0; i < binary.length; i++) {
                System.out.print(binary[i]);
            }
        }
    }

}
