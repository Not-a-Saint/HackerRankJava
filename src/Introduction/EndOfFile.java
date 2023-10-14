package Introduction;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder();
        int lineNumber = 0;
        while (scanner.hasNext()) {
            input.append(++lineNumber).append(" ").append(scanner.nextLine()).append("\n");
        }
        scanner.close();

        System.out.println(input);
    }
}
