package OOP;

public class inheritance {
    public static void main(String[] args) {
        Car3 car = new Car3();
        car.go();

        bicicle bike = new bicicle();
        bike.stop();

        System.out.println(car.speed);
        System.out.println(bike.speed);

        System.out.println(car.doors);
        System.out.println(bike.peddels);
    }
}

class vehicule{
    double speed;

    void go() {
        System.out.println("This vehicule is moving");
    }

    void stop() {
        System.out.println("This vehicule is stopped");
    }
}

class Car3 extends vehicule{
    int wheels = 4;
    int doors = 4;

    @Override
    void go() {
        System.out.println("The car is moving");
    }
}

class bicicle extends vehicule{
    int wheels = 2;
    int peddels = 2;

    @Override       //Asi es comop se reescriven el override solo sirve para avisar a quien lea el codigo. Solo se aplica a esta clase
    void go() {
        System.out.println("You are peddaling");
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return this.name+"\n"+this.age+"\n";
    }
}

class Hero extends Person {
    String powers;

    Hero(String name, int age, String powers) {
        super(name, age);   //con super() podemos llamar al constructor de la clase padre
        this.powers = powers;
    }
    public String toString() {
        return super.toString()+"\n"+this.powers+"\n";  //tambien se puede usar para llamar metodos PUBLICOS con la keword super
    }
}
