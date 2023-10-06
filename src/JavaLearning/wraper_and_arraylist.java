package JavaLearning;

import java.util.*;

public class wraper_and_arraylist {
    public static void main(String[] args) {
        /*
         * wraper class =>  Provides a way to use primitive data tipes as reference data types
         *                  Reference data types have usefull methods
         *                  Can be used with colections
         * 
         * primitive        wraper      (FOR CONVENTION WRAPER NAMES ARE THE SAME BUT WITHOUT ABREVIATIONS AND THE FIRST LETTER CAPITALIZED) 
         * 
         * boolean          Boolean
         * char             Character
         * int              Integer
         * double           Double
         * ...              ...
         * 
         * Autoboxing is the automatic conversion that the java compiles makes between primitive data types and their corresponding object wraper class
         * Unboxing is the reverse of autoboxing. Automatic conversion of wraper class to primitive
         */

        //Boolean a = true;   //se usa autoboxing para asignar un valor de tipo primitivo a una variable de tipo referencia
        //Character b = '@';  //se pueden usar de igual manera que como si fueran primitivas gracias al Unboxing
        //Integer c = 123;    //el problema es que seria mucho mas lento
        //String e = "Isaac";      //los string ya son por defecto de tipo referencia

        /*
         * ArrayList => a resizable array
         *              Elements can be added and removed after the compilation phase
         *              store only reference data types
         */
        ArrayList<String> food = new ArrayList<String>();   //El arraylist se crea sin necesidad de darle un tamaño fijo
        food.add("pizza");      //para añadir elementos se utiliza el .add
        food.add("hamburger");
        food.add("hotdog");

        food.set(0, "shushi");      //asi se sustituye un elemento en base a un indice
        food.remove(2);     //asi se elimina un elemento en base a un indice
        //food.clear();       //asi se eliminan todos los elementos

        for(int i = 0; i<food.size(); i++) {    //para conseguir la longitud del arraylist se uitliza.size
            System.out.println(food.get(i));    //para acceder a los elementos del array se utiliza el .get
        }

        //2D arraylists are a dinamic list of lists
        //you can change de dimension of this lists during runtime

        ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>(); //Asi es como se crearia un arraylist 2D

        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("pasta");
        bakeryList.add("Garlic");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("tomatoes");
        produceList.add("zuccini");
        produceList.add("peppers");

        ArrayList<String> drinkList = new ArrayList<String>();
        drinkList.add("water");
        drinkList.add("Coca Cola");

        groceryList.add(produceList);
        groceryList.add(bakeryList);
        groceryList.add(drinkList);

        System.out.println(groceryList.get(2).get(1));  //Asi es como se miran los elementos en un Arraylist 2D
    }
}
