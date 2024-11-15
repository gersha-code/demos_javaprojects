package metodos_maraton;

public class demo01 {

    public static void main(String[] args) {
        System.out.println(perfecto(12));
    }

    public static char perfecto(int a){
        int suma = 0;
        for (int i = 1; i <=a; i++) {   
            if (a%i == 0 ) {
                suma +=i;
                System.out.println(a/i);
            }
        }
        //System.out.println(suma);

        if (suma == a) {
            //perfecto
            return 'P';
        }  
        if (suma > a) {
            //abundante
            return 'A';
        }
        if (suma < a) {
            //deficiente
            return 'D';
        }
       return 'X';
    }
}
