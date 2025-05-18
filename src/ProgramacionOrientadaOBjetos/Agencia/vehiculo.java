package ProgramacionOrientadaOBjetos.Agencia;

import java.util.Random;

public abstract class vehiculo {
    public static Random random = new Random();

    private String placa;
    private String marca;
    private String modelo;
    private String arrendatario;
    private int costoDiario;

    public vehiculo(int costoDiario) {
        this.placa = randomPlaca();
        this.marca = randomMarca();
        this.modelo = randomModelo();
        this.arrendatario = null;
        this.costoDiario = costoDiario;
    }

    public vehiculo(int costoDiario, String marca) {
        this.placa = randomPlaca();
        this.marca = marca;
        this.modelo = randomModelo();
        this.arrendatario = null;
        this.costoDiario = costoDiario;
    }
    abstract public int rentar(int dias, String arrendatario);

    abstract public void devolver();

    @Override
    public String toString() {
        return "[" + this.placa + "]////[" + this.marca + " | " + this.modelo + " | " + this.arrendatario;
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
        String[] marcas = { "BMW", "FERRARI", "TOYOTA", "FORD", "RENAULT", "VOLVO", "HYUNDAI", "SEAT", "BUGATTI",
                "LAMBORGHINI", "MERCEDES", "PORSCHE", "MASERATI", "TESLA", "JAGUAR" };
        return marcas[random.nextInt(0, marcas.length)];
    }

    private String randomModelo() {
        String[] modelos = { "SERIE 3", "SERIE X5", " COROLLA", "SUPRA" + "MUSTANG", "XC760", "IBIZA", "S90", "DIVO" };
        return modelos[random.nextInt(0, modelos.length)];
    }

    public int getCostoDiario() {
        return costoDiario;
    }

    public void setArrendatario(String arrendatario) {
        this.arrendatario = arrendatario;
    }

    public String getArrendatario() {
        return arrendatario;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    

    

    


}
