package polimorfismoVehiculos;

public class autobus extends vehiculo implements renta {
    private int cantidadPasajeros;

    public autobus(String placa, String marca, String modelo, int cantidadPasajeros) {
        super(placa, marca, modelo);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public void rentar(int renta) {

    }

    public void devolver() {

    }
}
