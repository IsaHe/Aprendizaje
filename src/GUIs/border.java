package GUIs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class border {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(10, 5));    //No es necesario pues es el layout por defecto de los frames 
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        //-------------------------sub panels-------------------------      SE PUEDEN METER PANELS DENTRO DE OTRO PANEL

        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.black);
        panel7.setBackground(Color.darkGray);
        panel8.setBackground(Color.gray);
        panel9.setBackground(Color.lightGray);
        panel10.setBackground(Color.white);

        panel5.setLayout(new BorderLayout());

        panel6.setPreferredSize(new Dimension(100, 100));
        panel7.setPreferredSize(new Dimension(100, 100));
        panel8.setPreferredSize(new Dimension(100, 100));
        panel9.setPreferredSize(new Dimension(100, 100));
        panel10.setPreferredSize(new Dimension(100, 100));

        panel5.add(panel6, BorderLayout.NORTH);
        panel5.add(panel7, BorderLayout.EAST);
        panel5.add(panel8, BorderLayout.WEST);
        panel5.add(panel9, BorderLayout.SOUTH);
        panel5.add(panel10, BorderLayout.CENTER);

        //-------------------------sub panels-------------------------

        frame.add(panel1, BorderLayout.NORTH);  //Se coloca arriba de la ventana. Se ampliara horizontalmente pero no verticalmente
        frame.add(panel2, BorderLayout.WEST);   //Se coloca a la izquierda. Se amliara verticalmente pero no horizontalmente
        frame.add(panel3, BorderLayout.EAST);   //Se coloca a la derecha. Se amliara verticalmente pero no horizontalmente
        frame.add(panel4, BorderLayout.SOUTH);  //Se coloca abajo de la ventana. Se ampliara horizontalmente pero no verticalmente
        frame.add(panel5, BorderLayout.CENTER); //Se coloca en el centro. Se amplia junto con el frame
    }
}
