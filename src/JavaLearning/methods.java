package JavaLearning;

public class methods {
    public static void main(String[] args) {
        //method => lo mismo que una funcion en python
        hello("Isaac", 21);

        System.out.println(add(3, 4));

        /*
         * Overladed methods => methods that share the same name but use different parameters
         *                      method signature == method names + parameters
         */

        System.out.println(sum(2, 3));
        System.out.println(sum(2, 3, 4));
        System.out.println(sum(2, 3, 6, 8));

        System.out.println(sum(2.5, 3.5));
        System.out.println(sum(2.5, 3.5, 4.5));
        System.out.println(sum(2.5, 3.5, 6.5, 8.5));

    }

    static void hello(String name, int age){    //se tiene que declarar el tipo de dato que sera cada variable. Ademas, si no hay un return se utilizra la palabra void
        System.out.println("hello "+name+" you are "+age);
    }

    static int add(int x, int y) {  //si es que hay un return en el codigo, se tienen que especificar el tipo de dato que se devuelve
        return x + y;
    }

    static int sum(int a, int b) {
        System.out.println("This is the overloaded method #1");
        return a + b;
    }

    static int sum(int a, int b, int c) {
        System.out.println("This is the overloaded method #2");
        return a + b + c;
    }

    static int sum(int a, int b, int c, int d) {
        System.out.println("This is the overloaded method #3");
        return a + b + c + d;
    }

    static double sum(double a, double b) {
        System.out.println("This is the overloaded method #1.2");
        return a + b;
    }

    static double sum(double a, double b, double c) {
        System.out.println("This is the overloaded method #2.2");
        return a + b + c;
    }

    static double sum(double a, double b, double c, double d) {
        System.out.println("This is the overloaded method #3.2");
        return a + b + c + d;
    }
}

