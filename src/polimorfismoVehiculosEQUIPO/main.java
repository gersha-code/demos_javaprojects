package polimorfismoVehiculosEQUIPO;

import java.util.Scanner;

public class main {
    // Colores de texto
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String NARANJA = "\u001B[38;5;208m";

    private static Scanner scanner = new Scanner(System.in);

    private static char seleccion = ' ';

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        agencia vehichulos = new agencia(10);
        while (seleccion != '5') {
            System.out.println(
                    "1. Consultar vehiculos rentados\n2. Consultar ingresos generados\n3. Rentar vehiculo\n4. Devolver vehiculo\n5. Terminar programa");
            System.out.println("Introduce una opcion: ");
            seleccion = scanner.next().charAt(0);
            switch (seleccion) {
                case '1':
                    for (int index = 0; index < vehichulos.getGarage().length; index++) {
                        if (vehichulos.getGarage()[index].getArrendatario() == null) {
                            System.out.println("DISPONIBLE: " + vehichulos.getGarage()[index].getClass().getSimpleName()
                                    + " | " + vehichulos.getGarage()[index]);
                            System.out.println("Costo: $" + vehichulos.getGarage()[index].getCostoDiario());
                        } else {
                            System.out.println("EN USO: " + vehichulos.getGarage()[index].getClass().getSimpleName()
                                    + " | " + vehichulos.getGarage()[index]);
                            System.out.println("Costo: $" + vehichulos.getGarage()[index].getCostoDiario());

                        }
                    }
                    break;
                case '2':
                    System.out.println("DINERO EN LA CAJA: $" + vehichulos.getIngresos());
                    break;
                case '3':
                    for (int index = 0; index < vehichulos.getGarage().length; index++) {
                        if (vehichulos.getGarage()[index].getArrendatario() == null) {
                            System.out.println("DISPONIBLE: " + vehichulos.getGarage()[index]);
                        }
                    }
                    System.out.println("INGRESA VEHICULO A RENTAR: ");
                    scanner.nextLine();
                    String comparar = scanner.nextLine();
                    for (int i = 0; i < vehichulos.getGarage().length; i++) {
                        if (vehichulos.getGarage()[i].getPlaca().equalsIgnoreCase(comparar)) {
                            vehichulos.ingresosTotales += vehichulos.getGarage()[i].rentar();
                        }
                    }
                    break;          
                case '4':            
                    devolverVehiculo(vehichulos);
                    break;
                case '5':
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        }

    }

    public static void devolverVehiculo(agencia vehichulos) {
        System.out.println("Ingrese la placa del vehiculo que desea regresar");
        String placa = scanner.next();

        for (int j = 0; j < vehichulos.getGarage().length; j++) {
            if (vehichulos.getGarage()[j].getPlaca().equalsIgnoreCase(placa) && vehichulos.getGarage()[j].getArrendatario()!=null) {
                vehichulos.getGarage()[j].setArrendatario(null);
                System.out.println("Vehiculo devuelto con exito");
                vehichulos.setIngresosTotales(vehichulos.getGarage()[j].devolver());
            }else if(vehichulos.getGarage()[j].getArrendatario()==null){
                System.out.println("Ese vehiculo no está rentado o no existe.");
            }
        }//el del auto resta -500, y  el de autobus es mas complejo
            //en el autobus hay que devolver $20 por cada pasajero que pasa de 30
        //Bucle extraño a revisar
    }

}
