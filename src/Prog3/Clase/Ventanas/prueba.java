package Prog3.Clase.Ventanas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class prueba extends JFrame {
    public prueba() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        DefaultTableModel model = new DefaultTableModel();
        String[] columnNames = {"Nombre", "Apellido", "Fecha de nacimiento"};
        model.setColumnIdentifiers(columnNames);

        setSize(500, 500);
        add(new JScrollPane(new JTable(model)));
        setVisible(true);
    }

    public static void main(String[] args) {
        new prueba();
    }
}
