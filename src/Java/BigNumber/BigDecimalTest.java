package Java.BigNumber;

import java.math.BigDecimal;
import java.util.*;

public class BigDecimalTest {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            s.add(sc.next().trim());
        }
        sc.close();

        //Sort array comparing string as BigDecimal
        s.sort((String s1, String s2) -> {
            BigDecimal d1 = new BigDecimal(s1);
            BigDecimal d2 = new BigDecimal(s2);
            return d2.compareTo(d1);
        });


        //Print sorted array
        for (String s1 : s){
            System.out.println(s1);
        }
    }
}



