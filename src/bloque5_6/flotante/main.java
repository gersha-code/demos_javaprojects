package bloque5_6.flotante;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JLabel;
public class main {
    public static void main(String[] args) {
        validarNumero numero = new validarNumero();
        Scanner scanner = new Scanner(System.in);
        String cadena = "";
        while (true) {
            System.out.println("Ingrese un numero float: ");
            cadena = scanner.next();
            if (cadena.equalsIgnoreCase("parar")) break;
            try {
                System.out.println("\t" + validarNumero.VERDE + "Entrada valida: [ " + numero.validarNumero(cadena) + " ]" + validarNumero.RESET);
            } catch (numeroExcepciones e) {
                System.out.println("Validacion fallida, " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Formato de numero incorrecto " + validarNumero.ROJO + e.getMessage() + validarNumero.RESET);
            } finally {
                System.out.println("\nIngrese " + validarNumero.AMARILLO + "'PARAR'" + validarNumero.RESET + " para finalizar el programa.");
            }
            System.out.println("El programa continua...");
        }
    }
}
