package demos;

public class conway {
    public static void main(String[] args) {
        String actual = "1";
        int contador = 1;
        String siguiente = "";
        String matrix[][] = new String[10][10];
        int x = 1;
        matrix[0][0] = "1";
        for (int i = 0; i < 10; i++) {
            // este for es para recorrer el sentido horizontal
            matrix[i][x] = actual;
          
            System.out.println(matrix[i][x]);
            for (int j = 1; j < actual.length(); j++) {
                // este for es por decirlo de alguna forma, es para recorrer el renglon
                if (actual.charAt(j) == actual.charAt(j - 1)) {
                    contador++;
                } else {
                    siguiente += contador + "" + actual.charAt(j-1);
                    //ese "" es para concatenar un valor int a String
                    contador = 1;
                    // o sea que si entra al else, quiere decir que el numero solo existio una vez
                    // y por eso reinicia el contador a 1
                }
                
                siguiente =+ contador + "" + actual.charAt(actual.length()-1);
                System.out.println(siguiente);
                
                actual = siguiente; // actualiza el termino 
                matrix[i][j] = actual;
                System.out.print(matrix[i][j]);
                x++;
            }
System.out.println();
        }


        /*
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != null) {
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.println();
        }
             */

    }

}
