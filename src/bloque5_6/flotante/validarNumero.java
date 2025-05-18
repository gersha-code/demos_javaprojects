package bloque5_6.flotante;

public class validarNumero {
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";

    public float validarNumero(String numero) throws numeroExcepciones {
        StringBuilder errores = new StringBuilder();
        if (numero.indexOf("-") > 0) {
            errores.append("\t-El signo esta colocado incorrectamente.\n");
        }
        if (numero.indexOf(".") != numero.lastIndexOf(".")) {
            errores.append("\t-Hay mas de un punto.\n");
        }
        if (numero.matches(".*[a-zA-Z].*")) {
            errores.append("\t-Hay caracteres alfanumericos.\n");
        }
        if (errores.length() > 0) {
            throw new numeroExcepciones("errores encontrados: \n" + ROJO + errores.toString() + RESET);
        }
        return Float.parseFloat(numero);
    }
}
