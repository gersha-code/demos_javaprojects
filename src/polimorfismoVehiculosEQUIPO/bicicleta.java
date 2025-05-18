package polimorfismoVehiculosEQUIPO;
import java.util.Scanner;
public class bicicleta extends vehiculo {
Scanner scanner=new Scanner(System.in);
    public bicicleta() {
        super(350, 700);
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
        System.out.println("Bicicleta rentada con exito");
       return importe; 
    }

    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    public int devolver() {
        System.out.println("Se descontaron $60 de mantenimiento.");
        return -60;
    }

    
}
