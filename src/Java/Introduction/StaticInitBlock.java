package Java.Introduction;

import java.util.Scanner;

public class StaticInitBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int B = scanner.nextInt();
        int H = scanner.nextInt();
        scanner.close();

        try {
            if (B <= 0 || H <= 0) {
                throw new Exception();
            } else {
                System.out.println(H * B);
            }
        } catch (Exception e) {
            System.out.println(e + ": Breadth and height must be positive");
        }
    }
}
