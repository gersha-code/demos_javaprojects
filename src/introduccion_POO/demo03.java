package introduccion_POO;

/*
 * Las colas se manejan en base a los principios de primeras 
 * entradas - primeras salidas, es decir, los elementos son
 * atendidos en base en que llegaron a formarse. Hacer una clase
 * que trabaje con cadenas y que tenga los siguientes atributos
 * y metodos.
 * 
 *      Atributos:
 * Agregar_elemento. Debe llevar como parametro el elemento (la cadena)
 */
public class demo03 {

    static String vector[] = new String[10];
    static int count = 0;

    public static void main(String[] args) {
        for (int i = 0; i < vector.length-1; i++) {
            System.out.println(Agregar_elemento("hola"));
        }
        System.out.println(count);
    }

    public static boolean Agregar_elemento(String cadena) {
        if (vector[vector.length - 1 - count] == null) {
            count++;
            vector[vector.length - 1 - count] = cadena;
            return true;
        } else {
            return false;
        }
    }
}
