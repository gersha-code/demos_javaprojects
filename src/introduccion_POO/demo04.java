package introduccion_POO;

import java.util.Scanner;

/*
 * En esta clase se ponen aprueba varios problemas y se propone la solucion de dichos mediante metodos
 */
public class demo04 {
    static Scanner scanner = new Scanner(System.in);
    static int selection = 0 ;
    public static void main(String[] args) {
        
        do {
            System.out.println("1. SUMA\n2. RESTA\n3.MULTIPLICACION\n4.DIVISION");
            selection = scanner.nextInt();
            
            switch (selection) {
                case 1:
                    
                    System.out.println("\tLa suma es: " + suma(selection_1(), selection_2()));
                    break;
                    case 2:
                    System.out.println("\tLa resta es: " + resta(selection_1(), selection_2()));
                    break;
                    case 3:
                    System.out.println("\tLa multiplicacion es: " + multiplicacion(selection_1(), selection_2()));
                    break;
                    case 4:
                    System.out.println("\tLa division es: " + division(selection_1(), selection_2()));
                    break;
                default:
                System.out.println("Seleccion erronea, vuelva a intentarlo.");
                    break;
            }
            
        } while (selection != 10);
    }

    public static int selection_1(){
        System.out.println("Ingrese valor 1");
        int a = scanner.nextInt();
        return a;
    }
    public static int selection_2(){
        System.out.println("Ingrese valor 2");
        int a = scanner.nextInt();
        return a;
    }

    public static int suma (int a, int b){
        return (a+b);
    }
    
    public static int resta(int a, int b){
        return (a-b);
    }

    public static int multiplicacion(int a, int b){
        return (a*b);
    }

    public static int division(int a, int b ){
        if (a>b) {
            return (a/b);
        } else {
            System.out.println("No es posible realizar esta division");
            return 0;
        }
    }
}
