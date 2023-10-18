package Java.Tutorial_30_days;

import java.util.Scanner;

public class Day_6 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int caseAmount = scanner.nextInt();
    scanner.nextLine();
    for (int i = 0; i < caseAmount; i++) {
        String string = scanner.nextLine();
        System.out.println(StringSpliter.splitString(string));
    }
}
}

class StringSpliter {
    static String splitString(String string) {
        StringBuilder stringBuilderEven = new StringBuilder();
        StringBuilder stringBuilderOdd = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (i % 2 == 0) {
                stringBuilderEven.append(string.charAt(i));
            } else {
                stringBuilderOdd.append(string.charAt(i));
            }
        }
        return stringBuilderEven + " " + stringBuilderOdd;
    }

}