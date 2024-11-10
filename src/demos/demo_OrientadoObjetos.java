package demos;

public class demo_OrientadoObjetos {
    public static void main(String[] args) {
        //void simboliza que el metodo hace algo, pero no regresa nada
    }

    public static int sumar(){
        int r = 3;
        return r;
    }


    public static void restar(){
        if (true) {
            return;
        }
        System.out.println(""); //ya no llega a este metodo por el return
    }

    /*
     * El metodo puede recibir y regresar datos
     * 
     * Arguemento: es el elemento con el cual se pide la ejecucion de un metodo metodo(argumento1, argimento2):
     * Parametro: es la variable en la cual se copia el valor de un argumento dentro del metodo
     *      public static void mostrar(int parametro1. int parametro2){
     * }
     */

}
