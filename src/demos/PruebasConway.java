package demos;

public class PruebasConway {

    public static void main(String[] args) {
        String initialTerm = "1";  // Número inicial de la serie
        int terms = 14;           // Cantidad de términos a generar

        System.out.println("Serie de Conway:");
        generateConwaySeries(initialTerm, terms);
    }


    public static void generateConwaySeries(String initialTerm, int terms) {
        String current = initialTerm;
        String matrix[][] = new String[100][100];
        fori
        for (int i = 0; i < terms; i++) {

            for (int j = 1; j < current.length(); j++) {
                System.out.println(current);
                current = generateNextTerm(current);
                matrix[i][j] = current;
            }
        }
    }

    public static String generateNextTerm(String current) {
        String next = "";  // Usamos una cadena vacía para construir el siguiente término
        int count = 1;

        for (int j = 1; j < current.length(); j++) {
            if (current.charAt(j) == current.charAt(j - 1)) {
                count++;
            } else {
                next += count + "" + current.charAt(j - 1);  // Concatenamos el conteo y el carácter
                count = 1;
            }
        }

        // Agregar el último grupo
        next += count + "" + current.charAt(current.length() - 1);

        return next;
    }
}
