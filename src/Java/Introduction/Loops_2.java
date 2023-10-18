package Java.Introduction;

import java.util.Scanner;

public class Loops_2 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int x = 0; x < n; x++) {
                a += (int) Math.pow(2, x) * b;
                System.out.print(a + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
