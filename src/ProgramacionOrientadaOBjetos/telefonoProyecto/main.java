import java.util.Scanner;

public class main {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        telefono tel[] = new telefono[10];
        menu(tel);
    }

    public static void menu(telefono tel[]) {
        int seleccion = 0;
        while (seleccion != 4) {
            System.out.println(
                    "MENU PRINCIPAL\n1 Crear telefono\n2 Mostrar telefonos creados\n3 Usar telefono\n4 Terminar programa");

            seleccion = leer.nextInt();
            switch (seleccion) {
                case 1:
                    tel = crearTelefono(tel);
                    break;
                case 2:
                    mostrarTelefonos(tel);
                    break;
                case 3:
                    usarTelefono(tel);
                    break;
                default:
                    System.out.println("Programa finalizado");
            }
        }
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
                    "1.- Mostrar estado\n2.- Encender/apagar\n3.- Abonar saldo\n4. Hacer llamada\n5.- Mostrar contactos\n6.- Mostrar historial de llamadas\n10.- Regresar a menu principal");
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
                                    tel[seleccionTel].abonoPersonalizado();
                                    System.out.println("Abono comun realizado con exito!");
                                    break;
                                case 2:
                                    int cantidad = leer.nextInt();
                                    tel[seleccionTel].abonoComun(cantidad);
                                    System.out.println("Abono comun realizado con exito!");
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
                            System.out.println("Ingrese nombre del contacto que desea llamar: / 3. Regresar");
                            String contacto = leer.nextLine();

                            
                            for (int i = 0; i < tel[seleccionTel].mostrarContactos().length; i++) {
                                if (tel[seleccionTel].mostrarContactos().equals(tel)) {
                                    System.out.println("Llama exitosa a " + tel[seleccionTel].mostrarTitular());
                                } else {
                                    System.out.println("Contacto no registrado\nIngrese numero a llamar: ");
                                    String numero = "";
                                    numero = leer.next();
                                    System.out.println("Llamada exitosa\nDesea registrar el numero?");
                                    
                                        char sn = leer.next().charAt(0);
                                        if (sn == 's' || sn == 'S' || sn == 'n' || sn == 'N') {
                                            System.out.println("Ingrese nombre del contacto: ");
                                            String nombre = leer.next() + "/" + numero;
                                            registrarContacto(tel[seleccionTel].mostrarContactos(), nombre); //mostrarContactos regresa el arreglo de contactos

                                    }
                                    break;
                                }
                            }
                        }
                    } else {
                        System.out.println("Telefono apagado o saldo insuficiente");
                    }
                    break;
                case 5:// mostrar contactos
                    break;
                case 6:// historial de llamadas
                    break;
                case 10:
                    break;
                default:
                    System.out.println("Seleccion erronea");
            }
        }

    }

    public static String[] registrarContacto(String contactos[], String contacto){
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] !=null) {
                contactos[i] = contacto;
                System.out.println(contactos[i] +"registrado con extio");
                return contactos;
            }
        }
        return contactos;

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

    /*
     * public void hacerLLamada(int saldoInicial, telefono tel[]){
     * String nombre;
     * if(tel[telefonoSeleccionado].boton()==true &&
     * tel[telefonoSeleccionado].saldoInicial>5){
     * System.out.println("Escriba al contacto que sea llamar: ");
     * for(int i=0;i<tel.length;i++){
     * if(tel[telefonoSeleccionado].titular)
     * }
     * }
     * 
     * }
     */

}
