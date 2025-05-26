package bloque5_6.pruebasdeArchivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import bloque5_6.files.FILE;

public class claseFIle {
    public static void main(String[] args) {
        filesInputsOutputs();
    }

    public static void file() {
        File arch = new File("/home/gersha/Documentos/archivo_pruebasArchivos.txt");
        System.out.println(arch.exists());
        System.out.println(arch.isFile());
        System.out.println(arch.isDirectory());
        System.out.println(arch.length());
    }

    public static void filesInputsOutputs() {
        Object objeto = new Object();
        
        try {
            FileOutputStream b = new FileOutputStream("/home/gersha/Documentos/arch_bin.dat", false);
            String ejemplo = "hola mundo";
            b.write(ejemplo.getBytes());
            int c = 0;
            FileInputStream a = new FileInputStream("/home/gersha/Documentos/arch_bin.dat");
            while (c != -1) {
                c = a.read();
                System.out.println((char)c);
            }
        } catch (Exception e) {
            System.out.println("Archivo no encontrado");
        }

    }
}
