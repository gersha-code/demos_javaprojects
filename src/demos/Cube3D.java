package demos;

public class Cube3D {

    public static void main(String[] args) throws InterruptedException {
        double[][] cubeVertices = {
                { 1, 1, 1 }, { -1, 1, 1 }, { -1, -1, 1 }, { 1, -1, 1 },
                { 1, 1, -1 }, { -1, 1, -1 }, { -1, -1, -1 }, { 1, -1, -1 }
        };
        while (true) {
            for (double[] vertex : cubeVertices) {
                double x = vertex[0];
                double y = vertex[1];
                double z = vertex[2];
                // Proyección en 2D para la terminal
                double x2D = x / (z + 3);
                double y2D = y / (z + 3);
                // Imprime el punto en la pantalla
                System.out.printf("\033[H\033[2J"); // Limpia la pantalla
                System.out.printf("\033[%d;%dH*", (int) (y2D * 10 + 12), (int) (x2D * 20 + 40));
            }
            Thread.sleep(1000); // Control de la velocidad
        }
    }
}
