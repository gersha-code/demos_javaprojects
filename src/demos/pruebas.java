package demos;

public class pruebas {

    public static void main(String[] args) {
        String numers = "0123456789";

        int matrix[][] = new int[numers.length()][1];

        for (int i = 0; i < numers.length(); i++) {
            if (i * 2  < numers.length()) {
                System.out.print("  " + (matrix[i][0] = Integer.parseInt(numers.substring(i * 2, i * 2 + 2))));
            }
        }

        //entendimiento de matrices
        
    }
}
