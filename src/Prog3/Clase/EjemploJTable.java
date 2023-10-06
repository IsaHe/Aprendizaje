package Prog3.Clase;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.Serial;
import java.time.LocalDate;
import java.util.ArrayList;

public class EjemploJTable extends JFrame {

    @Serial
    private static final long serialVersionUID = 1L;

    public EjemploJTable() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640, 480);
        setTitle("Ejemplo JTable");

        /////////////////////////////////////////////////////////////////////////////////
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Enrico", "Fermi", LocalDate.of(1901, 9, 29)));
        persons.add(new Person("Albert", "Einstein", LocalDate.of(1879, 4, 14)));
        persons.add(new Person("Marie", "Curie", LocalDate.of(1867, 11, 07)));
        persons.add(new Person("Nikola", "Tesla", LocalDate.of(1856, 7, 10)));
        persons.add(new Person("Isaac", "Newton", LocalDate.of(1643, 1, 4)));
        persons.add(new Person("Galileo", "Galilei", LocalDate.of(1564, 2, 15)));
        persons.add(new Person("Johannes", "Kepler", LocalDate.of(1571, 12, 27)));
        persons.add(new Person("Nicolas", "Copernicus", LocalDate.of(1473, 2, 19)));
        persons.add(new Person("Aristarchus", "of Samos", LocalDate.of(-310, 1, 1)));
        persons.add(new Person("Ptolemy", "of Alexandria", LocalDate.of(100, 1, 1)));
        persons.add(new Person("Aryabhata", "of Kusumapura", LocalDate.of(476, 1, 1)));
        persons.add(new Person("Alhazen", "of Basra", LocalDate.of(965, 1, 1)));
        persons.add(new Person("Abu", "Nasr", LocalDate.of(1038, 1, 1)));
        persons.add(new Person("Ibn", "al-Haytham", LocalDate.of(965, 1, 1)));
        persons.add(new Person("Omar", "Khayyam", LocalDate.of(1048, 1, 1)));
        persons.add(new Person("Ibn", "al-Shatir", LocalDate.of(1304, 1, 1)));
        persons.add(new Person("Al-Biruni", "of Khwarizm", LocalDate.of(973, 1, 1)));
        persons.add(new Person("Hypatia", "of Alexandria", LocalDate.of(370, 1, 1)));
        persons.add(new Person("Hipparchus", "of Nicaea", LocalDate.of(-190, 1, 1)));
        persons.add(new Person("Heraclides", "Ponticus", LocalDate.of(-390, 1, 1)));
        persons.add(new Person("Aristotle", "of Stagira", LocalDate.of(-384, 1, 1)));
        persons.add(new Person("Archimedes", "of Syracuse", LocalDate.of(-287, 1, 1)));
        persons.add(new Person("Eratosthenes", "of Cyrene", LocalDate.of(-276, 1, 1)));
        persons.add(new Person("Hippocrates", "of Cos", LocalDate.of(-460, 1, 1)));
        persons.add(new Person("Thales", "of Miletus", LocalDate.of(-624, 1, 1)));
        persons.add(new Person("Anaximander", "of Miletus", LocalDate.of(-610, 1, 1)));
        persons.add(new Person("Anaximenes", "of Miletus", LocalDate.of(-585, 1, 1)));
        persons.add(new Person("Democritus", "of Abdera", LocalDate.of(-460, 1, 1)));
        persons.add(new Person("Anaxagoras", "of Clazomenae", LocalDate.of(-500, 1, 1)));
        persons.add(new Person("Pythagoras", "of Samos", LocalDate.of(-570, 1, 1)));
        persons.add(new Person("Euclid", "of Alexandria", LocalDate.of(-325, 1, 1)));
        persons.add(new Person("Eudoxus", "of Cnidus", LocalDate.of(-390, 1, 1)));
        persons.add(new Person("Aristarchus", "of Samos", LocalDate.of(-310, 1, 1)));
        persons.add(new Person("Heron", "of Alexandria", LocalDate.of(10, 1, 1)));
        persons.add(new Person("Apollonius", "of Perga", LocalDate.of(-262, 1, 1)));
        persons.add(new Person("Hipparchus", "of Nicaea", LocalDate.of(-190, 1, 1)));
        /////////////////////////////////////////////////////////////////////////////////

        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Apellido");
        tableModel.addColumn("Fecha de nacimiento");

        for (Person person : persons) {
            tableModel.addRow(new Object[]{person.getName(), person.getSurname(), person.getBirthDate()});
        }

        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);

        // boton que imprime los datos de la fila seleccionada
        JButton button = new JButton("Imprimir Datos");
        JPanel panelAbajo = new JPanel();
        panelAbajo.add(button);
        add(panelAbajo, "South");

        button.addActionListener(e -> {
            int row = table.getSelectedRow();
            if (row != -1) {
                System.out.println("Nombre: " + tableModel.getValueAt(row, 0));
                System.out.println("Apellido: " + tableModel.getValueAt(row, 1));
                System.out.println("Fecha de nacimiento: " + tableModel.getValueAt(row, 2));
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EjemploJTable::new);
    }
}
