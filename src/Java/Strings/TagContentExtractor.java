package Java.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    static final String TAG_REGEX = "<(.+)>([^<]+)<(/\\1)>";

    public static void main(String[] args) {

        //Input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLine());
        }
        scanner.close();

        Pattern tagPattern = Pattern.compile(TAG_REGEX);

        for (String s : list) {
            Matcher matcher = tagPattern.matcher(s);
            if (matcher.find()) {
                matcher.reset();
                while (matcher.find()) {
                    String content = matcher.group(2);
                    System.out.println(content);
                }
            } else {
                System.out.println("None");
            }
        }
    }
}

