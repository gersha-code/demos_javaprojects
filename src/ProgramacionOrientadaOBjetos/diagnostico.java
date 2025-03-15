package ProgramacionOrientadaOBjetos;

import java.util.Scanner;

public class diagnostico {

    /*
     * Hernandez Justiniani
     * Escobar Meza
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Nombre del alumno: ");
        String nombre = leer.nextLine();
        System.out.print("Número de control: ");
        String numeroControl = leer.nextLine();
        int semestre;
        do {
            System.out.print("Semestre actual (1-12): ");
            semestre = leer.nextInt();
        } while (semestre < 1 || semestre > 12);
        
        System.out.print("Cantidad de materias a cursar: ");
        int cantidadMaterias = leer.nextInt();
        leer.nextLine();
        String[] datos = new String[cantidadMaterias];
        for (int i = 0; i < cantidadMaterias; i++) {
            System.out.print("Nombre de la materia " + (i + 1) + ": ");
            datos[i] = leer.nextLine();
        }
        
        boolean estatus = true;
        double promedio = -1;
        int opcion;
        
        do {
            System.out.println("\nMENU");
            System.out.println("1. Mostrar datos");
            System.out.println("2. Cerrar semestre");
            System.out.println("3. Reinscribir");
            System.out.println("4. Prorroga de semestre");
            System.out.println("5. Terminar programa");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();
            leer.nextLine();
            
            switch (opcion) {
                case 1:
                    mostrarDatos(nombre, numeroControl, semestre, estatus, datos, cantidadMaterias, promedio);
                    break;
                case 2:
                    promedio = cerrarSemestre(leer, nombre, numeroControl, semestre, estatus, datos, cantidadMaterias);
                    semestre++;
                    if (semestre > 12){
                        estatus = false;
                    } 
                    //datos = new String[0];
                    datos = null;
                    cantidadMaterias = 0;
                    break;
                case 3:
                    if (!estatus) {
                        System.out.println("No puedes reinscribirte, estatus en baja.");
                    } else {
                        System.out.print("Cantidad de materias a cursar: ");
                        cantidadMaterias = leer.nextInt();
                        leer.nextLine();
                        datos = new String[cantidadMaterias];
                        for (int i = 0; i < cantidadMaterias; i++) {
                            System.out.print("Nombre de la materia " + (i + 1) + ": ");
                            datos[i] = leer.nextLine();
                        }
                    }
                    break;
                case 4:
                    //estatus = true;
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Numero de control: " + numeroControl);
                    System.out.println("Semestre actual: " + semestre);
                    System.out.println("Estatus activo.");
                    break;
                case 5:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 5);        
    }
    
    public static void mostrarDatos(String nombre, String numeroControl, int semestre, boolean estatus, String[] datos, int cantidadMaterias, double promedio) {
        System.out.println("\nDATOS DEL ALUMNO");
        System.out.println("Nombre: " + nombre);
        System.out.println("Numero de control: " + numeroControl);
        System.out.println("Semestre actual: " + semestre);
        if (estatus) {
            System.out.println("Estatus: Activo");
        } else {
            System.out.println("Estatus: Baja");
        }
        if (cantidadMaterias > 0) {
            System.out.println("Materias inscritas:");
            for (int i = 0; i < datos.length; i++) {
                System.out.println("- " + datos[i]);
            }
            if (promedio == -1) {
                System.out.println("Promedio semestre anterior: Sin promedio reciente");
            } else {
                System.out.println("Promedio semestre anterior: " + promedio);
            }
        } else {
            System.out.println("Alumno no inscrito en el presente semestre");
        }
    }
    
    public static double cerrarSemestre(Scanner scanner, String nombre, String numeroControl, int semestre, boolean estatus, String[] datos, int cantidadMaterias) {
        System.out.println("\nCierre de semestre");
        System.out.println("Nombre: " + nombre);
        System.out.println("Número de control: " + numeroControl);
        System.out.println("Semestre actual: " + semestre);
        double suma = 0;
        if (cantidadMaterias > 0) {
            for (int i = 0; i < cantidadMaterias; i++) {
                int calificacion;
                do {
                    System.out.print("Ingresa calificación de " + datos[i] + ": ");
                    calificacion = scanner.nextInt();
                } while (calificacion < 0 || calificacion > 100);
                
                if (calificacion >= 70) {
                    suma += calificacion;
                }
            }
            return suma / cantidadMaterias;
        }
        return -1; 
    }
}


