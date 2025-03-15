public class telefono {

    private String titular;
    private int saldoInicial;
    private String contactos[];
    private String contactosDesconocidos[];

    private String contadorContactos[];
    private String contadorDesconocidos[];
    private boolean boton;

    public telefono(String titular, int saldo_inicial) {
        this.titular = titular;
        this.saldoInicial = saldo_inicial;
        this.contactos = new String[20];

        this.boton = true;
    }

    public String buscarContacto(int a){
        return this.contactos[a];
    }

    public String[] mostrarContactos(){
        return this.contactos;
    }
    public void registrarContacto(String contacto){
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] !=null) {
                contactos[i] = contacto;
            }
        }
    }

    // Constructor sobrecargado para contactos
    public telefono(String contactos[]) {
        this.contactos = contactos;
    }

    public String mostrarTitular() {
        // String titular = this.titular;
        return this.titular;
    }

    public int mostrarSaldo() {
        return this.saldoInicial;
    }

    public boolean boton() {
        return this.boton;
    }

    public void cambio() {// case 2
        if (this.boton) {
            this.boton = false;
            System.out.println("Telefono apagado");
        } else {
            this.boton = true;
            System.out.println("Telefono encendido");
        }
    }

    public int saldoActual(){
        return this.saldoInicial;
    }


    //METODOS PARA ABONAR SALDO 1
    public void abonoComun(int saldoInicial) {
        this.saldoInicial += saldoInicial;
    }
    //METODO PARA ABONAR SALDO PERSONALIZADO
    public void abonoPersonalizado(){
        this.saldoInicial += 100;
    }

    

}
