package pruebas;

import java.util.Scanner;

public class juas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double x = leer.nextDouble();
        double y = leer.nextDouble();
        double z = leer.nextDouble();
        double t = 0;
        if (x >= 0 && y >= 0 && z >= 0 && x <= 1000 && y <= 1000 && z <= 1000 ) {
            t = (x + x*(y + Math.pow(z, 2)))/((x+Math.PI)*(y + Math.PI));
        }
        System.out.println(t);
    }
}
