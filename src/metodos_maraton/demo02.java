package metodos_maraton;

public class demo02 {

    public static void main(String[] args) {
        // System.out.println(d("010101"));
        System.out.println(decimal(20));
        // System.out.println(binario("01001111"));
    }

    public static boolean d(String cadena) {
        int count = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if ("01".indexOf(cadena.charAt(i)) != -1) {
            } else {
                return false;
            }
        }
        return true;
    }

    public static int binario(String cadena) {
        int binario = Integer.parseInt(cadena);
        int valor = 0;
        if (d(cadena)) {
            for (int index = 0; index < cadena.length(); index++) {
                if (cadena.charAt(index) == '1') {
                    valor += Math.pow(2, cadena.length() - 1 - index);
                }

            }
        }
        return valor;
    }

    public static String decimal(int numero) {
        String cad = "";

        while (numero != 0) {
            cad = numero % 2 + cad;
            numero /= 2;
        }
        return cad;

    }

    public static int ff(String a, char b) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i) == b) {
                count++;
            }
        }
        return count;

    }

}
