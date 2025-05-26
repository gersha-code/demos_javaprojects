package pruebas;

import java.util.Scanner;

public class main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu(new punto_deVenta());
    }

    public static void menu(punto_deVenta tienda) {
        char seleccion;
        do {
            System.out.println(
                    "Transacciones\n\t1.Realizar venta\n\t2.Surtir inventario\n\t3.Generar reporte de ventas\n\t4.Generar reporte de utilidades\n\t5.Generar reporte de inventario\n\t6.Cerrar sistema\n\t7.Abrir sistema\n\t8.Salir");
            seleccion = sc.next().charAt(0);
            switch (seleccion) {
                case '1':

                    break;
                case '2':
                    surtirInventario(tienda);
                    break;
                case '4':
                    tienda.getListaProductos();
                break;
                case '8':
                System.out.println("Programa finalizado");
                break;
                default:
                    System.out.println("Opcion no valida, vuelve a intetarlo.");
                    break;
            }
        } while (seleccion != '8');
    }

    public static void surtirInventario(punto_deVenta tienda) {
        tienda.surtirInventario(new Producto());
        System.out.println("Inventario surtido con exito.");
    }

}
