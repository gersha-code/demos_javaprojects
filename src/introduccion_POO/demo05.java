package introduccion_POO;
/*
 * Validar si un numero es par o impar
 */
public class demo05 {

    public static void main(String[] args) {
        System.out.println("Es numero par?");
        System.out.println(par(3));
    }

    public static boolean par(int a){
        if (a%2==0) {
            return true;
        } else {
            return false;
        }
    }


}
