package ejemplosVentanas;
import javax.swing.*;

public class demoVentana1 {
    public static void main(String[] args) {
        // Crear la ventana
        JFrame ventana = new JFrame("Mi Primera Ventana");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Crear un botón
        JButton boton = new JButton("Haz clic");
        boton.addActionListener(e -> JOptionPane.showMessageDialog(null, "¡Hola mundo!"));
q
        // Agregar el botón a la ventana
        ventana.add(boton);

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}

