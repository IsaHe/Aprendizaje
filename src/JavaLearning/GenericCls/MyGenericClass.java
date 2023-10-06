package JavaLearning.GenericCls;

public class MyGenericClass <T extends Number> {   //Se puede poner mas de un objeto dentro de los <>, con el extends le decimos que solo acepte datatypes de una clase cuyo parent sea de number, en este caso.
    T x;

    public MyGenericClass(T x) {
        this.x = x;
    }

    public T getX() {
        return x;
    }
    
}
