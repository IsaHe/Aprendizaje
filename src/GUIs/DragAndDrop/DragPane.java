package GUIs.DragAndDrop;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class DragPane extends JPanel {

    ImageIcon image = new ImageIcon("C:\\Users\\Thega\\Documents\\JavaFiles\\GUIs\\icon.png");
    final int WIDTH = image.getIconWidth();
    final int HEIGHT = image.getIconHeight();

    Point ImageCorner;
    Point prevPoint;

    DragPane() {

        ImageCorner = new Point(0, 0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
        
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        image.paintIcon(this, g, (int) ImageCorner.getX(), (int) ImageCorner.getY());

    }

    private class ClickListener extends MouseAdapter {

        public void mousePressed(MouseEvent e) {
            prevPoint = e.getPoint();
        }

    }

    private class DragListener extends MouseMotionAdapter {
    
        public void mouseDragged(MouseEvent e) {
            Point currentPt = e.getPoint();
            ImageCorner.translate(
                
                (int) (currentPt.getX() - prevPoint.getX()),
                (int) (currentPt.getY() - prevPoint.getY())

            );

            prevPoint = currentPt;
            repaint();
        }
        
    }
}
