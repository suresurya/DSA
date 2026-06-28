import java.util.*;
import java.util.stream.*;

public class DSA036_LEETCODE_9_PALINDROME {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        String s=String.valueOf(Math.abs(n));
//        System.out.println(IntStream
//                .range(0,s.length())
//                .allMatch(i-> s.charAt(i)==s.charAt(s.length()-1-i))
//
//        );
        System.out.println(Math.abs(n));
        sc.close();
    }
}
