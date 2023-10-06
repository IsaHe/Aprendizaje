package GUIs;

import java.awt.event.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;

public class ColorChoos extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    ColorChoos() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a color");
        button.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.WHITE);
        label.setText("This is some text :D");
        label.setFont(new Font("MV Boli", Font.PLAIN, 100));
        label.setOpaque(true);

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {

            //JColorChooser colorChooser = new JColorChooser();     // No se si esto es necesario pero lo dejo porsiaca
            
            Color color = JColorChooser.showDialog(null, "Pick a color", Color.black);

            label.setForeground(color);

        }
    }
}
