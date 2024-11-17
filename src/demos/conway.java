package demos;

public class conway {
    public static void main(String[] args) {
        int matrix[][] = new int[100][100];
        show_matrix(matrix);
        }


    public static void show_matrix(int matrix[][]){
        matrix[0][0] = 1;
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if(matrix[i][j] == matrix[i][j-1] ){
                    System.out.println(matrix[i][j]);
                }
                System.out.println();
            }
            
        }
    }
}




