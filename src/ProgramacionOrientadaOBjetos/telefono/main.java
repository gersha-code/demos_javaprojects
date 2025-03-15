package ProgramacionOrientadaOBjetos.telefono;

import java.util.Scanner;

public class main {
    static Scanner leer = new Scanner(System.in);
    static char seleccionGlobal;

    public static void main(String[] args) {
        telefono tel[] = new telefono[10];
        menu(tel);
    }

    public static void menu(telefono tel[]) {

        while (seleccionGlobal != '4') {
            System.out.println(
                    "MENU PRINCIPAL\n1.- Crear telefono\n2.- Mostrar telefonos creados\n3.- Usar telefono\n4.- Terminar programa");
            seleccionGlobal = leer.next().charAt(0);
            switch (seleccionGlobal) {
                case '1':
                    tel = crearTelefono(tel);
                    break;
                case '2':
                    mostrarTelefonos(tel);
                    break;
                case '3':
                if (tel[0] != null) {
                    usarTelefono(tel);
                }
                System.out.println("Aun no hay telefonos creados");
                    break;
                default:
                    if (seleccionGlobal != '4') {
                        System.out.println("Entrado erronea");
                    }
            }
        }
        System.out.println("Programa finalizado");
    }

    public static telefono[] crearTelefono(telefono tel[]) {
        leer.nextLine();
        for (int i = 0; i < tel.length; i++) {
            if (tel[i] == null) {
                System.out.println("Ingresar titular del telefono: ");
                String titular = leer.nextLine();
                System.out.println("Ingresar saldo inicial: ");
                int saldoInicial = leer.nextInt();
                tel[i] = new telefono(titular, saldoInicial);
                System.out.println("Felicidades!, tu telefono ha sido creado con exito!");
                break;
            } else {
                System.out.println("Se ha llegado al maximo de Telefonos");
            }
        }
        return tel;
    }

    public static void mostrarTelefonos(telefono tel[]) {
        for (int i = 0; i < tel.length; i++) {
            if (tel[i] != null) {
                System.out.println("Titular " + (i + 1) + " : " + tel[i].mostrarTitular());
            }
        }
    }

    public static void usarTelefono(telefono tel[]) {
        int seleccionTel = telefonoSeleccionado(tel);
        int seleccionMenu = 0;

        while (seleccionMenu != 10) {
            System.out.println("Telefono de " + (tel[seleccionTel].mostrarTitular()) + " en uso");
            System.out.println(
                    "1.- Mostrar estado\n2.- Encender/apagar\n3.- Abonar saldo\n4.- Hacer llamada\n5.- Mostrar contactos\n6.- Mostrar historial de llamadas\n10.- Regresar a menu principal");
            seleccionMenu = leer.nextInt();
            switch (seleccionMenu) {
                case 1:
                    if (tel[seleccionTel].boton()) {
                        System.out.println(
                                "Estado del telefono: Encendido" + "\nTitular: " + tel[seleccionTel].mostrarTitular()
                                        + "\nSaldo: " + tel[seleccionTel].mostrarSaldo() + "\nCantidad de contactos: ");
                    } else {
                        System.out.println("teléfono apagado");
                    }
                    break;
                case 2:
                    tel[seleccionTel].cambio();
                    break;
                case 3:
                    int seleccionAbono = 0;
                    if (tel[seleccionTel].boton()) {
                        while (seleccionAbono != 3) {
                            System.out.println("1. Abono comun $100\n2. Abono personalizado\n3. Regresar");
                            seleccionAbono = leer.nextInt();
                            switch (seleccionAbono) {
                                case 1:
                                    tel[seleccionTel].abono();
                                    System.out.println("Abono comun realizado con exito!");
                                    break;
                                case 2:
                                    int cantidad = leer.nextInt();
                                    tel[seleccionTel].abono(cantidad);
                                    System.out.println("Abono personalizado realizado con exito!");
                                    break;
                                default:
                                    System.out.println("Seleccion erronea");
                            }
                        }
                    } else {
                        System.out.println("teléfono apagado");
                    }
                    break;
                case 4:// hacer llamada
                    leer.nextLine();
                    int seleccionLlamada = 0;
                    if (tel[seleccionTel].boton() && tel[seleccionTel].saldoActual() > 5) {
                        while (seleccionLlamada != 3) {
                            System.out.println("Ingrese nombre del contacto que desea llamar:  3. Salir");
                            String contacto = leer.nextLine();
                            if (tel[seleccionTel].buscarContacto(contacto)) {
                                // acefalta elcontador de contactos
                                System.out.println("Llamada exitosa");
                                tel[seleccionTel].realizarLLamada();
                                tel[seleccionTel].contador(seleccionTel);
                                break;
                            } else {
                                System.out.println("Contacto no registrado\nIngrese numero a llamar: ");
                                String numero = "";
                                boolean bandera = true;

                                while (true) {
                                    numero = leer.next();
                                    for (int i = 0; i < numero.length(); i++) {
                                        if ("0123456789".indexOf(numero.charAt(i)) == -1) {
                                            bandera = false;
                                        } else {
                                            bandera = true;
                                        }
                                    }
                                    if (numero.length() == 10 && bandera) {
                                        System.out.println("Numero validado");

                                        break;
                                    }
                                    System.out.println("Numero invalido, vuelva a intentarlo");
                                }

                                System.out.println("Llamada exitosa\nDesea registrar el numero");
                                tel[seleccionTel].realizarLLamada();
                                char sn = leer.next().charAt(0);
                                String nombre = "";
                                // Hace falta el contador de contactos
                                if (sn == 'S' || sn == 's') {
                                    System.out.println("Ingrese nombre del contacto: ");
                                    nombre = leer.next() + "/" + numero;

                                    if (tel[seleccionTel].registrarContacto(nombre)) {
                                        System.out.println("Contacto registrado exitosamente");
                                    } else {
                                        System.out.println("Agenda llena");
                                    }
                                }
                                
                                if (sn == 'N' || sn == 'n') {
                                    tel[seleccionTel].contactosDesconocidos(numero);
                                    tel[seleccionTel].contadorDesconocido(seleccionTel);
                                }
                                break;
                            }

                        }
                    } else {
                        System.out.println("Telefono apagado o saldo insuficiente");
                    }
                    break;
                case 5:
                    tel[seleccionTel].mostrarContactos();
                    break;
                case 6:
                    tel[seleccionTel].historial();
                    break;
                case 10:
                    break;
                default:
                    System.out.println("Seleccion erronea");
            }
        }
    }

    public static int telefonoSeleccionado(telefono tel[]) {
        leer.nextLine();
        System.out.println("Que telefono desea usar?");
        mostrarTelefonos(tel);

        int seleccion = 0;
        do {
            seleccion = leer.nextInt() - 1;
        } while (tel[seleccion] == null);
        return seleccion;
    }
}
