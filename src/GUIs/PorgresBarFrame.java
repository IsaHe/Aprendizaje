package GUIs;

import java.awt.*;
import javax.swing.*;

public class PorgresBarFrame {
    
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0, 500);

    PorgresBarFrame() {
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV boli", Font.BOLD, 25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }
    public void fill() {
        for (int i = 500; i >= 0 ; i--) {
            bar.setValue(i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        //bar.setString("Done");
    }
}
