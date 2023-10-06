package GUIs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class textFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;

    textFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 35));
        textField.setForeground(new Color(0x00FF00));
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.white);
        textField.setText("usarname");
         
        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            System.out.println(textField.getText());
            textField.setEditable(false);   // Para que no pueda ser editado
            button.setEnabled(false);
        }
        
    }
    
}
