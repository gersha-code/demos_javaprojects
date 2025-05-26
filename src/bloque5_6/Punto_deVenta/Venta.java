package bloque5_6.Punto_deVenta;

import java.util.Scanner;
import java.io.Serializable;
import java.sql.Time;
import java.util.Random;

public class Venta implements Serializable {
    private String cve_prod, descripcion;
    private int cantidad;
    private float utilidad;

    public Venta(String descripcion, int cantidad) {
        Random random = new Random();
        this.cve_prod = String.valueOf(random.nextInt(100000 - 999999));
        this.descripcion = descripcion;
        this.cantidad = cantidad;

    }

    public static void realizar_venta() {
        Scanner leer = new Scanner(System.in);
        try {
            System.out.println("Ingresa la clave del producto: ");
            String entry = leer.nextLine();
            for (int i = 0; i < Punto_deVenta.productosArreglo.length; i++) {
                boolean encontrado = false;
                if (entry.equals(Punto_deVenta.productosArreglo[i].getCve_prod())) {
                    encontrado = true;
                }
                if (encontrado == false && i == Punto_deVenta.productosArreglo.length - 1) {
                    throw new Exception("Producto no encontrado");
                }
            }

        } catch (Exception ex) {
            System.out.println("Producto no encontrado");
        }
    }

}
