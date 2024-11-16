package demos;
public class ahorcado0 {
    public static void main(String[] args) {
        public class ReemplazarLetraPosicionSubstring {
            public static void main(String[] args) {
                String texto = "Hola Mundo";
        
                // Especificar la posición y la nueva letra
                int posicion = 5; // Índice basado en 0
                char nuevaLetra = 'X';
        
                // Construir la nueva cadena
                String resultado = texto.substring(0, posicion) // Parte antes de la posición
                                  + nuevaLetra                 // La nueva letra
                                  + texto.substring(posicion + 1); // Parte después de la posición
        
                System.out.println("Texto original: " + texto);
                System.out.println("Texto modificado: " + resultado);
            }
        }
        
    }


}
