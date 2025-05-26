package pruebas;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.Serializable;
import java.util.Random;

public class Producto implements Serializable {
    private String cve_prod, descripcion;
    private int inventario;
    private float costo, precio_vta;
    private static Random random = new Random();

    public Producto() {
        this.cve_prod = String.valueOf(random.nextInt(100000, 999999));
        this.descripcion = generarDescripcion();
        this.inventario = random.nextInt(700);
        this.costo = random.nextFloat(10, 700);
        this.precio_vta = this.costo + random.nextFloat(30, 100);
    }

    @Override
    public String toString() {
        return "(clave: " + this.cve_prod + ", descripcion: " + this.descripcion + ", inventario: " + this.inventario
                + ", costo: " + this.costo
                + ", precio venta: " + this.precio_vta + ")\n";
    }

    private String generarDescripcion() {
        try {
            FileReader fr = new FileReader("/home/gersha/Documentos/Descripciones.txt");
            BufferedReader brr = new BufferedReader(fr);
            String linea = brr.readLine();
            brr.close();
            String[] descripciones = linea.split("/");
            return descripciones[random.nextInt(descripciones.length)];
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("ERROR AL LEER ARCHIVO DE DESCRIPCIONES");
            return "";
        }

    }

}
