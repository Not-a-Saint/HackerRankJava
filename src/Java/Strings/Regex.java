package Java.Strings;

import java.util.Scanner;

public class Regex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    String pattern = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" + "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
}