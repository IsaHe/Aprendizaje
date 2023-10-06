package JavaLearning;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // This is a comment

        /*
         * This
         * is
         * also
         * a
         * comment
         */
        System.out.println("\"hello\""+18);
        System.out.println("\thelloWorls"+324);

        char z = 'f';   //This is called inicialization

        System.out.println(z);
        System.out.println("hello"+z);

        Scanner scanner = new Scanner(System.in);   //Creamos el scanner

        System.out.println("What is your name? ");
        String name = scanner.nextLine();               //Con esto usamos el scanner para pedir un imput
        System.out.println("How old are you? ");
        int age = scanner.nextInt();                    //Con esto aceptamos solo un Int como input (si el imput no es un int salta un error)
        scanner.nextLine();     //Despues de llamar al metodo nextInt se queda un \n en el scanner que inpidira el correcto funcionamiento del nextline, de manera que 
        System.out.println("What is your favourite food?? ");   //para arreglarlo llamamos al nexline despues.
        String food = scanner.nextLine();       
        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("Your favourite food is "+food);

        scanner.close();    //Es recomendable siempre cerrar los scanner

        /*
         * Los tipos de datos son:
         *
         * boolean  True o False
         * 
         * byte     de -128 a 127
         * short    de -32,768 a 32,767
         * int      de -2 billones a 2 billones
         * long     de -9 quinitillones a 9 quiontillones
         * 
         * float    numero fraccionario de hasta 6-7 digitos
         * double   numero fraccionario de hasta 15 digitos
         * 
         * char     unico caracter de ASCII
         * string   una secuencia de caracteres
         */
        //Con printf podemos printear cosas con formato
        //     % [flags] [precision] [widh] [conversion-character]
        
        boolean myBoolean = true;
        char mychar = '@';
        String myString = "bro";
        int myInt = 50;
        double myDouble = 100000000;
        //Conversion characters:
        System.out.printf("%b \n", myBoolean);
        System.out.printf("%c \n", mychar);
        System.out.printf("%s \n", myString);
        System.out.printf("%d \n", myInt);
        System.out.printf("%f \n", myDouble);
        //Witdh:
        System.out.printf("Hello %10s \n", myString);  //to set the minimum ammount of characters to display
        //Presision:
        System.out.printf("You have this ammount of money: %.2f \n", myDouble);  //sets de number of digits of presition when outputing floating-point values
        //Flags:
        //  Adds an effect to the output based on the flag used
        //  - : left-justify
        //  + : output a ( + ) or a ( - ) sign for a numeric value
        //  0 : numeric values are zero-padded
        //  , : comma grouping separators if numbers > 1000        

        System.out.printf("You have this ammount of money: %+f \n", myDouble);  //te pone + si es positivo y - si es negativo
        System.out.printf("You have this ammount of money: %020f \n", myDouble);    //te pone 0 en los espacios en blanco
        System.out.printf("You have this ammount of money: %,f \n", myDouble);

    }
}
