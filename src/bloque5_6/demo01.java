package bloque5_6;

public class demo01 {

    public static void main(String[] args) {
        try { // Aqui queremos detectar la excepcion
            int enteros[] = new int[10];
            enteros[12] = 3;
            metodo(10);
        } catch (ArrayIndexOutOfBoundsException ex) { // no toma este catch
            System.out.println(ex.toString());
            //System.out.println("Intento de accesar fuera del arreglo\n");
        } catch (NegativeArraySizeException ex) { // No toma este catch
            System.out.println("No hay dimensiones negativas en arreglos\n");
        } catch (ArithmeticException ex) {
            System.out.println("Intento de division entre cero\n");
        }

        System.out.println("De regreso a ejecucion normal despues de la excepcion\n");
    }

    public static void metodo(int x) {
        int z = 0;
        System.out.println(x / z);
    
    }
}
