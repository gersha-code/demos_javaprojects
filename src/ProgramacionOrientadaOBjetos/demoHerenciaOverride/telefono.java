package ProgramacionOrientadaOBjetos.demoHerenciaOverride;

public class telefono {
    private String titular;
    private int bateria;
    private boolean boton;
    private String apps[];
    private String contactos[];

    public telefono(String titular) {
        this.titular = titular;
        this.bateria = 100;
        this.boton = false;
        this.apps = new String[20];
        this.contactos = new String[20];
    }

    public boolean encenderTelefono() {
        return this.boton = true;
    }
    
    public boolean apagarTelefono(){
        return this.boton = false;
    }

    public String getTitular() {
        return this.titular;
    }

    public int getBateria() {
        return this.bateria;
    }

    public String[] getApps() {
        return apps;
    }

    public void cargarBateria() {
        if (encenderTelefono() && this.bateria <= 100) {
            this.bateria += 100;
        }

    }

    public void descargarBateria() {
        if (encenderTelefono() && this.bateria >= 0) {
            this.bateria -= 5;

        }
    }

    public String mostrarContactos(int a) {
        if (encenderTelefono() && this.contactos[a] != null) {
            return this.contactos[a];
        }
        return null;
    }
    
    public void prueba(int a){
        System.out.println(a);
        System.out.println("SOY UN TELEFONO NORMAL");
    }

}
