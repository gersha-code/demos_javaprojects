package bloque5_6;

public class demo02 {
    public static void main(String[] args) {
        verificarEdad(12);
        System.out.println("prueba");
    }

    public static void verificarEdad(int edad){
        int a = 0;
 
            if (edad <18) {
                throw new IllegalArgumentException("Debes ser mayor de edad");
            } else {
                System.out.println("Acceso permitido.");
            } 
    }

    public String toString(){
        return "ERROR";
    }
}
