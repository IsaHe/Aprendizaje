package JavaLearning;

public class miscelaneus {
    public static void main(String[] args) {
        //todo lo que se guarde con la palabra "final" no podra ser cambiado
        //final double PI = 3.14159;    //generalmente se pone todo el nombre de la variable en mayuscula

        // la keword abstact nos permite añadir una estecie de "seguridad" a nuestro codogo.
        // cuando es aplicado a una clase, nos inpide el uso de la misma y se tendran que usar las clases que hereden de esta
        // cuando es aplicaco a un metodo nos fuerza a aplicar el metodo en todas las clases que hereden de esta mediante un override

        //Access modifiers:
        //
        //  Modifier    Class   Package Subclass    World
        //  public        Y        Y       Y          Y
        //  protected     Y        Y       Y          N
        //  no mod        Y        Y       N          N
        //  private       Y        N       N          N
    }
}
 