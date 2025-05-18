package polimorfismoVehiculo;

import java.util.Random;

public class test {

    public static void main(String[] args) {
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
        System.out.println(placa);
    }
}
