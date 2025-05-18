package polimorfismoVehiculosEQUIPO;

import java.util.Random;
import java.util.Scanner;


public class auto extends vehiculo {
    private int kilometraje;
    private String color;
    static Scanner scanner = new Scanner(System.in);
    
    public auto() {
        super(900, 2000);
        this.kilometraje = random.nextInt(1000);
        this.color = randomColor();
        
    }

    @Override
    public double rentar(){
        System.out.println("Arrendatario: ");
        String arrendatario = scanner.nextLine();
        setArrendatario(arrendatario);
       boolean validez = false;
        String desicion;
        int dias=0;
        while (validez == false) {
            System.out.println("Dias que será rentado el auto"); 
            desicion = scanner.nextLine();
            if (desicion.matches("[0-9]+")) {
                dias = Integer.valueOf(desicion);
                validez = true;            
            }else{
                System.out.println("Cantidad no válida.");
            }
        }
        double importe= dias*getCostoDiario();
        System.out.println("Auto rentado con exito");
       return importe; 
    }

    @Override
    public int  devolver(){
        System.out.println("$500 de mantenimiento");
        return -500;
    }
    
    @Override
    public String toString(){
        return super.toString() + " | " + this.color + " | " + this.kilometraje + "km";
    }

    private String randomColor(){
        String colores[] = {"ROJO", "AZUL", "VERDE", "VIOLETA", "BLANCO"};
        return colores[random.nextInt(colores.length)];
    }

}
