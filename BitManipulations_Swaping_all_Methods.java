import java.util.*;

public class BitManipulations_Swaping_all_Methods {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Swapping two numbers using XOR method (Bit Manipulation)");

        System.out.print("Enter the a value: ");
        int a = sc.nextInt();

        System.out.print("Enter the b value: ");
        int b = sc.nextInt();

        System.out.println("Before Swapping  a: " + a + "  b: " + b);

        // XOR Swapping
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swapping   a: " + a + "  b: " + b);
        sc.close();
    }
}
