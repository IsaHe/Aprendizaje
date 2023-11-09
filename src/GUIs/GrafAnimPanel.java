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
    int xVelocity = 1;
    int yVelocity = 2;
    int xInicial = PANNEL_WIDTH/2;
    int yInicial = PANNEL_HEIGHT/2;

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

        xVelocity += 1;
        yVelocity += 1;

        if (xInicial >= PANNEL_WIDTH-enemy.getWidth(null) || xInicial < PANNEL_WIDTH/2-enemy.getWidth(null)) {
            xVelocity *= -1;
        }
        xInicial += xVelocity;

        if (yInicial >= PANNEL_HEIGHT-enemy.getHeight(null) || yInicial < PANNEL_HEIGHT/2-enemy.getHeight(null)) {
            yVelocity *= -1;
        }
        yInicial += yVelocity;

        repaint();
    }
    
}
