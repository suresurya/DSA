import java.util.*;
class solution26{
    void fabonacci(int a,int b,int n){
        if(n==0) return ;
        System.out.print((a+b)+ " ");
        int c=a;
        a=b;
        b=c+b;
        fabonacci(a,b,n-1);
    }
}
public class DSA026_PRINTING_FABONACCI_SERIES_USING_RECURSION {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(0+" "+1+" ");
        solution26 sol=new solution26();
        sol.fabonacci(0,1,n-2);

        sc.close();
    }
}
