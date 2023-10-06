package GUIs;

import javax.swing.JOptionPane;

public class optionPane {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE, null);
        JOptionPane.showMessageDialog(null, "This is some useless info v2", "title", JOptionPane.INFORMATION_MESSAGE, null);
        JOptionPane.showMessageDialog(null, "RLY?", "title", JOptionPane.QUESTION_MESSAGE, null);
        JOptionPane.showMessageDialog(null, "Danger!", "title", JOptionPane.WARNING_MESSAGE, null);
        JOptionPane.showMessageDialog(null, "Error", "title", JOptionPane.ERROR_MESSAGE, null);

        System.out.println(JOptionPane.showConfirmDialog(null, "Eri gay?", "This is the title", JOptionPane.YES_NO_CANCEL_OPTION));
        // "yes" devuelve 0, "no" devuelve 1, "cancel" devuelve 2 y cerrar la ventana devuelve -1

        String[] responses = {"No, you are awsome!", "Thank you", "Blush"};

        String name = JOptionPane.showInputDialog(null, "What is your name?");
        System.out.println(name);

        JOptionPane.showOptionDialog(null,
                                    "You are awsome",
                                    "Secret message",
                                    JOptionPane.YES_NO_CANCEL_OPTION,
                                    JOptionPane.INFORMATION_MESSAGE,
                                    null,   //para poner un icon el lugar del que viene por defecto en el tipo de message
                                    responses,  //Para ponerle texto a los botones. Reescribe lo del YES_NO
                                    null);
    }
}
