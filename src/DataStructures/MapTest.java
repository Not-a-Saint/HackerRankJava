package DataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entries = Integer.parseInt(scanner.nextLine());

        Map<String, String> phoneBook = new HashMap<>();
        for (int i = 0; i < entries; i++) {
            String name = scanner.nextLine();
            String number = scanner.nextLine();
            phoneBook.put(name, number);
        }

        while (scanner.hasNext()) {
            String name = scanner.nextLine();
            if (phoneBook.containsKey(name)) {
                System.out.printf("%s=%s%n", name, phoneBook.get(name));
            } else {
                System.out.println("Not found");
            }
        }
        scanner.close();
    }
}
