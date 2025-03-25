package polimorfismoVehiculos;
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
    private double costoDiario;
    
    public vehiculo(String placa, String marca, String modelo){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.arrendatario = "CarrosChingones";
        this.costoDiario = 12;
    }
    
    @Override
    public String toString(){
        return this.placa + " | " +this.marca + " | " + this.modelo + " | " + this.arrendatario;
    }



}
