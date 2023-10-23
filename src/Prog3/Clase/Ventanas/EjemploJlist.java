package Prog3.Clase.Ventanas;

import javax.swing.*;
import java.io.Serial;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EjemploJlist extends JFrame {

    @Serial
    private static final long serialVersionUID = 1L;

    public EjemploJlist() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640, 480);

        List<Person> persons = new ArrayList<>();
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

        DefaultListModel<Person> listModel = new DefaultListModel<>();
        listModel.addAll(persons);

        JList<Person> jList = new JList<>(listModel);
        JScrollPane panel = new JScrollPane(jList);

        add(panel);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(EjemploJlist::new);
    }
}

