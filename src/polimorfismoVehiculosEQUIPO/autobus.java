package polimorfismoVehiculosEQUIPO;

import java.util.Scanner;

public class autobus extends vehiculo {
    private int cantidadPasajeros;
    Scanner scanner = new Scanner(System.in);

    public autobus() {
        super(2500, 4500);
        this.cantidadPasajeros = 0;
    }

    @Override
    public String toString() {
        return super.toString() + " | Pasajeros:  " + this.cantidadPasajeros;
    }

    @Override
    public double rentar() {
        int importe = 0;
        System.out.println("Arrendatario: ");

        String arrendatario = scanner.nextLine();
        setArrendatario(arrendatario);
        boolean validez = false;
        String desicion, desicion2;
        int dias=0;
        while (validez == false) {
            System.out.println("Cantidad de pasajeros: ");
            desicion = scanner.nextLine();
            System.out.println("Dias que será rentado el auto"); 
            desicion2 = scanner.nextLine();
            if (desicion.matches("[0-9]+") && desicion2.matches("[0-9]+")) {
                this.cantidadPasajeros = Integer.valueOf(desicion);
                dias = Integer.valueOf(desicion2);
                validez = true;            
            }else{
                System.out.println("Cantidad no válida.");
            }
        }

        

        
        if (this.cantidadPasajeros > 30) {
            importe = dias * getCostoDiario() + (50 * (this.cantidadPasajeros - 30));
            System.out.println("Autobús rentado con exito (costo extra)");
            return importe;
        }else{
        importe = dias * getCostoDiario();
            System.out.println("Autobús rentado con exito");
            return importe;}
    }

    @Override
    public int devolver() {
        if (this.cantidadPasajeros > 30) {
            System.out.println("Costo de mantenimiento: $750 y $" + (20 * (this.cantidadPasajeros - 30))+" fueron devueltos a los pasajeros.");
            this.cantidadPasajeros = 0;
            return -750 - (20 * (this.cantidadPasajeros - 30));
        }
        this.cantidadPasajeros = 0;
        System.out.println("Costo de mantenimiento: $750");
        return -750;
    }
}
