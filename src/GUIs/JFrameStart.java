package GUIs;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;


public class JFrameStart {
    public static void main(String[] args) {

        /*  Se creara el frame el la subclase MyFrame
        JFrame frame = new JFrame();    //creates the frame
        frame.setTitle("The title goes here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //De normal si le damos a la x solo esconde el frame. Esto es para que lo cierre completamente
        frame.setResizable(false);  //para que no se pueda modificar el tamaño de la ventana
        frame.setSize(420, 420);    //sets the dimensions of the frame
        frame.setVisible(true); //makes the frame visible

        ImageIcon image = new ImageIcon("C:\\Users\\Thega\\OneDrive\\Documentos\\GUIs\\logo.png");    //para crear un abstracto de la imagen
        frame.setIconImage(image.getImage());   //para cambiar el logo del frame

        //frame.getContentPane().setBackground(new Color(0, 0, 0));     //Tambien puedes crear tus propios colores
        frame.getContentPane().setBackground(Color.black);  //change the color of the background
        */

        //JLabel => A GUI display area for a string, an image or both
        ImageIcon image = new ImageIcon("C:\\Users\\Thega\\OneDrive\\Documentos\\GUIs\\logo.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);
        JLabel label = new JLabel(); //crea un label con un texto

        label.setText("Bro, do you even code");   //Se puede hacer asi pero es mas facil pasarlo directamente
        label.setIcon(image);

        label.setHorizontalTextPosition(JLabel.CENTER); //LEFT, CENTER, RIGHT RELATIVE TO DE IMAGE ICON
        label.setVerticalTextPosition(JLabel.TOP); //TOP, BOTTOM, CENTER    of the image icon

        label.setForeground(Color.green);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));

        label.setBackground(Color.black);
        label.setOpaque(true);

        label.setIconTextGap(-25);

        label.setBorder(border);

        label.setVerticalAlignment(JLabel.CENTER);     //TOP, CENTER, BOTTOM    vertical pos of image+text
        label.setHorizontalAlignment(JLabel.CENTER);    //horizontal position of icon+text
        //label.setBounds(100, 100, 510, 510);    //las cordenadas son de la esquina superior izquierda


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);

        //frame.setLayout(null);  //para poder elegir la posicion del label de manera manual

        frame.setVisible(true);
        frame.add(label);

        frame.pack(); //de esta manera el tamaño del frame se ajusta a el tamaño de los label que tengamos

        //Si no necesitamos nombrar el frame podemios pones simplemente `new MyFrame()`
        //new MyFrame();
        


    }
}
