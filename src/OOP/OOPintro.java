package OOP;

public class OOPintro {
    public static void main(String[] args) {
        //object = an instance of a class that main contain attributes and methods
        //se pueden tener todas las clases en un mismo documento pero es buena practica ponerlos en differentes (ver car.java)
        
        car myCar = new car();  //Asi es como se crearia una instancia de una clase en Java

        System.out.println(myCar.model);    //para acceder a los parametros de la clase
        System.out.println(myCar.make);

        myCar.drive();  //para usar los metodos de la clase
        myCar.brake();

        // CONSTRUCTORS
        Human human = new Human("Rick", 65, 70);
        Human human2 = new Human("Morty", 16, 50);

        System.out.println(human.name);
        System.out.println(human2.name);

        human2.eat();
        human.drink();

        //locar variables =>    declared inside a method
        //                      visible only to that method

        //global variables =>   declared outside a method but within a class
        //                      visible to all parts of a class
        diceRoller diceRoller = new diceRoller();
        System.out.println(diceRoller.roll());

        //overloaded constructors =>    multiple constructos within a class with the same name
        //                              but have different parameters
        //                              signature == name + parameters
        pizza pizza = new pizza("thicc crust pizza", "tomato", "mozzarela", "pepperoni");       
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.topping);
        System.out.println(pizza.cheese);

        pizza pizza2 = new pizza("thicc crust pizza", "tomato", "mozzarela");
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.cheese);

        pizza pizza3 = new pizza("thicc crust pizza", "tomato");
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza3.bread);
        System.out.println(pizza3.sauce);

        pizza pizza4 = new pizza("thicc crust pizza", "tomato");
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza4.bread);

        //toString method:
        //el metodo se llama de manera implicita cada vez que printeamos un objeto, pero el que esta originalmente unicamente
        //nos devuelve donde se encuentra ese objeto en memoria. Es por esto que normalmente se rescrive el metodo (ver car.java)
        car car = new car();
        System.out.println(car);

        //Object arrays:
        //Food[] refrigerator = new Food[3];

        Food food1 = new Food("pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hotdog");

        Food[] refrigerator = {food1, food2, food3};

        //refrigerator[0] = food1;
        //refrigerator[1] = food2;
        //refrigerator[2] = food3;

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);

        //How to pass objects as argument to other classes
        Garage garage = new Garage();
        Car2 car2 = new Car2("BMW");
        Car2 car3 = new Car2("Tesla");
        garage.park(car2);
        garage.park(car3);
    }
}
