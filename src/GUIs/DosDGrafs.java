package GUIs;//import java.awt.*;
import javax.swing.*;

public class DosDGrafs extends JFrame {

    miPanel panel;
    
    DosDGrafs() { 

        panel = new miPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);   //Para poner la localizacion inicial del frame
        setVisible(true);
    }
}