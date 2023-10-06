package GUIs;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class layeredpane {
    public static void main(String[] args) {
        //  JLayeredPane => Similar to a panel but provides a third dimension for positioning components

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(50, 50, 200, 200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.blue);
        label2.setBounds(100, 100, 200, 200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.green);
        label3.setBounds(150, 150, 200, 200);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500);  //es recomendable tener las mismas dimensiones que el frame

        layeredPane.add(label1, Integer.valueOf(0));    //El nuero que pongamos representara la capa en la que se encuentre. Mientras mayor el numero mas arriba estara
        layeredPane.add(label2, Integer.valueOf(2));
        layeredPane.add(label3, Integer.valueOf(1));

        JFrame frame = new JFrame();
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);  //para esto es mejor tener el manager en null
        frame.setVisible(true);
    }
}
