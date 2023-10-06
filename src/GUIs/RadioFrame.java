package GUIs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioFrame extends JFrame implements ActionListener {
    JRadioButton pizzButton;
    JRadioButton hamburgerButton;
    JRadioButton hotDogButton;

    RadioFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzButton = new JRadioButton("pizza");
        hamburgerButton = new JRadioButton("hamburger");
        hotDogButton = new JRadioButton("hotdog");

        ButtonGroup group = new ButtonGroup();
        group.add(pizzButton);
        group.add(hotDogButton);
        group.add(hamburgerButton); //Para que todos los borones esten dentro de un mismo gurpo y se pueda seleccionar unicamente uno de ellos
        
        pizzButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotDogButton.addActionListener(this);

        // Tambien se pueden cambar los iconos de los botones

        this.add(pizzButton);
        this.add(hotDogButton);
        this.add(hamburgerButton);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzButton) {
            System.out.println("You ordered pizza");
        }
        else if (e.getSource() == hamburgerButton) {
            System.out.println("You ordered a hamburger");
        }
        else if (e.getSource() == hotDogButton) {
            System.out.println("You ordered hotdog");
        }
    }
}
