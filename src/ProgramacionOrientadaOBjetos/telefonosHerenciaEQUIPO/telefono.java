package ProgramacionOrientadaOBjetos.telefonosHerenciaEQUIPO;

import java.util.Scanner;

public class telefono {

    private String titular;
    private int bateria;
    private boolean boton;
    private int saldo;

    public telefono(String titular) {
        this.titular = titular;
        this.bateria = 100;
        this.boton = true;
        this.saldo = 0;
    }

    public void prenderApagar() {
        if (boton) {
            this.boton = false;
        } else {
            this.boton = true;
        }
    }

    // Metodo para sobreescribir
    public void gastoBateria() {
        if (this.bateria >= 0) {
            this.bateria -= 5;
        } else {
            System.out.println("Tu bateria se termino.");
        }
    }

    // Metodo para sobreescargar
    public void cargarBateria() {
        if (this.bateria <= 100) {
            this.bateria = 100;
        } else {
            System.out.println("La bateria ya esta al 100%");
        }

    }

    public String getTitular() {
        return titular;
    }

    public int getBateria() {
        return bateria;
    }

    public boolean isBoton() {
        return boton;
    }

    public int getSaldo() {
        return saldo;
    }

    public int abonar() {
        return this.saldo += 100;
    }

    public int abonar(int cantidad) {
        return this.saldo += cantidad;
    }

    public void Llamar() {
        if (this.saldo >= 5) {
            System.out.println("LLamada realizada.");
            this.saldo -= 5;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

}
