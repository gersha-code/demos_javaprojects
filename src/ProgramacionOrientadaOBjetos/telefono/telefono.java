package ProgramacionOrientadaOBjetos.telefono;

public class telefono {

    private String titular;
    private int saldoInicial;
    private String contactos[];
    private String contactosDesconocidos[];

    private int contadorContactos[];
    private int contadorDesconocidos[];
    private boolean boton;

    public telefono(String titular, int saldo_inicial) {
        this.titular = titular;_
        this.saldoInicial = saldo_inicial;
        this.contactos = new String[20];
        this.contadorContactos = new int[20];
        this.contactosDesconocidos = new String[20];
        this.contadorDesconocidos = new int[20];
        this.boton = true;
    }

    // sobrecargado para contactos
    public telefono(String contactos[]) {
        this.contactos = contactos;
    }

    public void contactosDesconocidos(String contacto) {
        for (int j = 0; j < this.contactosDesconocidos.length; j++) {
            if (this.contactosDesconocidos[j] != contacto && this.contactosDesconocidos[j] == null) {
                contactosDesconocidos[j] = contacto;
                break;
            }
        }

    }

    public boolean buscarContacto(String contacto) {
        for (int i = 0; i < contactos.length; i++) {
            if (this.contactos[i] != null
                    && this.contactos[i].substring(0, this.contactos[i].indexOf("/")).equals(contacto)) {
                return true;
            }
        }

        return false;
    }

    public void contador(int b) {
        this.contadorContactos[b]++;
    }

    public void contadorDesconocido(int b) {
        this.contadorDesconocidos[b]++;
    }

    public boolean registrarContacto(String contacto) {
        for (int i = 0; i < this.contactos.length; i++) {
            if (this.contactos[i] == null) {
                this.contactos[i] = contacto;
                return true;
            }
        }
        return false;
    }

    public void mostrarContactos() {
        if (this.boton == true) {
            System.out.println("Contactos: ");
            for (int i = 0; i < this.contactos.length; i++) {
                if (this.contactos[i] != null) {
                    System.out.println(this.contactos[i]);
                } else
                    break;
            }
        } else
            System.out.println("Telefono apagado");
    }

    public void historial() {
        if (this.boton == true) {
            System.out.println("Historial de contactos registrados: ");
            for (int i = 0; i < this.contactos.length; i++) {
                if (this.contactos[i] != null) {
                    System.out.println("El contacto " + this.contactos[i] + " ha sido llamado "
                            + this.contadorContactos[i] + " veces");
                }
            }
            System.out.println("\nHistorial de contactos desconocidos: ");
            for (int i = 0; i < this.contactosDesconocidos.length; i++) {
                if (this.contactosDesconocidos[i] != null) {
                    System.out.println("El número " + this.contactosDesconocidos[i] + " ha sido llamado "
                            + this.contadorDesconocidos[i] + " veces");
                }
            }
        } else
            System.out.println("Telefono apagado");
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

    public void cambio() {
        if (this.boton) {
            this.boton = false;
            System.out.println("Telefono apagado");
        } else {
            this.boton = true;
            System.out.println("Telefono encendido");
        }
    }

    public int saldoActual() {
        return this.saldoInicial;
    }

    // METODOS sobrecargados
    public void abono(int saldo) {
        if (saldo >0) {
            this.saldoInicial += saldo;
        } else {
            System.out.println("Valor invalido");
        }
        
    }

    public void abono() {
        this.saldoInicial += 100;
    }

    public void realizarLLamada() {
        this.saldoInicial -= 5;
    }

}
