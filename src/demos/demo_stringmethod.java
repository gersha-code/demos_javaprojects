package demos;

public class demo_stringmethod {
    public static void main(String[] args) {
        String string = "hola mundo";
        //               0123456789   
        System.out.println("\tCadena Original: " + string);
        /*
         * charAt() 
         * devuelve el caracter en la posicion especificada
         */
        System.out.println("charAt: " + string.charAt(3));
        /*
         * length()
         * Devuelve la longitud de la cadena
         */
        System.out.println("length():  " + string.length());
        /*
         * substring()
         * Devuelve una cadena que es una substring de la original, desde el indice especificado hasata el final. Desde el comienzo hasta
         * terminar la cadena.
         */
        System.out.println("subtring(n): " + string.substring(4));
        System.out.println("subtring(n, m): " + string.substring(0, 4));
        /*
         * indexOf()
         * Devuelve el indice de la primera aparicion de la cadena especificada. Si no encuentra coincidencia regresa -1
         */
        System.out.println("indexOf(String): " + string.indexOf("l"));
        /*
         * equals()
         * es una metodo booleano, regresa true si un string es exacatamente igual a una cadena dada
         */
        System.out.println("equals(): " + string.equals("hola"));

        /*
         * equalsIgnoreCase()
         * Es como el metodo equals, pero ignora si la cadena es mayuscula o minuscula
         */
        System.out.println("equalsIgnoreCase(): " + string.equalsIgnoreCase("hola MUNDO"));
        /*
         * toUpperCase()
         * Convierte todos los caracteres a mayusculas
         */
        System.out.println("toUpperCase(): " + string.toUpperCase());
        /*
         * toLowerCase()
         * Convierte todos los caracteres en minusculas
         */
        System.out.println("toLowerCase(): " + string.toLowerCase());
        /*
         * trim()
         * Simplemente elimina los espacios en blanco
         */
        System.out.println("trim(): " + string.trim());
        /*
         * replace() 
         * remplaza todas las ocurencias de un caracter por otro
         */
        System.out.println("rempace( ):");
    }

}
