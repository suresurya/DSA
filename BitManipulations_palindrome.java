import java.util.*;

public class BitManipulations_palindrome {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String b_string=Integer.toBinaryString(Integer.parseInt(s));
        StringBuilder sb=new StringBuilder(b_string);
        String reverse=sb.reverse().toString();
        System.out.println((b_string.equals(reverse))?"Palindrome ":"Not a palindrome");
    }
}
