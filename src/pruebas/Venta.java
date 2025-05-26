package pruebas;

import java.util.Scanner;
import java.io.Serializable;
import java.sql.Time;
import java.util.Random;

public class Venta implements Serializable {
    private String cve_prod, descripcion;
    private int cantidad;
    private float utilidad;

    public Venta(Producto producto) {
        //el constructor debe recibir los parametros del producto
        Random random = new Random();
        this.cve_prod = producto;
        this.descripcion = descripcion;
        this.cantidad = cantidad;

    }


}
