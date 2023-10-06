package JavaLearning;

public class stringmethods {
    public static void main(String[] args) {
        String name = "       Isaa   ";
        name += "Hola";

        boolean result = name.equals("Isaa");
        System.out.println(result);
        result = name.equalsIgnoreCase("isaa");
        System.out.println(result);

        int longitud = name.length();
        System.out.println(longitud);

        char letra = name.charAt(2);
        System.out.println(letra);

        int localizacion = name.indexOf("a");
        System.out.println(localizacion);

        result = name.isEmpty();        //mira si el str es ""
        System.out.println(result);

        String mayusicula = name.toUpperCase();
        System.out.println(mayusicula);
        mayusicula = name.toLowerCase();
        System.out.println(mayusicula);

        mayusicula = name.trim();       //quita los espacios
        System.out.println(mayusicula);

        mayusicula = name.replace("I", "s");
        System.out.println(mayusicula);
    }
}
