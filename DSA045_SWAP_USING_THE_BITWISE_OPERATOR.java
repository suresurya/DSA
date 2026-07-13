import java.util.*;

public class DSA045_SWAP_USING_THE_BITWISE_OPERATOR {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a =sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a+ " "+b);
        a=a^b;
        b=b^a;
        a=b^a;
        System.out.println(a+ " "+b);
        sc.close();
    }
}
