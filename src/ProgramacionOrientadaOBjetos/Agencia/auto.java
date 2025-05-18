package ProgramacionOrientadaOBjetos.Agencia;

public class auto extends vehiculo{

    private String color;
    private int kilometraje;

    public auto(){
        super(random.nextInt(900, 2000));
        this.color = randomColor();
        this.kilometraje = random.nextInt(6000);
    }

    @Override
    public String toString(){
        return super.toString() + "|" + this.color + "|" + this.kilometraje + "km" + "]";
    }
    

    public int rentar(int dias, String arrendatario){
        setArrendatario(arrendatario);
        return dias*getCostoDiario(); 
    }

    public void devolver(){

    }

    private String randomColor() {
        String colores[] = { "ROJO", "AZUL", "VERDE", "VIOLETA", "BLANCO" };
        return colores[random.nextInt(colores.length)];
    }

}
