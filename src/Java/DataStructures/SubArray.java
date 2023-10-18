package Java.DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        scanner.close();

        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (list.get(i) < 0) {
                counter++;
            }

            int sum = list.get(i);
            for (int m = i + 1; m < n; m++) {
                if (sum + list.get(m) < 0) {
                    counter++;
                }
                sum = sum + list.get(m);
            }
        }
        System.out.println(counter);
    }
}
