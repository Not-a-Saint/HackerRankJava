package DataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Array1D {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(bufferedReader.readLine()));
        }
        bufferedReader.close();

        for (int i = 0; i < n; i++) {
            System.out.println(a.get(i));
        }
    }
}
