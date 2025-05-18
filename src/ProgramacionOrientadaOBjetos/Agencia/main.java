package ProgramacionOrientadaOBjetos.Agencia;

import java.util.Scanner;

public class main {
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String NARANJA = "\u001B[38;5;208m";

    public static char seleccion = ' ';
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        agencia agenciaObjeto = new agencia(10);
        System.out.println(VERDE + "Agencia creada con exito!, [" + agenciaObjeto.getGarage().length + "] vehiculos disponibles para su renta" + RESET);
        menu(agenciaObjeto);
    }

    public static void menu(agencia agenciaObjeto) {
        while (seleccion != '6') {
            System.out.println("1. Consultar vehiculos rentados.\n2. Consultar ingresos generados.\n3. Rentar vehiculos.\n"
                            + "4. Devolver vehiculo.\n" + "5. Consultar informacion a detalle de la agencia.\n"
                            + NARANJA + "Ingrese '6' para salir." + RESET);
            seleccion = scanner.next().charAt(0);
            switch (seleccion) {
                case '1':
                    //vehiculosRentados(agenciaObjeto);
                    break;
                case '2':
                    System.out.println(AZUL + "[" + RESET + "Ingresos generados: $" + agenciaObjeto.getIngresosTotales() + AZUL + "]" + RESET);
                    break;
                case '3':
                    System.out.println("Vehiculos disponibles:");
                    //rentarVehiculo(agenciaObjeto);
                    break;
                case '4':
                System.out.println("HOla we");
                    break;
                case '5':
                    mostrarInformacionGarage(agenciaObjeto);
                    break;
                case '6':
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println(ROJO + "Entrada erronea, vuelva a interar." + RESET);
                    break;
            }
        }

    }

    public static void mostrarInformacionGarage(agencia agenciaObjeto){
        System.out.println(AMARILLO + "Ingresos totales: [" +agenciaObjeto.getIngresosTotales() + "]" + RESET);
        for (int i = 0; i < agenciaObjeto.getGarage().length; i++) {
            if (agenciaObjeto.getGarage()[i].getArrendatario() == null) {
                System.out.println(VERDE + "[Disponible] " + RESET+agenciaObjeto.mostrarVehiculos(i) +  " [Costo diario:" +agenciaObjeto.getGarage()[i].getCostoDiario() + "]");
            } else {
                System.out.println(NARANJA+ "[En renta]" + RESET+agenciaObjeto.mostrarVehiculos(i) + RESET);

            }
            
        }
    }

}
