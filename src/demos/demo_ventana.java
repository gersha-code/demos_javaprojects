package demos;
import javax.swing.*;
public class demo_ventana {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Mi primera ventana");
        ventana.setSize(1000, 1000);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        JButton boton = new JButton("Haz click!");
        boton.setSize(500, 500);
        
        ventana.add(boton);
        ventana.setVisible(true);
    }
}
