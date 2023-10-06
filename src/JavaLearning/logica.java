package JavaLearning;

import java.util.Scanner;

public class logica {
    public static void main(String[] args) {
        int age = 18;

        if(age==75) {
            System.out.println("Ok boomer");
        }
        else if(age>=18) {
            System.out.println("You are an adult");
        }
        else {
            System.out.println("You are not an adult");
        }

        // A swich is a statement that allows a variable to be tested for equiality against a list of values
        // Los swich funcionan con: byte, short, char, int, String, Character, Byte, Short y Integer
        String day = "pizza";

        switch(day) {   //basicamente es como tener un monton de ifs
            case "sunday": System.out.println("It is sunday");
            break;  //el breack es necesario pq en cuanto salga el casae se ejecuta todo el codigo que este debajo hasta el break
            case "saturday": System.out.println("It is saturday");
            break;
            case "friday": System.out.println("It is friday");
            break;
            case "monday": System.out.println("It is monday");
            break;
            case "tuesday": System.out.println("It is tuesday");
            break;
            case "thursday": System.out.println("It is thursday");
            break;
            default: System.out.println("That is not a day");
        }

        /*
         * Hay 3 operadores logicos
         * && = AND
         * || = OR
         * ! = not
         */
        int temp = 25;

        if(temp>30){
            System.out.println("It is hot outside");
        }
        else if(temp>=20 && temp<=30){      //Exactamente lo mismo que el and de python
            System.out.println("It is warm outside");
        }
        else{
            System.out.println("It is cold outside");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("write q or Q to quit");
        String response = scanner.next();       //no se la diferencia ente el next y el nextLine

        if(response.equals("q") || response.equals("Q")){   //Basicamente un or de python. 
            System.out.println("You quit");     //Para evaluar si dos str son iguales se usa el equalS()
        }
        else{
            System.out.println("You are still in");
        }

        if(!response.equals("q") && !response.equals("Q")){     //como el not de python (reversa el valor del booleano)
            System.out.println("You are still in");
        }
        else{
            System.out.println("You quit");
        }

        scanner.close();
    }
}
