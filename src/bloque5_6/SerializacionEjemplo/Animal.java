package bloque5_6.SerializacionEjemplo;

import java.io.Serializable;

public class Animal implements Serializable{
    private String nombre;
    private int edad;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Animal: " + nombre;
    }
}
