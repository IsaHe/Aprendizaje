package GUIs;

import java.awt.event.*;
import java.awt.FlowLayout;

import javax.swing.*;

public class MenuBar extends JFrame implements ActionListener {
    JMenuBar menuBar;

    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;

    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    MenuBar() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help"); 

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        exitItem.addActionListener(this);
        saveItem.addActionListener(this);

        //Pa meter shorcuts de teclado
        fileMenu.setMnemonic(KeyEvent.VK_F);    //alt +  f

        loadItem.setMnemonic(KeyEvent.VK_L);    // l
        exitItem.setMnemonic(KeyEvent.VK_E);    // s
        saveItem.setMnemonic(KeyEvent.VK_S);    // e
        
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem) {
            System.out.println("load");
        } else if(e.getSource() == saveItem) {
            System.out.println("save");
        } else if(e.getSource() == exitItem) {
            System.exit(0);
        }
    }
}
