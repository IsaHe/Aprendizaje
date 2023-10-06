package GUIs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class comboBoxFrame extends JFrame implements ActionListener {
    JComboBox<String> comboBox;

    comboBoxFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog", "cat", "bird"};
        comboBox = new JComboBox<String>(animals);  //Tiene que ser un array de reference datatypes
        comboBox.addActionListener(this);

        //comboBox.setEditable(true);
        System.out.println(comboBox.getItemCount());
        //comboBox.addItem("horse");
        //comboBox.insertItemAt("pig", 0);
        //comboBox.setSelectedIndex(0);
        //comboBox.removeItem("cat");
        //comboBox.removeItemAt(0);
        //comboBox.removeAll();
        
        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
            //System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
        }
    }
}
