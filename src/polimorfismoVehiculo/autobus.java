package polimorfismoVehiculo;

public class autobus extends vehiculo implements renta {
    private int cantidadPasajeros;

    public autobus(String placa, String marca, String modelo, int cantidadPasajeros, String arrendatario) {
        super(placa, marca, modelo, arrendatario);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    //Metodo interfaz
    public int rentar(int renta) {
        return 2;
    }
    //Metodo interfaz
    public int devolver() {
        return 12;
    }
}
