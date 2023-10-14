package Strings;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();

        StringBuilder stringBuilder = new StringBuilder(A);
        stringBuilder.reverse();

        if (A.contentEquals(stringBuilder)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
