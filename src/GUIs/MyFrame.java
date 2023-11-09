package GUIs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class  MyFrame extends JFrame implements ActionListener{

    JButton button;
    JLabel label;

    MyFrame() {
        ImageIcon icon = new ImageIcon("C:\\Users\\Thega\\OneDrive\\Documentos\\GUIs\\icon.png");

        button = new JButton();
        
        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button.setBounds(100, 100, 250, 100);
        //button.addActionListener(e -> System.out.println("Poo"));   //Esto seria como hacerlo con una landa expresion. Es mucha menos sintaxis
        button.addActionListener(this);
        button.setText("I am a button");
        button.setFocusable(false);     //Esto es para quitar el cuadradito que pone al rededor del texto
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-15);
        button.setForeground(Color.cyan);
        button.setBackground(Color.gray);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setSize(400, 100);
        //button.setEnabled(false); //para inhavilitar el boton

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {     //Esto es si no queremos utilizar la landa expresion. Se usaria poniendo implements ActionListener 
       if(e.getSource() == button) {
        label.setVisible(true);
       }
    }
}
