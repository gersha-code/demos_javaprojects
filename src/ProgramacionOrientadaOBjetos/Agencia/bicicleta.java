package ProgramacionOrientadaOBjetos.Agencia;

public class bicicleta extends vehiculo{

    public bicicleta(){
        super(random.nextInt(350, 700), randomMarcaBicicleta());
    }

    public String toString(){
        return super.toString() + "]";
    }

    public int rentar(int dias, String arrendatario){
        setArrendatario(arrendatario);
        return getCostoDiario()*dias;
    }
    
    private static String randomMarcaBicicleta() {
        String[] marcas = { "Specialized", "Trek", "Giant", "Canyon", "Biachi" };
        return marcas[random.nextInt(0, marcas.length)];
    }

    public void devolver(){

    }
}
