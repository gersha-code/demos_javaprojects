package ProgramacionOrientadaOBjetos;
import java.util.Scanner;

public class demo001 {
public class proyectoDiagnosticoPOO {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String datos[] = pedir_datosAlumno();
        menu(datos);
    }

    public static void menu(String[] datos) {
        int semestre = -1;
        while (true) {
            System.out.println(
                    "MENU\n1 Mostrar datos\n2 Cerrar semestre\n3 Reinscribir\n4 Prorroga de semestre\n5 Terminar programa");
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    mostrar_datos(datos);
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Ingrese datos del alumno: ");
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        }
    }

    public static String[] pedir_datosAlumno() {

        boolean estatus = true;
        String datos[] = new String[5];
        System.out.println("Ingrese nombre del alumno: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese numero de control: ");
        String noControl = scanner.next();
        System.out.println("Cantidad de materias a cursar: ");
        String noMaterias = scanner.next();
        System.out.println("Ingrese nombre de las materias: ");

        datos[0] = nombre;
        datos[1] = noControl;
        datos[2] = "1";
        datos[3] = String.valueOf(estatus);
        datos[4] = noMaterias;
        datos[5] = materias(Integer.parseInt(noMaterias));
        datos[6] = promedio(datos);
        return datos;
    }

    public static int calificaciones(String datos[]) {
        System.out.println("Ingrese calificaciones: ");
        for (int i = 0; i < datos.length; i++) {
            
        }
        return 1;
    }

    public static String promedio(String datos[]) {
        return "2";
    }

    public static String materias(int materias) {
        scanner.nextLine();
        String con = "";
        for (int i = 0; i < materias; i++) {
            System.out.println("Ingrese materia " + (i + 1));
            con = scanner.nextLine().concat(", " + con); // En esta linea concatenamos todas las materias en un solo
                                                         // String y separamos con una coma para luego poder extraer.
        }
        System.out.println(con);
        return con;
    }

    public static void mostrar_datos(String datos[]) {
        System.out.println(">>>>>Datos");
        System.out.println("Nombre del alumno: " + datos[0] + "\nNumero de control: " + datos[1]
                + "\nSemestre que cursa: " + datos[2] + "\nEstatus: " + datos[3] + "\nMaterias cursando: ");

        // Extraer las materias en cadenas.
        int inicio = 0;
        int fin = 0;
        while (inicio < datos[4].length()) {
            for (int i = 0; i < datos[4].length(); i++) {
            }
            fin = datos[4].indexOf(",", inicio);
            if (fin == -1) {
                fin = datos[4].length();
            }
            System.out.println(datos[4].substring(inicio, fin).trim());
            inicio = fin + 1;
        }

    }


}
}