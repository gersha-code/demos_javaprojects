package polimorfismoVehiculo;

public class bicicleta extends vehiculo implements renta {

    public bicicleta(String placa, String marca, String modelo, String arrendatario) {
        super(placa, marca, modelo, arrendatario);
    }

    //Metodo interfaz
    public int rentar(int renta) {
        return 1;
    }

    //Metodo interfaz
    public int devolver() {
        return 12;
    }
}
