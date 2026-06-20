import com.sun.security.jgss.GSSUtil;

import java.util.*;

class solution22{
    int sumoffirst(int n,int sum){
     if(n==0) return sum;
     sum+=n;
     return sumoffirst(n-1,sum);
    }
}

public class DSA022_SUM_OF_FIRST_N_NATURAL_NUMBERS_USING_RECURSION {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        solution22 sol=new solution22();
        int s =sol.sumoffirst(n,0);
        System.out.println(s);

        sc.close();
    }
}
