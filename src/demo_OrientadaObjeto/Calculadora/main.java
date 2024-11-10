package demo_OrientadaObjeto.Calculadora;

import demo_OrientadaObjeto.demo.calculadora;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JButton;
public class main {
    public static void main(String[] args) {
        System.out.println("esta");
        JFrame ventana = new JFrame("mi primera ventana");
        JTextPane text = new JTextPane();
        JButton button = new JButton();
        text.setText("holaa");
        button.setAction(null);
        ventana.setSize(800, 600);
        ventana.add(button);
        ventana.add(text);
        ventana.setTitle("primera ventana");
        ventana.setVisible(true);
        ventana.getTreeLock();
        
    }

}
