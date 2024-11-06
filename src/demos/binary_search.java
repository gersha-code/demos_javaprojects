package demos;

public class binary_search {
    public static void main(String[] args) {
        int search = 15;
        int elements[] = new int[8];
        System.out.println("\t>Elementos");
        for (int i = 0; i < elements.length; i++) {
            elements[i] = i;
            System.out.print(elements[i] + "\t");
        }
        // binary search
        int bot = 0;
        int top = elements.length - 1;
        int mid;
        int result = -1;
        while (bot <= top) {
            mid = (bot + top) / 2;
            if (elements[mid] ==  search) {
                result = mid;
                break;
            }
            if (elements[mid] < search) {
                bot = mid + 1;
            } else {
                top = mid - 1;
            }            
        }
        if (result == -1) {
            System.out.println("El valor no fue encontrado");
        } else { 
            System.out.println("El valor fue encontrado");
        }

    }
}
