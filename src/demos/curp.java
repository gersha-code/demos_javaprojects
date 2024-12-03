package demos;
import java.util.Scanner;

public class curp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre = "Mario Esparza Ruiz".toUpperCase();
        String fecha = "14 10 2001";
        String curp = "";
        String curo_fecha = "";
        for (int i = 0; i < nombre.length(); i++) {
            if (" ".indexOf(nombre.charAt(i)) != -1) {//Cada que encuentre coincidencia con un espacio, entra a la condicion.
                String obtener_primeraLetra = nombre.substring(i, nombre.lastIndexOf(" "));//Variable auxiliar que resguarda el primer apellido.
                String obtener_segundaLetra = nombre.substring(nombre.lastIndexOf(" "));//Varisable auxiliar que resguarda el segundo apellido.
                //System.out.println(obtener_primeraLetra);
                for (int j = 0; j < obtener_primeraLetra.length(); j++) {
                    curp = "" + obtener_primeraLetra.charAt(1);//Aqui concatenamos solo la primera letra, sea vocal o no
                    if ("AEIOU".indexOf(obtener_primeraLetra.charAt(j)) != -1 && curp.length() < 2) {
                        /*
                         * Con este nuevo for J, recorremos toda el primer apellido solamente, que fue guardado en la variable "obtener_primeraLetra"
                         * Y con el if, hacemos lo mismo que en el primer if de arriba, buscar coincidencia de vocales pero solo en el apellido,
                         * entonces solo entra a la conficion cuando encuentra concidencia de vocal y seguido de eso, se concaquetena en la variable
                         * "curp", en donde cuando su tamano sea de 2, entonces ya no podra entrar a la condicon, porque solo queremos la primera vocal
                         */
                        curp += obtener_primeraLetra.charAt(j) + "" +obtener_segundaLetra.charAt(1) + "" + nombre.charAt(0); //Los espacios son como un truco para poder concatenar Strings extraidos de chars
                    
                    }
                }
            }
        }
        System.out.println(curp);
    }
}