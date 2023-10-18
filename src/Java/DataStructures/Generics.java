package Java.DataStructures;

public class Generics {
    static <E> void printArray(E[] array) {
        for (E x : array) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        printArray(intArray);
        printArray(stringArray);
    }
}
