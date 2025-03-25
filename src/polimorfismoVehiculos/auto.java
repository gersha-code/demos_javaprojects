package polimorfismoVehiculos;

public class auto extends vehiculo implements renta {
    private int kilometraje;

    public auto(String placa, String marca, String modelo, int kilometraje) {
        /*
         * Siempre debe ser la primera instruccion en el constructor de la clase hija si
         * se desea
         * llamar al constructor del padre.
         */ 
        super(placa, marca, modelo);
        this.kilometraje = kilometraje;
    }

    public void rentar(int renta) {
        
    }

    public void devolver() {

    }

}
