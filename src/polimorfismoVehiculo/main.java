package polimorfismoVehiculo;

import java.util.Random;
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

    public static final String NARANJA = "\u001B[38;5;208m"; // Código extendido ANSI 208

    private static Scanner scanner = new Scanner(System.in);
    private static char seleccion = ' ';
    private static int vehiculosDisponibles = 20;
    private static Random random = new Random();

    public static void main(String[] args) {
        agencia agenciaObjeto = new agencia(vehiculosDisponibles);
        crearVehiculos(agenciaObjeto);
        menu(agenciaObjeto);
    }

    public static void crearVehiculos(agencia agenciaObjeto) {
        for (int i = 0; i < vehiculosDisponibles; i++) {
            switch (random.nextInt(1, 4)) {
                case 1:
                    agenciaObjeto.crearAuto();
                    break;
                case 2:
                    agenciaObjeto.crearAutobus();
                    break;
                case 3:
                    agenciaObjeto.crearBicicleta();
                    break;
                default:
                    break;
            }
        }

    }

    public static void mostrarGarage(agencia agenciaObjeto) {
        for (int i = 0; i < agenciaObjeto.getGarage().length; i++) {
            if (agenciaObjeto.getGarage()[i].getClass() == auto.class) {
                System.out.println(AZUL + "Auto: [" + RESET + agenciaObjeto.getGarage()[i] + AZUL + "]" + RESET);
            }
            if (agenciaObjeto.getGarage()[i].getClass() == bicicleta.class) {
                System.out.println(AZUL + "Bicicleta: [" + RESET + agenciaObjeto.getGarage()[i] + AZUL + "]" + RESET);
            }
            if (agenciaObjeto.getGarage()[i].getClass() == autobus.class) {
                System.out.println(AZUL + "Autobus: [" + RESET + agenciaObjeto.getGarage()[i] + AZUL + "]" + RESET);
            }
        }
    }

    public static void menu(agencia agenciaObjeto) {
        mostrarGarage(agenciaObjeto);
        System.out.println(VERDE + "Agencia creada con exito! " + agenciaObjeto.getVeichulosRenta().length
                + " vehiculos disponibles para su renta" + RESET);
        while (seleccion != '5') {
            System.out.println(
                    "\t\tAgencia de renta de vehiculos. "
                            + "\n1. Consultar vehiculos rentados.\n2. Consultar ingresos generados.\n3. Rentar vehiculos.\n"
                            + "4. Devolver vehiculo.\n" + NARANJA + "Ingrese '5' para salir." + RESET);
            seleccion = scanner.next().charAt(0);
            switch (seleccion) {
                case '1':
                    for (int i = 0; i < agenciaObjeto.getVeichulosRenta().length; i++) {
                        if (agenciaObjeto.getVeichulosRenta()[i] != null) {
                            System.out.println((agenciaObjeto.getVeichulosRenta())[i]);
                        } else {
                            System.out.println(ROJO + "[Aun no hay vehiculso rentados]" + RESET);
                            break;
                        }
                    }
                    break;
                case '2':
                    System.out.println("Ingresos generados: " + agenciaObjeto.getIngresosTotales());
                    break;
                case '3':

                    break;
                case '4':
                    for (int i = 0; i < agenciaObjeto.getVeichulosRenta().length; i++) {
                        if (agenciaObjeto.getVeichulosRenta()[i] == null) {
                            System.out.println("Espacio disponible");
                        } else {
                            System.out.println(i + " " + agenciaObjeto.getVeichulosRenta()[i]);
                        }
                    }
                    System.out.println("Ingresa vehiculo a dar de baja: ");
                    int opcion = scanner.nextInt();
                    if (agenciaObjeto.getVeichulosRenta()[opcion] == null
                            || opcion >= agenciaObjeto.getVeichulosRenta().length) {
                        agenciaObjeto.getVeichulosRenta()[opcion] = null;
                    }

                    break;

                case '5':
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println(ROJO + "Entrada erronea, vuelva a interar." + RESET);
                    break;
            }
        }

    }

    public static agencia renta(agencia agenciaObjeto) {
        while (seleccion != 'x') {
            System.out.println("Que vehiculo desea rentar?\n1. Automovil.\n2. Autbous.\n3. Bicicleta.\n" + NARANJA
                    + "Ingrese 'x' para salir." + RESET);

            switch (seleccion) {
                case '1':
                    agenciaObjeto.crearAuto();
                    break;
                case '2':
                    break;
                case '3':
                    break;
                case 'x':
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println(ROJO + "Entrada erronea, vuelva a interar." + RESET);
                    break;
            }
        }
        return age;
    }

}
