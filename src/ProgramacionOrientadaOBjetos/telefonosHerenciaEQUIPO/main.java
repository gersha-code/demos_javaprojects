package ProgramacionOrientadaOBjetos.telefonosHerenciaEQUIPO;

import java.util.Scanner;

public class main {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        iphone iphones[] = new iphone[2];
        chaifon chaifons[] = new chaifon[2];
        menu(iphones, chaifons);

    }

    public static void menu(iphone iphones[], chaifon chaifons[]) {

        int seleccion = 0;
        while (seleccion != 4) {
            System.out.println("MENU PRINCIPAL\n1 Crear telefono\n2 Usar telefono\n3 Terminar programa");
            seleccion = leer.nextInt();
            switch (seleccion) {
                case 1:
                    System.out.println("1. Crear iPhone\n2. Crear chaifon.");
                    int opcion_crear = 0;
                    opcion_crear = leer.nextInt();
                    if (opcion_crear == 1 && iphones.length < 2) {
                        iphones = crearIphone(iphones);
                    } else {
                        chaifons = crearChaiphone(chaifons);
                    }
                    break;
                case 2:
                    System.out.println("Que telefono desea usar?\n1.Iphones\n2.Chaiphones");
                    seleccion = leer.nextInt();
                    if (seleccion == 1 && seleccion > 0 && seleccion <= 2) {
                        menu_iphone(iphones);
                    }
                    break;
                case 3:

                default:
                    System.out.println("Programa finalizado");
            }
        }
    }

    public static iphone[] crearIphone(iphone iph[]) {
        leer.nextLine();
        for (int i = 0; i < iph.length; i++) {
            if (iph[i] == null) {
                System.out.println("Ingresar titular del telefono: ");
                String titular = leer.nextLine();             
                iph[i] = new iphone(titular);
                System.out.println("Felicidades!, tu telefono ha sido creado con exito!" + iph[0]);
                System.out.println("VERIFICACION DE CREACION" + iph[0]);
                return iph;
            } else {
                System.out.println("Se ha llegado al maximo de Telefonos");
            }

        }
        return iph;
    }

    public static chaifon[] crearChaiphone(chaifon chaiphn[]) {
        leer.nextLine();
        for (int i = 0; i < chaiphn.length; i++) {
            if (chaiphn[i] == null) {
                System.out.println("Ingresar titular del telefono: ");
                String titular = leer.nextLine();
                System.out.println("Ingresar saldo: ");
                int saldo = leer.nextInt();
                chaiphn[i] = new chaifon(titular, saldo);
                System.out.println("Felicidades!, tu telefono ha sido creado con exito!");
                break;
            } else {
                System.out.println("Se ha llegado al maximo de Telefonos");
            }

        }
        return chaiphn;
    }

    public void usar() {

    }

    public static void mostrarIphones(iphone[] iphones){
        for (int i = 0; i < iphones.length; i++) {
            if (iphones != null) {
                System.out.println((i+1) + "." + iphones[i]);
            }
        }
    }
    public static void menu_iphone(iphone[] iphones) {
        if (iphones == null) {
            System.out.println("No tienes iphones creados.");
        } else {
            System.out.println("Ingresar iphone a usar:");
                mostrarIphones(iphones);
                int seleccion = 0;
                seleccion = leer.nextInt()-1;
                if (seleccion >=0 && seleccion <= iphones.length) {
                    System.out.println("Que desea hacer?\n1. Instalar una aplicación\n2. Desinstalar una aplicación");
                    System.out.println("3. Llamar\n4.Abonar\n5. Encender/Apagar\n6. Cargar");
                    System.out.println("7. Aplicaiones");
                    int opcion = leer.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("Que aplicacion desea instalar?");
                            String aplicacion = leer.nextLine();
                            iphones[seleccion].Instalar(aplicacion);
                            iphones[seleccion].gastoBateria();
                            break;
                        case 2:
                            System.out.println("Que aplicacion desea desinstalar?");
                            String app = leer.nextLine();
                            iphones[seleccion].Desinstalar(app);
                            iphones[seleccion].gastoBateria();
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        default:
                            break;
                    }
                }

            

        }
    }
}
