package bloque5_6.files;
import java.io.File;
import java.io.IOException;
public class FILE {

    public static void main(String[] args) {
        File arch = null;
        arch = new File("/home/gersha/Documentos/hola prueba.txt");

        if (arch.exists()) {
            System.out.println(arch.getName() + " si existe y se encuentra en \n" + arch.getPath());
        }
        //.path extrae la ruta de eso we

        if (arch.isDirectory()) {
            System.out.println("Se trata de una carpeta y contiene: ");
            String contenido[] = arch.list();
            for (String elem:contenido) {//for each
                System.out.println(elem);
            }
        } else {
            System.out.println("Se tratra de un archivo y tiene" + arch.length() + " caracteres");
        }

    }
}
