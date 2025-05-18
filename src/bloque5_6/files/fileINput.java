package bloque5_6.files;
import java.io.*;
public class fileINput {
    public static void main(String[] args) throws IOException {
        FileInputStream arch = null;
        int i;
        try {
            arch = new FileInputStream("/home/gersha/Documentos/hola prueba.txt");
            do {
                i = arch.read();
                if (i!=-1) {
                    System.out.print((char) i + " ");
                }
            } while (i!=-1);
            arch.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }
    }
    }
