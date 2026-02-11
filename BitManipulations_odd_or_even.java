import java.util.Scanner;

public class BitManipulations_odd_or_even {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println((n& 1)==1?n+" is a odd number ": n+ " is a even number ");
    }
}
