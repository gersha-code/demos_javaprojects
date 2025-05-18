package polimorfismoVehiculosEQUIPO;

import java.util.Random;
import polimorfismoVehiculo.renta;

public class agencia {

    private Random random = new Random();
    public double ingresosTotales;
    private vehiculo garage[];

    public agencia(int cantidadVehiculos) {
        this.ingresosTotales = 0;
        this.garage = new vehiculo[cantidadVehiculos];
        fabricaVehiculos();
    }

    public vehiculo[] getGarage() {
        return garage;
    }

    public double getIngresos(){
        return this.ingresosTotales;
    }

    private void fabricaVehiculos() {
        for (int i = 0; i < garage.length; i++) {
            switch (random.nextInt(1, 4)) {
                case 1:
                    auto autoObjeto = new auto();
                    garage[i] = autoObjeto;
                    break;
                case 2:
                    autobus autobusObjeto = new autobus();
                    garage[i] = autobusObjeto;
                    break;
                case 3:
                    bicicleta bicicletaObjeto = new bicicleta();
                    garage[i] = bicicletaObjeto;
                    break;
                default:
                    break;

            }
        }
    }

    public void setIngresosTotales(double ingresosTotales) {
        this.ingresosTotales += ingresosTotales;
    }

}
