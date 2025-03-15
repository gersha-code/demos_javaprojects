package ProgramacionOrientadaOBjetos.telefonosHerenciaEQUIPO;

import java.util.Random;

public class chaifon extends telefono {
    int impuesto;
    boolean estado;

    public chaifon(String titular, int saldo) {
        super(titular);
        this.estado = true;
        this.impuesto = -10;
    }
 
    @Override
    public int abonar() {
        int s = super.abonar() + this.impuesto;
        return s;
    }

    @Override
    public int abonar(int abono){
        int s = super.abonar(abono) + this.impuesto;
        return s;
    }

    public boolean explotar() {
        Random random = new Random();
        if (random.nextInt(0, 10) == 1) {
            return false;
        } else {
            return true;
        }
    }

    public void reparar() {
        if (!estado) {
            this.estado = true;
        }
    }

}
