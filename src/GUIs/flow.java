package GUIs;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class flow {
    public static void main(String[] args) {
        //  FlowLayout =>   Flaces components in a row, sized at their preffered size.
        //                  If the horizontal space is to too smoll, it will use the next abilabel row

        JFrame frame = new JFrame();    //Los paneles tienen el flow por defecto
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 10));    //Esto es para que empieze por la derecha (por defecto va desde el centro)
        // Las opciones serian CENTER(DEAFAUT), TRAILING(DESDE LA IZQUIERDA) Y LEADING(DESDE LA DERECHA)

        frame.add(new JButton("1"));    //asi podemos crear los botones de manera mas sencilla
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));

        frame.setVisible(true);
    }
}
