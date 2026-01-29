import java.util.*;

public class LeetCode_13_Roman_to_Integer {

    public static void main(String[] args) {   // made static
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            int curr = value(s.charAt(i));
            int next = 0;

            if (i + 1 < s.length()) {
                next = value(s.charAt(i + 1));
            }

            // subtraction rule
            if (curr < next) {
                sum -= curr;
            } else {
                sum += curr;
            }
        }

        System.out.println(sum);
    }

    // helper method added (small change, required)
    static int value(char ch) {
        return (ch == 'I') ? 1 :
                (ch == 'V') ? 5 :
                        (ch == 'X') ? 10 :
                                (ch == 'L') ? 50 :
                                        (ch == 'C') ? 100 :
                                                (ch == 'D') ? 500 :
                                                        (ch == 'M') ? 1000 : 0;
    }
}
