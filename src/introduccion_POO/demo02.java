package introduccion_POO;

public class demo02 {
    public static void main(String[] args) {
        System.out.println("El factorial: " + factorial(0, 5));
    }

    public static int factorial(int a, int b){
        int fact = 1;
        for (int i = 1; i <= b; i++) {
            fact *= i;
            //System.out.println(fact);
        }
        return fact;
    }
}
