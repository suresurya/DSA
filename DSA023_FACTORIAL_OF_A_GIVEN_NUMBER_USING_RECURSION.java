import java.util.*;

class solution23{
    int fact(int n ){
        if(n==1) return 1;
        return n*fact(n-1);
    }
}
public class DSA023_FACTORIAL_OF_A_GIVEN_NUMBER_USING_RECURSION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        solution23 sol=new solution23();
        System.out.println(sol.fact(n));
        sc.close();

    }
}
