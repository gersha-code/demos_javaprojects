package bloque5_6.flotante;
import javax.swing.*;
/*
 * JFrame → contiene otros componentes como:
    ├── JLabel (etiquetas)
    ├── JTextField (campos de entrada)
    ├── JButton (botones)
    ├── JPanel (subáreas)
    └── otros (checkboxes, listas, menús, etc.)
 */
public class ventana extends JFrame{
    public ventana(){
        setTitle("Validar flotante");
        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
        JLabel etiqueta = new JLabel("Nombre:");
        etiqueta.setBounds(50, 50, 100, 25); // x, y, ancho, alto
        JTextField campoTexto = new JTextField();
        campoTexto.setBounds(150, 50, 150, 25);
        JButton boton = new JButton("Saludar");
        boton.setBounds(150, 100, 100, 30);

        add(etiqueta);
        add(campoTexto);
        add(boton);

    }


}
