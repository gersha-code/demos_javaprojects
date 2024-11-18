package demos;

import java.util.Arrays;

public class WireframeCube {

    public static void main(String[] args) throws InterruptedException {
        // Define los vértices del cubo en coordenadas 3D
        double[][] vertices = {
            {1, 1, 1}, {-1, 1, 1}, {-1, -1, 1}, {1, -1, 1}, // Frente
            {1, 1, -1}, {-1, 1, -1}, {-1, -1, -1}, {1, -1, -1} // Atrás
        };

        // Define las conexiones entre los vértices para formar líneas
        int[][] edges = {
            {0, 1}, {1, 2}, {2, 3}, {3, 0}, // Frente
            {4, 5}, {5, 6}, {6, 7}, {7, 4}, // Atrás
            {0, 4}, {1, 5}, {2, 6}, {3, 7}  // Conexiones entre frente y atrás
        };

        // Variables para rotación
        double angleX = 0;
        double angleY = 0;

        while (true) {
            // Limpia la pantalla
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Calcula los nuevos vértices proyectados en 2D
            double[][] projected = new double[vertices.length][2];
            for (int i = 0; i < vertices.length; i++) {
                double[] rotated = rotate(vertices[i], angleX, angleY);
                projected[i] = project(rotated);
            }

            // Dibuja las líneas del cubo
            char[][] screen = new char[20][40];
            for (char[] row : screen) {
                Arrays.fill(row, ' ');
            }

            for (int[] edge : edges) {
                int x1 = (int) projected[edge[0]][0];
                int y1 = (int) projected[edge[0]][1];
                int x2 = (int) projected[edge[1]][0];
                int y2 = (int) projected[edge[1]][1];
                drawLine(screen, x1, y1, x2, y2);
            }

            // Imprime la pantalla
            for (char[] row : screen) {
                System.out.println(row);
            }

            // Incrementa los ángulos para rotar
            angleX += 0.1;
            angleY += 0.1;

            // Pausa para animación
            Thread.sleep(100);
        }
    }

    // Rota un punto en el espacio 3D
    private static double[] rotate(double[] point, double angleX, double angleY) {
        double x = point[0];
        double y = point[1];
        double z = point[2];

        // Rotación en X
        double tempY = y * Math.cos(angleX) - z * Math.sin(angleX);
        double tempZ = y * Math.sin(angleX) + z * Math.cos(angleX);
        y = tempY;
        z = tempZ;

        // Rotación en Y
        double tempX = x * Math.cos(angleY) + z * Math.sin(angleY);
        z = -x * Math.sin(angleY) + z * Math.cos(angleY);
        x = tempX;

        return new double[]{x, y, z};
    }

    // Proyecta un punto 3D en un plano 2D
    private static double[] project(double[] point) {
        double distance = 2;
        double factor = 10 / (point[2] + distance);
        double x2D = point[0] * factor + 20;
        double y2D = point[1] * factor + 10;
        return new double[]{x2D, y2D};
    }

    // Dibuja una línea entre dos puntos en una matriz de caracteres
    private static void drawLine(char[][] screen, int x1, int y1, int x2, int y2) {
        int dx = Math.abs(x2 - x1), dy = Math.abs(y2 - y1);
        int sx = x1 < x2 ? 1 : -1, sy = y1 < y2 ? 1 : -1;
        int err = dx - dy;

        while (true) {
            if (x1 >= 0 && x1 < screen[0].length && y1 >= 0 && y1 < screen.length) {
                screen[y1][x1] = '*';
            }
            if (x1 == x2 && y1 == y2) break;
            int e2 = 2 * err;
            if (e2 > -dy) {
                err -= dy;
                x1 += sx;
            }
            if (e2 < dx) {
                err += dx;
                y1 += sy;
            }
        }
    }
}
