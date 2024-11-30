package euler_project;

import java.util.Random;
import java.util.Scanner;

public class euler_002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa n:");
        int n = scanner.nextInt();
        int arreglo[] = new int[n];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = scanner.nextInt();
        }

        System.out.println("Arreglo normal:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + "  ");
        }
        System.out.println("\nArreglo alreves:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[arreglo.length-1-i] + "  ");
        }
    }
}
