package ProgramacionOrientadaOBjetos.demoHerenciaOverride;

public class iphone extends telefono {

    public iphone(String titular) {
        super(titular);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void prueba(int a) {
        super.prueba(a);
        System.out.println(a);
        System.out.println("SOY UN IPHONE");
    }

}
