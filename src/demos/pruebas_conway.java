package demos;

public class pruebas_conway {
    public static void main(String[] args) {
        String current = "1";  // Número inicial de la serie
        int terms = 14;        // Cantidad de términos de la serie a generar

        System.out.println("Serie de Conway:");
        for (int i = 0; i < terms; i++) {
            System.out.println(current);

            // Generar el siguiente término sin usar StringBuilder
            String next = "";
            int count = 1;

            for (int j = 1; j < current.length(); j++) {
                if (current.charAt(j) == current.charAt(j - 1)) {
                    count++;
                } else {
                    next += count + "" + current.charAt(j - 1);
                    count = 1;
                }
            }

            // Agregar el último grupo
            next += count + "" + current.charAt(current.length() - 1);

            current = next; // Actualizar el término actual
        }
    }


}
