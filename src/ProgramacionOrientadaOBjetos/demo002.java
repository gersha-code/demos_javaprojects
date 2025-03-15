package ProgramacionOrientadaOBjetos;

import java.util.Scanner;

/*
 * 
 */
public class demo002 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu(datosAlumno());

    }

    public static String[] datosAlumno(){

        /*
         * nombre
         * no.control
         * semestre actual
         * cantidad de materias
         * nombre de las materias a cursar
         * estatus
         * promedio (default: -1)
         * 
         */
        String datos[] = new String[7];
        System.out.println("Ingrese los datos del alumno:");
        String nombre = scanner.nextLine();
        System.out.println("Ingresar numero de control: ");
        String noControl = scanner.next();
        System.out.println("Ingresar cantidad de materias a cursar: ");
        String cantidadMaterias = scanner.next();
        System.out.println("Ingresar las materias: ");
        

        datos[0] = nombre;
        datos[1] = noControl;
        datos[2] = "1";
        datos[3] = String.valueOf(true);
        datos[4] = materias(Integer.parseInt(cantidadMaterias));
        datos[5] = "-1";
        return datos;
    }

    public static String materias(int cantidadMaterias){
        String materiasConcat = "";
        scanner.nextLine();
        for (int i = 0; i < cantidadMaterias; i++) {
            System.out.println("Ingrese materia " + (i+1));
            materiasConcat += scanner.nextLine() + ",";
        }
        System.out.println(materiasConcat);

        return materiasConcat;
    }

    public static void menu(String[] datosAlumno){
        
        System.out.println("MENU\n1 Mostrar datos\n2 Cerrar semestre\n3 Reinscribir\n4 Prorroga de semestre\n5 Terminar programa");
        
        while (true) {
            int seleccion = scanner.nextInt();
            switch (datosAlumno) {
                case 1:
                    
                    break;
            
                default:
                    break;
            }
        }
    }

}
