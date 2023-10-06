package JavaLearning;

public class GenericMth {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
        String[] stringArray = {"B", "Y", "E"};

        System.out.println(gerFirst(intArray));
        System.out.println(gerFirst(doubleArray));
        System.out.println(gerFirst(charArray));
        System.out.println(gerFirst(stringArray));

    }

    public static <T> void displayArray(T[] array) {
            for (T t : array) {
                System.out.println(t + " ");
            }
            System.out.println();
    }

    public static <T> T gerFirst(T[] array) {
        return array[0];
}
}
