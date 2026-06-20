import java.util.*;

class solutions{
    public void printnto1(int n){
        if(n==0) return;
        System.out.print(n+ " ");
        printnto1(n-1);
    }
}

public class DSA021_PRINT_N_TO_1_USING_RECURSION {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        solutions sol=new solutions();
        sol.printnto1(n);

        sc.close();
    }
}
