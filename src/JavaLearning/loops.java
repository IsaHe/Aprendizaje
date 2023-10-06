package JavaLearning;

import java.util.ArrayList;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        
        while(name.isBlank()) {     //El isBlank devuelve True si esta vacio el str
            System.out.println("Enter your name");
            name = scanner.nextLine();
        }
        System.out.println("Hello "+name);

        do {        //Lo mismo que el while pero te aseguras que el codigo se ejecute al menos una vez
            System.out.println("Enter your name");
            name = scanner.nextLine();
        }while(name.isBlank());

        System.out.println("Hello "+name);

        for(int i = 0; i<=10; i++) {        //primero se declara la variable, luego se pone la condicion y al final lo que se hace despues de cada iteracion
            System.out.println(i);
        }

        for(int i = 10; i<=0; i-=2) {       //Podemos variar por mas de uno con +=, -=....
            System.out.println(i);          //El tercer valor no es obligatorio
        }

        int rows;
        int colums;     //se pueden declarar variables sin que tengan un valor inicial
        String symbol = "";

        System.out.println("Enter the number of rows");
        rows = scanner.nextInt();
        System.out.println("Enter the number of colums");
        colums = scanner.nextInt();
        System.out.println("Enter the symbol");
        symbol = scanner.next();

        for(int i = 1; i<=rows; i++){
            System.out.println();
            for(int j = 1; j<=colums; j++) {
                System.out.print(symbol);   //printea lo que le pidas sin poner una linea al final
            }
        }
        scanner.close();

        /*
         * for-each =>  is a traversing tectnique to iterate trough elements in an array/colection
         *              les steps, more readable
         *              less flexible
         */

        String[] animals = {"cat", "dog", "rat", "bird"};

        for(String animal : animals){    //como decir "por cada String animal en animales"
            System.out.println(animal);
        }

        ArrayList<String> animalsv2 = new ArrayList<String>();
        animalsv2.add("cat");
        animalsv2.add("dog");
        animalsv2.add("rat");
        animalsv2.add("bird");

        for(String animal : animals){    //exactamente igual que con una lista normal
        System.out.println(animal);
        }
    }
}
