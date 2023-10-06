package OOP;

import java.util.Scanner;

public class polymorfismo {
    public static void main(String[] args) {
        // La capacidad de un objeto para pertenecer a mas de un tipo de dato
        Car3 car = new Car3();
        bicicle bicicle = new bicicle();
    
        vehicule[] racers = {car, bicicle}; //Si queremos guardar dos tipos de datos differentes, podemos crear un array de la clase que sea padre de ambas

        for (vehicule x : racers) {
            x.go(); //tambien podemos llamar  con los foreach lo del polimorfismo
        }

        // Se puede asignar un espacio de memoria a un dato que no estemos completamente seguros de su tipo concreto. Solo la clase de la que hereda
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal yu want?");
        System.out.print("(1 = dog) (2 = cat): ");
        int choice = scanner.nextInt();

        if(choice == 1) {
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2) {
            animal = new Cat();
            animal.speak();
        }
        else {
            animal = new Animal();
            System.out.println("That choice was invalid");
            animal.speak();
        }

        scanner.close();
    }
}

class Animal {
    void speak() {
        System.out.println("Animal goes *brr*");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog goes *guau*");
    }
}

class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("Cat goes *miau*");
    }
}
