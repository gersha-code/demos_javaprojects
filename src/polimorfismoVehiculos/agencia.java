package polimorfismoVehiculos;

public class agencia {

    private double ingresosTotales;
    private renta veichulosRenta[];

    public agencia(int vehiculosDisponibles) {
        this.ingresosTotales = 0;
        this.veichulosRenta = new renta[vehiculosDisponibles];
    }

    public boolean rentarVehiculo(auto vehiculo) { //Auto sobrecarga
        for (int i = 0; i < veichulosRenta.length; i++) {
            if (veichulosRenta[i] == null) {
                veichulosRenta[i] = vehiculo;
                return true;
            } 
        }
        return false;
    }

    public boolean rentarVehiculo(autobus vehiculo) { //Autobus sobrecarga
        for (int i = 0; i < veichulosRenta.length; i++) {
            if (veichulosRenta[i] == null) {
                veichulosRenta[i] = vehiculo;
                return true;
            } 
        }
        return false;
    }
    
    public boolean rentarVehiculo(bicicleta vehiculo) { //Bicicleta Sobrecarga
        for (int i = 0; i < veichulosRenta.length; i++) {
            if (veichulosRenta[i] == null) {
                veichulosRenta[i] = vehiculo;
                return true;
            } 
        }
        return false;
    }

    public void devolverVehiculo() {

    }

}
