package polimorfismoVehiculo;

import java.util.Random;

public class agencia {
    public static Random random = new Random();
    public double ingresosTotales;
    
    private vehiculo veichulosRenta[];
    private renta garage[];

    public vehiculo[] getVeichulosRenta() {
        return veichulosRenta;
    }

    public agencia(int vehiculosDisponibles) {
        this.veichulosRenta = new vehiculo[vehiculosDisponibles];
        this.garage = new vehiculo[vehiculosDisponibles];
    }

    public boolean rentarVehiculo(auto vehiculo, int dias) { // Auto sobrecarga
        for (int i = 0; i < veichulosRenta.length; i++) {
            if (veichulosRenta[i] == null) {
                veichulosRenta[i] = vehiculo;
                this.ingresosTotales += this.garage[i].rentar(i);
                //this.ingresosTotales += vehiculo.rentar(dias); //Metodo de interfaz P O L I M O R F I S M O
                return true;
            }
        }
        return false;
    }

    public boolean rentarVehiculo(autobus vehiculo, int dias) { // Autobus sobrecarga
        for (int i = 0; i < veichulosRenta.length; i++) {
            if (veichulosRenta[i] == null) {
                veichulosRenta[i] = vehiculo;
                this.ingresosTotales += vehiculo.rentar(dias); //Metodo de interfaz P O L I M O R F I S M O
                return true;
            }
        }
        return false;
    }

    public boolean rentarVehiculo(bicicleta vehiculo, int dias) { // Bicicleta Sobrecarga
        for (int i = 0; i < veichulosRenta.length; i++) {
            if (veichulosRenta[i] == null) {
                veichulosRenta[i] = vehiculo;
                this.ingresosTotales += vehiculo.rentar(dias); //Metodo de interfaz P O L I M O R F I S M O
                return true;
            }
        }
        return false;
    }

    private String randomPlaca() {
        Random random = new Random();
        String placa = "";
        for (int index = 0; index < 3; index++) {
            char letra = (char) (random.nextInt('A', 'Z'));
            placa += letra;
        }
        placa += "-";

        for (int i = 0; i < 3; i++) {
            int numero = random.nextInt(9);
            placa += numero;
        }
        placa += "-";
        for (int index = 0; index < 3; index++) {
            char letra = (char) (random.nextInt('A', 'Z'));
            placa += letra;
        }
        return placa;
    }

    public String randomMarca() {
        String[] marcas = { "BMW", "FERRARI", "TOYOTA", "FORD", "RENAULT", "VOLVO", "HYUNDAI", "SEAT", "BUGATTI",
                "LAMBORGHINI", "MERCEDES", "PORSCHE", "MASERATI", "TESLA", "JAGUAR" };
        return marcas[random.nextInt(0, marcas.length)];
    }

    public String randomModelo() {
        String[] modelos = { "SERIE 3", "SERIE X5", " COROLLA", "SUPRA" + "MUSTANG", "XC760", "IBIZA", "S90", "DIVO" };
        return modelos[random.nextInt(0, modelos.length)];
    }

    public String randomMarcaBicicleta(){
        String[] marcas = {"Specialized", "Trek", "Giant", "Canyon", "Biachi"};
        return marcas[random.nextInt(marcas.length)];
    }

    public void crearAuto() { // Metodo para crear autos
        Random random = new Random();
        for (int j = 0; j < garage.length; j++) {
            if (this.garage[j] == null) {
                auto autoObjeto = new auto(randomPlaca(), randomMarca(),randomModelo(),random.nextInt(50000), "Sin arrendatario");
                this.garage[j] = autoObjeto;
                break;
            }
            //break;
        }
    }

    public void crearAutobus(){
        Random random = new Random();
        for (int j = 0; j < garage.length; j++) {
            if (this.garage[j] == null) {
                autobus autoObjeto = new autobus(randomPlaca(), randomMarca(),randomModelo(),random.nextInt(50000), "Sin arrendatario");
                this.garage[j] = autoObjeto;
                break;
            }
            //break;
        }
    }
    
    public void crearBicicleta(){
        for (int j = 0; j < garage.length; j++) {
            if (this.garage[j] == null) {
                bicicleta autoObjeto = new bicicleta(randomPlaca(), randomMarcaBicicleta(),randomModelo(), "Sin arrendatario");
                this.garage[j] = autoObjeto;
                break;
            }
            //break;
        }
    }

    

    public void setVeichulosRenta(vehiculo[] veichulosRenta) {
        this.veichulosRenta = veichulosRenta;
    }

    public vehiculo[] getGarage() {
        return garage;
    }

    public double getIngresosTotales() {
        return ingresosTotales;
    }


    

    
}
