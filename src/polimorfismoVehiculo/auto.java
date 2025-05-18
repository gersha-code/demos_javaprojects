package polimorfismoVehiculo;

import java.util.Random;

public class auto extends vehiculo implements renta {
    private int kilometraje;
    static Random random = new Random();

    public auto(String placa, String marca, String modelo, int kilometraje, String arrendatario) {
        /*
         * Siempre debe ser la primera instruccion en el constructor de la clase hija si
         * se desea
         * llamar al constructor del padre.
         */ 
        super(placa, marca, modelo, arrendatario);
        this.kilometraje = kilometraje;
    }

    //Metodo interfaz
    public int rentar(int rentaDias) {
        return random.nextInt(900, 2000)*rentaDias;
    }
    
    //Metodo interfaz
    public int devolver() {
        return -500;
    }

}
