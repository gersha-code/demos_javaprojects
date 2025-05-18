package ProgramacionOrientadaOBjetos.Agencia;

import java.util.Random;

public class agencia {
    private vehiculo garage[];
    private int ingresosTotales;

    public agencia(int cantidadAutos) {
        this.garage = new vehiculo[cantidadAutos];
        this.ingresosTotales = 0;
        llenadoGarage();
    }

    public vehiculo[] getGarage() {
        return garage;
    }

    private void llenadoGarage() {
        for (int i = 0; i < garage.length; i++) {
            switch (vehiculo.random.nextInt(1, 4)) {
                case 1:
                    garage[i] = new auto();
                    break;
                case 2:
                    
                    garage[i] = new autobus();
                    break;
                case 3:
                    garage[i] = new bicicleta();
                    break;
            }
        }
    }

    public int getIngresosTotales() {
        return ingresosTotales;
    }

    public void setIngresosTotales(int ingresosTotales) {
        this.ingresosTotales = ingresosTotales;
    }

    public int vehiculosDisponibles(){
        int contadorVehiculos = 0;
        for (int i = 0; i < garage.length; i++) {
            if (garage[i].getArrendatario() == null) {
                contadorVehiculos++;
            }
        }
        return contadorVehiculos;
    }

    public int vehiculosRentados(){
        int contadorVehiculos = 0;
        for (int i = 0; i < garage.length; i++) {
            if (garage[i].getArrendatario() != null) {
                contadorVehiculos++;
            }
        }
        return contadorVehiculos;
    }

    public vehiculo mostrarVehiculos(int vehiculo){
            return garage[vehiculo];
    }

}
