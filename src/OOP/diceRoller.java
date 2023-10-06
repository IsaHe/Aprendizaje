package OOP;

import java.util.Random;

public class diceRoller {
    Random random;
    int number;

    diceRoller() {  //A constructor counts as a method
        random = new Random();
        //como tratamos con variables locales, podemos bien pasarlas como argumentos o instanciar las variables fuera del constructor pero dentro de la clase
        roll();
    }

    int roll() {
        number = random.nextInt(6)+1;
        return number;
    }
}
