package pruebas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class punto_deVenta {
    // Colores ANSI
    final public String RESET = "\u001B[0m";
    final public String ROJO = "\u001B[31m";
    final public String VERDE = "\u001B[32m";
    final public String AMARILLO = "\u001B[33m";
    final public String PURPURA = "\u001B[35m";
    final public String NARANJA = "\u001B[38;5;208m";

    private List<Producto> listaProductos;
    private List<Venta> listaVentas;

    public punto_deVenta() {
        this.listaProductos = cargarListaP();
        this.listaVentas = listaVentas;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public boolean surtirInventario(Producto producto) {
        this.listaProductos.add(producto);
        return true;
    }

    private void guardarLista() {
        try {
            FileOutputStream fos = new FileOutputStream("ListaProductos.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this.listaProductos);
        } catch (Exception e) {
            System.out.println("Error al guardar lista de productos.");
        }
    }

    private List<Producto> cargarListaP() {
        try {
            FileInputStream fis = new FileInputStream("ListaProductos.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            return (List<Producto>) ois.readObject();
        } catch (Exception e) {
            e.fillInStackTrace();
            System.out.println("No se encontro el archivo de productos... Se retonara una lista vacia.");
            return new ArrayList<>(); // Retorna una lista vacia
        }
    }

}
