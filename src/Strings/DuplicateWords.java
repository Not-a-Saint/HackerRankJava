package Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {
    static final String DUPLICATE_REGEX = "\\b(\\w+)(?:\\W+\\1\\b)+";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLine());
        }
        scanner.close();

        Pattern pattern = Pattern.compile(DUPLICATE_REGEX, Pattern.CASE_INSENSITIVE);
        for (String text : list) {
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                text = text.replaceAll(matcher.group(), matcher.group(1));
            }
            System.out.println(text);
        }
    }
}
