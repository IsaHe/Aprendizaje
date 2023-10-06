package GUIs;

import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class panels {
    public static void main(String[] args) {
        JLabel label = new JLabel();
        label.setText("Hi");
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(new BorderLayout()); //Si est no funciona es xq no tenemos incluido java.awt.BorderLayout

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);

        greenPanel.add(label);//podemos añadir los labels en los panels en lugar de al frame. En los paneles, el flow layout que tienen por defecto añadira los elementos for filas empezando desde arriba en el centro

        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}
