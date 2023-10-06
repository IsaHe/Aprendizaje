package OOP;

public class Human {
    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {
        this.name = name;       // se utiliza this para acceder a las variables de la clase en constructores o metodos
        this.age = age;
        this.weight = weight;
    }

    void eat() {
        System.out.println(this.name+" is eating");
    }
    void drink() {
        System.out.println(this.name+" is drinking *burp*");
    }
}
