package GUIs.DragAndDrop;

import javax.swing.JFrame;

public class DragFrame extends JFrame {

    DragPane dragPane = new DragPane();

    DragFrame() {
        this.add(dragPane);
        this.setTitle("Drag and Drop demo");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
}
