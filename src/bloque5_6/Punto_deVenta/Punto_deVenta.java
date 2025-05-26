package bloque5_6.Punto_deVenta;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Random;

public class Punto_deVenta {
        static Producto productosArreglo[] = new Producto[10];
        static Venta ventasArreglo[] = new Venta[10];
    public static void main(String[] args) {
        Random random = new Random();
        String cve = "", fecha;

    }

    public static void serializarProductos(){//Metodo para escribir productos en archivo
        try {
            FileOutputStream leer = new FileOutputStream("SADASDA");//Objeto para abrir archivo en lectura
            ObjectOutputStream salida = new ObjectOutputStream(leer);//Objeto para escribir en el archivo objetos.

            salida.writeObject(salida);
            salida.close();
            leer.close();
        } catch (Exception e) {
            System.out.println("Archivo no encontrado");
        }
    }


    public static void menu(){
        try {
            int seleccion=0;
            while (seleccion != 8) {
                System.out.println("1. Realizar venta\n2. Surtir inventario\n3. Generar reporte de venta\n4. Generar reporte de utilidades\n5. Generar reporte de inventario\n6. Cerrar sistema\n7. Abrir sistema\n8. Salir");
                switch (seleccion) {
                    case 1:
                        
                        break;
                
                    default:
                        break;
                }
            }
            
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
