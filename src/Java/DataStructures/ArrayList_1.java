package Java.DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_1 {
    static final String INSERT = "Insert";
    static final String DELETE = "Delete";

    static void printList(List<Integer> list) {
        for (Integer x : list) {
            System.out.print(x + " ");
        }
    }

    static void updateList(List<Integer> list, Scanner scanner) {
        String command = scanner.nextLine();
        switch (command) {
            case INSERT -> list.add(scanner.nextInt(), scanner.nextInt());
            case DELETE -> list.remove(scanner.nextInt());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(scanner.nextInt());
        }

        int queries = scanner.nextInt();
        for (int i = 0; i < queries; i++) {
            scanner.nextLine();
            updateList(list, scanner);
        }
        printList(list);
    }
}
