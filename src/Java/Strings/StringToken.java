package Java.Strings;

import java.util.Scanner;

public class StringToken {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String delimiter = "\\W|_|\\s";
        String[] strings = s.split(delimiter);

        int counter = 0;


        for (String string : strings) {
            if (!string.isEmpty()) {
                counter++;
            }
        }
        System.out.println(counter);

        for (String string : strings) {
            if (!string.isEmpty()) {
                System.out.println(string);
            }
        }
        scan.close();
    }
}
