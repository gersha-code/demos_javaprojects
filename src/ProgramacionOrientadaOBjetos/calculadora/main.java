package ProgramacionOrientadaOBjetos.calculadora;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        calculadora calcu = new calculadora(0, 0);
        Scanner scanner = new Scanner(System.in);
        int selec = 0;
        do {

            System.out.println("1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir");
            selec = scanner.nextInt();
            System.out.println("Ingresa valor 1: ");
            int valor_1 = scanner.nextInt();
            System.out.println("Ingresa valor 2: ");
            int valor_2 = scanner.nextInt();
            switch (selec) {
                case 1:
                    System.out.println("\tEl resultado de la suma es: " + calcu.sumar(valor_1, valor_2));
                    break;
                    case 2:
                    System.out.println("\tEl resultado de resta es: " + calcu.resta(valor_1, valor_2));
                    break;
                    case 3: 
                    System.out.println("\tEl resultado de multiplicacion es: " + calcu.multiplicar(valor_1, valor_2));
                    break;
                    case 4: 
                    System.out.println("\tEl resultado de division es: " + calcu.dividir(valor_1, valor_2));
                default:
                    break;
            }
        } while (selec!= 5);
    }
}
