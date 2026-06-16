import java.util.*;

public class DSA014_SUM_OF_THE_DIGITS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

// The absolute fastest formula to find the single-digit sum
        int singleDigitSum = 1 + (n - 1) % 9;
        System.out.println(singleDigitSum);
        sc.close();
    }
}
