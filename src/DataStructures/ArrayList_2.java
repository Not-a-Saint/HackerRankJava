package DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowsAmount = scanner.nextInt();
        List<List<Integer>> list = new ArrayList<>(rowsAmount);

        for (int i = 0; i < rowsAmount; i++) {
            int numbersAmount = scanner.nextInt();
            List<Integer> numbers = new ArrayList<>(numbersAmount);
            for (int n = 0; n < numbersAmount; n++) {
                numbers.add(scanner.nextInt());
            }
            list.add(numbers);
        }

        int checks = scanner.nextInt();
        for (int i = 0; i < checks; i++) {
            int row = scanner.nextInt() - 1;
            int column = scanner.nextInt() - 1;

            try {
                System.out.println(list.get(row).get(column));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
        scanner.close();
    }
}
