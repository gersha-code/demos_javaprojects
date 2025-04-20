package polimorfismoVehiculos;

import java.util.Scanner;

/*
 * Clase main contiene todo lo relacionado con impresiones en terminal, asi como el metodo main.
 */
public class main {
    // Colores de texto
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String MORADO = "\u001B[35m";
    public static final String CIAN = "\u001B[36m";
    public static final String BLANCO = "\u001B[37m";
    public static final String FONDO_BLANCO = "\u001B[47m";

    public static void main(String[] args) {
        agencia agenciaObjeto = new agencia(10);
        auto v1 = new auto("1", "2", "2", 12);
        autobus b1 = new autobus("null", null, null, 0);
        agenciaObjeto.rentarVehiculo(v1);
        agenciaObjeto.rentarVehiculo(b1);

        menu();

    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        char seleccion = ' ';

        while (seleccion >= '1' && seleccion <= '4') {
            System.out.println(FONDO_BLANCO + "\t\tAgencia de renta de vehiculos\n1. Rentar\n2.Devolver\n3.Mostrar vehiculos" + RESET);
            seleccion = scanner.next().charAt(0);
        }

    }

}
