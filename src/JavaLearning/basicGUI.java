package JavaLearning;

import javax.swing.JOptionPane;

public class basicGUI {
    public static void main(String[] args) {
        int pregunta = 0;
        String name = JOptionPane.showInputDialog("Enter your name");   //Esto nos muestra un mensaje y podremos almacenar lo que se escriba en la caja de texto
        JOptionPane.showMessageDialog(null, "Hello "+name);     //Esto nos muestra el texto que le pidamos

        while (true) {
            try {
                if (pregunta == 0) {
                    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));  //Como el imputDialog nos devuelve un str primero tendremos que convertirlo a int
                    JOptionPane.showMessageDialog(null, "You are " + age + " years old");
                    pregunta++;
                } else if (pregunta == 1) {
                    double height =  Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));  //Asi se comvierte en double
                    JOptionPane.showMessageDialog(null, "You are "+height+" meters tall");
                    break;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Enter a valid number");
            }
        }
    }
}
