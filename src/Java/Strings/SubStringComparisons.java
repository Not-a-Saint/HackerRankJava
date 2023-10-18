package Java.Strings;

import java.util.Scanner;

public class SubStringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        int maxLength = s.length() - k;
        String smallest =s.substring(0, k);
        String largest =s.substring(0, k);

        for (int i = 0; i <= maxLength; i++) {
            String sub = s.substring(i, i + k);

            if (smallest.compareTo(sub) > 0) {
                smallest = sub;
            }
            if (largest.compareTo(sub) < 0) {
                largest = sub;
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
