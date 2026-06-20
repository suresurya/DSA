import java.util.*;

class solution{
    public void print1ton(int i,int n){
        if(i==n+1) return;
        System.out.print(i+" ");
        print1ton(i+1,n);
    }


}

public class DSA020_PRINT_1_TO_N_USING_RECURSION {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        solution sol=new solution();
        sol.print1ton(1,n);


        sc.close();
    }
}
