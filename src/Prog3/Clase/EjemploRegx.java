package Prog3.Clase;

import java.util.regex.Pattern;

public class EjemploRegx {
    private static final String[] testNombres = {
            "pepe",
            "pablo",
            "pablo1",
            "pablo.",
            "pablo.1",
            "pablo.1.",
            "pablo.1.1",
            "pablo.1.1.",
            "pablo.1.1.1",
            "pablo.1.1.1.",
            "pablo."
    };

    public static void main(String[] args) {

        //https://regex101.com/
        // Significado de la expresion regular:
        // Empieza con p

        String regex = "^p.*\\..+";

        System.out.println("Patron: " + regex);
        Pattern pattern = Pattern.compile(regex); // Compila el patron
        for(String s: testNombres){
            if (pattern.matcher(s).matches()) // Compara el patron con el string
                System.out.println(s + " cumple el patron");
            else
                System.out.println(s + " no cumple el patron");
        }
    }
}
