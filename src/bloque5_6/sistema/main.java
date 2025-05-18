package bloque5_6.sistema;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese usuario:");
        String user = scanner.next();
        System.out.println("Ingrese password:");
        String password = scanner.next();
        
        usuario usu = new usuario(user, password);

        System.out.println("Cuenta creada con exito!\nIngrese sus datos nuevamente " + usu.getUser());
        while (true) {
            System.out.println("Ingrese password: ");
            password = scanner.next();
            try {
                if (usu.usuario(password)) {
                    System.out.println("Ingreso exitoso!");
                    break;
                }
            } catch (exepcion_deAcceso e) {
                System.out.println(e.getMessage());
                break;
            }
            System.out.println("Acceso denegado...");
        }
    }
}

class usuario {
    private String user;
    private String password;
    private int count;

    public usuario(String user, String password) {
        this.password = password;
        this.user = user;
        this.count = 0;
    }

    public boolean usuario(String passsword) throws exepcion_deAcceso {
        if (this.password.equals(passsword)) {
            return true;
        }
        this.count++;
        if (count == 3) {
            throw new exepcion_deAcceso("Violacion de acceso");
        }
        return false;
    }

    public String getUser() {
        return this.user;
    }
}

class exepcion_deAcceso extends Exception {
    public exepcion_deAcceso(String mensaje) {
        super(mensaje);
    }
}
