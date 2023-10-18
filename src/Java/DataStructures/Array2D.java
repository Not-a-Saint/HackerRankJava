package Java.DataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Array2D {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        int biggest = getBiggest(arr);
        System.out.println(biggest);

    }

    static int getBiggest(List<List<Integer>> arr) {
        int biggest = 0;

        for (int i = 0; i < arr.size() - 2; i++) {

            for (int m = 0; m < arr.size() - 2; m++) {
                int amount = 0;
                amount += arr.get(i).get(m) + arr.get(i).get(m + 1) + arr.get(i).get(m + 2);
                amount += arr.get(i + 1).get(m + 1);
                amount += arr.get(i + 2).get(m) + arr.get(i + 2).get(m + 1) + arr.get(i + 2).get(m + 2);

                if (i == 0 & m == 0) {
                    biggest = amount;
                }
                if (amount > biggest) {
                    biggest = amount;
                }
            }
        }
        return biggest;
    }
}
