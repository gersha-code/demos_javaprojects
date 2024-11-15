package demos;

public class demo_examen02 {
    public static void main(String[] args) {
        int n = 4;
        String matrix[][] = new String[(n*2)-1][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                
                System.out.print(matrix[matrix.length-i][matrix.length-j] + " ");
            }
            System.out.println();
        }
    }
}
