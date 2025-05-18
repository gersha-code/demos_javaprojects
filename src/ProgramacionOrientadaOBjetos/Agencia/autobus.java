package ProgramacionOrientadaOBjetos.Agencia;

public class autobus extends vehiculo{

    private int cantidadPasajeros;
    
    public autobus() {
        super(random.nextInt(2500, 4500));
        this.cantidadPasajeros = 0;
    }

    @Override
    public String toString(){
        return super.toString() + "|" + "Cantidad de pasajeros: " + this.cantidadPasajeros + "]";
    }

    public int rentar(int dias, String arrendatario){
        setArrendatario(arrendatario);
        return getCostoDiario()*dias;
    }

    public void devolver(){

    }


    

}
