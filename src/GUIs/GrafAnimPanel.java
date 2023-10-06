package GUIs;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class GrafAnimPanel extends JPanel implements ActionListener {

    Random random = new Random();

    final int PANNEL_WIDTH = 500;
    final int PANNEL_HEIGHT = 500;
    Image enemy;
    Timer timer;
    int xVelocity = random.nextInt(0, 5);
    int yVelocity = random.nextInt(0, 5);
    int xInicial = 0;
    int yInicial = 0;

    GrafAnimPanel() {

        this.setPreferredSize(new Dimension(PANNEL_WIDTH, PANNEL_HEIGHT));
        this.setBackground(Color.black);

        enemy = new ImageIcon("C:\\Users\\Thega\\Documents\\JavaFiles\\GUIs\\icon.png").getImage();

        timer = new Timer(10, this);
        timer.start();
    }

    public void paint(Graphics g) {

        super.paint(g);     //para que pinte el background

        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(enemy, xInicial, yInicial, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (xInicial >= PANNEL_WIDTH-enemy.getWidth(null) || xInicial < 0) {
            xVelocity *= -1;
        }
        xInicial += xVelocity;

        if (yInicial >= PANNEL_HEIGHT-enemy.getHeight(null) || yInicial < 0) {
            yVelocity *= -1;
        }
        yInicial += yVelocity;

        repaint();
    }
    
}
