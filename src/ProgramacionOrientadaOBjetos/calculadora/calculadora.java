package ProgramacionOrientadaOBjetos.calculadora;

public class calculadora {
    private int valor_1;
    private int valor_2;

    // constructor
    public calculadora(int valor_1, int valor_2) {
        this.valor_1 = valor_1;
        this.valor_2 = valor_2;
        System.out.println("OBjeto existiendo" + valor_1 + "  " + valor_2);
    }

    public int sumar(int valor_1, int valor_2) {
        int suma = valor_1 + valor_2;
        return suma;
    }

    public int resta(int valor_1, int valor_2) {
        int suma = valor_1 - valor_2;
        return suma;
    }

    public int multiplicar(int valor_1, int valor_2) {
        int multiplicar = valor_1 * valor_2;
        return multiplicar;
    }

    public int dividir(int valor_1, int valor_2) {
        if (valor_2 != 0) {
            int dividir = valor_1 / valor_2;
            return dividir;
        }
        System.out.println("valor no definido");
        return 0;
        
    }

}
