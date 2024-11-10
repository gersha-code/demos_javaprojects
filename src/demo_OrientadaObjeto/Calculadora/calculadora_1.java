package demo_OrientadaObjeto.Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * La libreria Swing es una parte de la biblioteca estandar de java que proporciona herramientas para
 * crear interfaces graficas de usuario (GUIs).
 *      Componentes principales de Swing
 * +JFrame: es la venta principal de una aplicacion
 * JButton: Un boton que el usuario puede presionar
 * JLabel: Un texto o imagen que se muestra en la interfaz
 * JTextField: Un cuadro de texto donde el usuario puede escribir informacion
 * JPanel: Un contenedor para organizar otros componentes dentro de una ventana.
 * JComboBox: Un cuadro de lista desplegable
 * JList: Una lista de elementos que el usuario puede seleccionar.
 */
public class calculadora_1 {

    private JFrame frame;
    private JTextField textfield;
    private JTextArea textArea;

    private String operador = "";
    private double numero_1 = 0;
    private double numero_2 = 0;

    public calculadora_1(){
        //ventana proncipal
        frame = new JFrame("calculadora");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //crear un contenedor para los componentes
        Container container = frame.getContentPane();
        container.setLayout(new BorderLayout());

        //crear el campo de texto para mostrar el resultado
        textfield = new JTextField();
        textfield.setEditable(false);
        container.add(textfield, BorderLayout.NORTH);
    }
}
