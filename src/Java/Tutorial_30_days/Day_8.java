package Java.Tutorial_30_days;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entries = Integer.parseInt(scanner.nextLine());

        Map<String, String> phoneBook = new HashMap<>();
        for (int i = 0; i < entries; i++) {
            String name = scanner.next();
            String number = scanner.next();
            phoneBook.put(name, number);
        }

        while (scanner.hasNext()) {
            String name = scanner.next();
            if (phoneBook.containsKey(name)) {
                System.out.printf("%s=%s%n", name, phoneBook.get(name));
            } else {
                System.out.println("Not found");
            }
        }
        scanner.close();
    }
}

