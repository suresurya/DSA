import java.util.*;

public class Reverse_Digits_of_A_Number {
    void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;

        while (n > 0) {
            int lastdigit = n % 10;
            rev = rev * 10 + lastdigit;
            n = n / 10;
        }

        System.out.print(rev);
    }
}
