package OOP;

public class encapsulation {
    public static void main(String[] args) {
        Coche coche = new Coche("Chevrolet", "Camaro", 2021);

        //System.out.println(coche.make);   Todas las variables estan escondidas de la principal. Para acceder a ellas ha que usar setters y getters.

        coche.setYear(1999);

        //Coche coche2 = new Coche(null, null, 0);  //Se puede hacer en dos lineas de esta manera pero tb se pueden hacer a la vez on overloaded constructors
        //coche2.copy(coche);
        Coche coche2 = new Coche(coche);

        System.out.println(coche);
        System.out.println(coche2);
        System.out.println();
        System.out.println(coche.getMake());
        System.out.println(coche.getModel());
        System.out.println(coche.getYear());
        System.out.println();
        System.out.println(coche2.getMake());
        System.out.println(coche2.getModel());
        System.out.println(coche2.getYear());
    }
}
