package demo_OrientadaObjeto.demo;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/*
 * La calase calculadora sera la responsable de realizar las operaciones
 * matematicas. Contendra metodos para cada operacion y no necesitara 
 * atributos adicionaleds para este ejercicio.
 */
public class calculadora {

    // Atributos
    private JFrame frame;
    private JTextField textField;
    private String operador = "";
    private double numero1 = 0, numero2 = 0;

    // Constructor de la calculadora
    public calculadora() {
        // Crear la ventana principal
        frame = new JFrame("Calculadora");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un contenedor para los componentes
        Container container = frame.getContentPane();
        container.setLayout(new BorderLayout());

        // Crear el campo de texto para mostrar el resultado
        textField = new JTextField();
        textField.setEditable(false);
        container.add(textField, BorderLayout.NORTH);

        // Crear el panel de botones
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4)); // 4 filas y 4 columnas
        container.add(panel, BorderLayout.CENTER);

        // Crear botones y agregarlos al panel
        agregarBoton(panel, "7");
        agregarBoton(panel, "8");
        agregarBoton(panel, "9");
        agregarBoton(panel, "/");

        agregarBoton(panel, "4");
        agregarBoton(panel, "5");
        agregarBoton(panel, "6");
        agregarBoton(panel, "*");

        agregarBoton(panel, "1");
        agregarBoton(panel, "2");
        agregarBoton(panel, "3");
        agregarBoton(panel, "-");

        agregarBoton(panel, "0");
        agregarBoton(panel, ".");
        agregarBoton(panel, "=");
        agregarBoton(panel, "+");

        // Mostrar la ventana
        frame.setVisible(true);
    }

    // Método para agregar botones al panel
    private void agregarBoton(JPanel panel, String texto) {
        JButton boton = new JButton(texto);
        panel.add(boton);
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Llamar a la acción de acuerdo al botón presionado
                botonPulsado(texto);
            }
        });
    }

    // Método que maneja lo que pasa cuando un botón es pulsado
    private void botonPulsado(String texto) {
        if (texto.equals("=")) {
            // Realizar la operación
            numero2 = Double.parseDouble(textField.getText());
            double resultado = 0;
            switch (operador) {
                case "+":
                    resultado = numero1 + numero2;
                    break;
                case "-":
                    resultado = numero1 - numero2;
                    break;
                case "*":
                    resultado = numero1 * numero2;
                    break;
                case "/":
                    if (numero2 == 0) {
                        textField.setText("Error");
                        return;
                    }
                    resultado = numero1 / numero2;
                    break;
            }
            // Mostrar el resultado
            textField.setText(String.valueOf(resultado));
            operador = "";
        } else if (texto.equals("+") || texto.equals("-") || texto.equals("*") || texto.equals("/")) {
            // Guardar el número y la operación
            numero1 = Double.parseDouble(textField.getText());
            operador = texto;
            textField.setText("");
        } else {
            // Actualizar el texto en el campo de texto
            textField.setText(textField.getText() + texto);
        }
    }
}
/*
 * Explicacion:
 * Cada uno de los metodos toma dos parametros a y b (que representan los
 * numeros a operar)
 * y devuelve el resultado correspondiente.
 * Los metodos devuelven un valor de tipo double, que es adecuado para
 * representar numeros decimlaes.
 * 
 */
