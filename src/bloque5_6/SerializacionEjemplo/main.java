package bloque5_6.SerializacionEjemplo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        List<Animal> animales = cargarLista();
        // ResetArchivo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del nuevo animal: ");
        String nombre = sc.nextLine();
        Animal nuevo = new Animal(nombre);
        animales.add(nuevo); // Agregamos el nuevo

        guardarLista(animales); // Guardamos todos

        System.out.println("Animal guardado con éxito.");
        // MostrarLista(animales);
        System.out.println(animales);

    }

    public static void guardarLista(List<Animal> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("animales.ser"))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // metodo que retorna una list de objetos animales
    public static List<Animal> cargarLista() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("animales.ser"));
            return (List<Animal>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>(); // Si no existe, devolvemos lista vacía
        }
    }

    public static void MostrarLista(List<Animal> lista) {
        try {
            // FileInputStream fis = new FileInputStream("animales.ser");
            // ObjectInputStream ois = new ObjectInputStream(fis);
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista);
            }
        } catch (Exception e) {
            System.out.println("no hay animales guardados");
        }
    }

    public static void ResetArchivo() {
        try {
            new FileOutputStream("animales.ser").close();
            System.out.println("Archivo animales.ser ha sido reseteado.");
        } catch (IOException e) {
            System.out.println("Error al resetear el archivo: " + e.getMessage());
        }
    }

}
