package JavaLearning;

public class staticKeword {
    public static void main(String[] args) {
        // static =>    A modifier. A single copy of a variable/method is created and shared.
        //              The class "owns" the static member
        System.out.println(Friend.numberOfFriends);     //como pertenece a la clase principal por tener el static no necesitamos crear una instancia de la clase para llamar a la variable

        Friend friend1 = new Friend("Spongebob");

        System.out.println(Friend.numberOfFriends);

        Friend friend2 = new Friend("Patrick");

        System.out.println(Friend.numberOfFriends);     //Se podria acceder tambien por los objetos al valor de la variable pero es mejor hacerlo desde la clase

        Friend.displayFriends();    //Como es un metodo static podemos acceder a el desde el nombre de la clase y es unico y compartido por todos los objetos de esta clase

        System.out.println(friend1);
        System.out.println(friend2);//solo pa que se quite el aviso
    }
}

class Friend {
    String name;
    static int numberOfFriends;

    Friend(String name) {
        this.name = name;
        numberOfFriends++;      //De esta manera cada vez que se instancie la clase se sumara uno al numero de amigos
    }

    static void displayFriends() {
        System.out.println("You have "+numberOfFriends+" friends");
    }
}