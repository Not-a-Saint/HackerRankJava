package Java.Strings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SyntaxChecker {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            testCases--;
            try {
                Pattern check = Pattern.compile(pattern);
                System.out.println("Valid");
            }catch (RuntimeException e){
                System.out.println("Invalid");
            }
        }
    }
}
