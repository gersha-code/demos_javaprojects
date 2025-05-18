package polimorfismoVehiculo;

import java.util.Random;

/*
 * Una clase abstract no se puede instanciar directamente, es decir, no se puede crear objetos de ella. Se utiliza 
 * como una plantilla para que otras clases la hereden y completen su funcionalidad. 
 * 
 * Puede tener metodos sin implementacion obligatoria y metodos con implementacion (abstrac metodo). 
 */
abstract class vehiculo {

    private String placa;
    private String marca;
    private String modelo;
    private String arrendatario;
    
    public vehiculo(String placa, String marca, String modelo, String arrendatario){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.arrendatario = arrendatario;
        
    }
    
    @Override
    public String toString(){
        return this.placa + " | " +this.marca + " | " + this.modelo + " | " + this.arrendatario;
    }
}
