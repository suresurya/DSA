import java.util.*;
import java.util.stream.*;
public class DSA019_PRINT_NAME_N_TIMES_USING_RECURSION {
    static void printname(String s,int i,int n){
        if(i==n+1) return ;
        System.out.println(s+" ");
        printname(s, i+1, n);
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        printname("Sure Surya ",1,n);

        sc.close();
    }
}
