package Java.Tutorial_30_days;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Day_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        String number = Integer.toBinaryString(n);

        String[] arr = number.split("0");

        Arrays.sort(arr);

        System.out.println(arr[arr.length - 1].length());
    }
}
