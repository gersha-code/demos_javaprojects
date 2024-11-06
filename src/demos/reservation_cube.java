package demos;
import java.util.Scanner;
public class reservation_cube {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        int selection = 0;
        String matrix[][] = new String[4][5];
        String location;
        String reservation;
        do {
            System.out.println("MENU\n\t1 RESERVAR\n\t2 LIBERAR\n\t3 CONSULTAR CUBICULOS\n\t4 VERIFICAR RESERVACION\n\t5 Cubiculos libres");
            if (scanner.hasNextInt() && selection >=0 && selection <=10) { // .hasNextInt() verifica si la entrada en un entero
                selection = scanner.nextInt();

                switch (selection) {
                    case 1:
                        System.out.println("RESERVAR\nIngrese la coordenadas (a,b)");
                        location = scanner.next();
                        x = Integer.parseInt(location.substring(0, location.indexOf(',')));
                        y = Integer.parseInt(location.substring(location.indexOf(',') + 1));
                        if (x >= 0 && x < matrix[0].length && y >= 0 && y < matrix.length && matrix[x][y] == null) {
                            System.out.println("Ingrese nombre para reservar:");
                            reservation = scanner.next().toUpperCase();
                            matrix[x][y] = reservation;
                        } else {
                            System.out.println("Cubiculo ocupado o inexistente");
                        }
                        break;
                    case 2:
                        System.out.println("LIBERAR\nIngrese la coordenada a liberar (a,b)");
                        location = scanner.next();
                        x = Integer.parseInt(location.substring(0, location.indexOf(',')));
                        y = Integer.parseInt(location.substring(location.indexOf(',') + 1));
                        if (x >= 0 && x < matrix[0].length && y >= 0 && y < matrix.length) {
                            matrix[x][y] = null;
                        } else {
                            System.out.println("Ubicacion inexistente");
                        }
                        break;
                    case 3: 
                        for (int i = 0; i < matrix.length; i++) {
                            for (int j = 0; j < matrix[i].length; j++) {
                                System.out.print("[" + matrix[i][j] + "]\t");
                            }
                            System.out.println("");
                        }
                        break;
                    case 4:
                        System.out.println("VERIFICAR RESERVACION\nIngrese nombre:");
                        reservation = scanner.next().toUpperCase();
                        boolean found = false;
                        for (int i = 0; i < matrix.length; i++) {
                            for (int j = 0; j < matrix[i].length; j++) {
                                if (matrix[i][j] != null && matrix[i][j].equalsIgnoreCase(reservation)) {
                                    System.out.println(
                                            reservation + " tiene reservado el cubiculo (" + i + ", " + j + ")");
                                    found = true;
                                    break;
                                }
                            }
                            if (found)
                                break; // rompe el ciclo en cuanto lo encuentre
                        }
                        if (!found) {
                            System.out.println(reservation + " No ha reservado ningun cubiculo");
                        }
                        break;

                        case 5:
                        System.out.println("Cubiculos libres");
                        for (int i = 0; i < matrix.length; i++) {
                            for (int j = 0; j < matrix[i].length; j++) {
                                if (matrix[i][j] == null) {
                                    System.out.print("[" + i + "," + j + "]\t");
                                }
                            
                            }
                        }
                    case 10:
                        System.out.println("Programa finalizado");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                        throw new AssertionError();
                }
            }else {
                System.out.println("ERROR: La entrada no es valida");
                
            } 
        } while (selection != 10);
    }
}