package bloque5_6.pruebasdeArchivos;

import java.io.*;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


public class SerializarPersona {
    public static void main(String[] args) {
        persona p = new persona("Ana", 30);

        try {
            FileOutputStream archivo = new FileOutputStream("/home/gersha/Documentos/prueba.ser"); //Se abre el archivo, objeto para abrir archivos binarios
            ObjectOutputStream salida = new ObjectOutputStream(archivo);

            salida.writeObject(p); // ¡Serializa el objeto!
            salida.close();
            archivo.close();

            System.out.println("Objeto serializado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }


        
    }
}
