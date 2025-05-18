package polimorfismoVehiculosEQUIPO;

import java.util.Random;

abstract class vehiculo {

    private String placa;
    private String marca;
    private String modelo;
    private String arrendatario;
    private int costoDiario;
    public static Random random = new Random();

    public vehiculo(int valor1, int valor2){
        this.placa = randomPlaca();
        this.marca = randomMarca();
        this.modelo = randomModelo();
        this.arrendatario = null;
        this.costoDiario = random.nextInt(valor1, valor2);
    }

    abstract double rentar();
    abstract int devolver();

    @Override
    public String toString(){
        return this.placa + " | " +this.marca + " | " + this.modelo + " | " + this.arrendatario;
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

    private String randomMarca() {
        String[] marcas = { "BMW", "FERRARI", "TOYOTA", "FORD", "RENAULT", "VOLVO", "HYUNDAI", "SEAT", "BUGATTI","LAMBORGHINI", "MERCEDES", "PORSCHE", "MASERATI", "TESLA", "JAGUAR" };
        return marcas[random.nextInt(0, marcas.length)];
    }
    private String randomModelo() {
        String[] modelos = { "SERIE 3", "SERIE X5", " COROLLA", "SUPRA" + "MUSTANG", "XC760", "IBIZA", "S90", "DIVO" };
        return modelos[random.nextInt(0, modelos.length)];
    }
    private String randomMarcaBicicleta() {
        String[] marcas = { "Specialized", "Trek", "Giant", "Canyon", "Biachi" };
        return marcas[random.nextInt(0, marcas.length)];
    }

    public String getArrendatario(){
        return this.arrendatario;
    }
    public int getCostoDiario(){
        return this.costoDiario;
    }

    public void setArrendatario(String arrendatario){
        this.arrendatario = arrendatario;
    }
    public String getPlaca(){
        return this.placa;
    }
    
}
