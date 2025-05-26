package bloque5_6.pruebasdeArchivos;

import java.io.Serializable;

public class persona implements Serializable{
    private String nombre;
    private int edad;

    public persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInformacion(){
        System.out.println("nombre:" + this.nombre + " edad: " + this.edad);
    }

}
