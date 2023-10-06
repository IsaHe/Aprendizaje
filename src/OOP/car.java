package OOP;

public class car {
    //Attributes:
    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "blue";
    double price = 50000.00;

    //Methods:
    void drive() {
        System.out.println("You drive the car");
    }

    void brake() {
        System.out.println("You step on the breack");
    }

    public String toString() {
        return make+"\n"+model+"\n"+color+"\n"+year;
    }
}
