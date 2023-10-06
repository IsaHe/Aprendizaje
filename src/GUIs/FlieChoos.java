package GUIs;

import java.awt.event.*;
import java.io.File;
import java.awt.FlowLayout;

import javax.swing.*;

public class FlieChoos extends JFrame implements ActionListener {
    JButton button;

    FlieChoos() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        button = new JButton("Select File");
        button.addActionListener(this);

        this.add(button);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {

            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setCurrentDirectory(new File("."));

            //int response = fileChooser.showOpenDialog(null);   //Select a file to open
            int response = fileChooser.showSaveDialog(null);    //Select a file to save

            if(response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }

        }
    }
    
}
