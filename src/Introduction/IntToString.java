package Introduction;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        String s = String.valueOf(n);
        System.out.println("Good job");
    }
}
